package br.gov.ro.pge.sei.api.util;

import br.gov.ro.pge.sei.api.domain.fault.SeiFaultException;
import br.gov.ro.pge.sei.api.domain.wrapper.Envelope;
import br.gov.ro.pge.sei.api.message.Message;
import br.gov.ro.pge.sei.api.ws.soap.Attachment;
import br.gov.ro.pge.sei.api.ws.soap.InputStreamDataSource;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;

import javax.activation.DataHandler;
import javax.annotation.PostConstruct;
import javax.xml.soap.*;
import java.io.ByteArrayInputStream;

@Component
public final class SOAPUtils {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SOAPUtils.class);

	private static String ENDPOINT;

	@Value("${br.gov.ro.pge.sei.api.ws.url}") private String url;

	@PostConstruct
	private void init() {
		SOAPUtils.ENDPOINT = url;
	}
	
	public static String call(String content) throws SeiFaultException {
		return call(content, null);
	}

	public static String call(String messageBody, Attachment attachment) throws SeiFaultException {
		if (ObjectUtils.isEmpty(messageBody)) {
			throw new SeiFaultException(500, "O corpo da mensagem é obrigatório.", Message.MNE00001);
		}
		try {
			SOAPConnectionFactory factory = SOAPConnectionFactory.newInstance();
	        SOAPConnection connection = factory.createConnection();
	        
	        MimeHeaders headers = new MimeHeaders();
	        headers.addHeader("SOAPAction", "SeiAction");
	        headers.addHeader("Content-Type", "text/xml; charset=UTF-8");
	        
			MessageFactory messageFactory = MessageFactory.newInstance();
			SOAPMessage message = messageFactory.createMessage(headers,
					(new ByteArrayInputStream(messageBody.getBytes("UTF-8"))));
	        
			if (!ObjectUtils.isEmpty(attachment) && attachment.isMTOM()) {
				AttachmentPart attachmentPart = message.createAttachmentPart();
				attachmentPart.setContentId("<" + attachment.getContentId() + ">");
				attachmentPart.setDataHandler(new DataHandler(
						new InputStreamDataSource(attachment.getFilename(),
								attachment.getData())));
				message.addAttachmentPart(attachmentPart);
			}
	        SOAPMessage response = connection.call(message, SOAPUtils.ENDPOINT);
	        Document document = response.getSOAPBody().getOwnerDocument();
	        return containsError(XMLUtils.getDocumentAsString(document));
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			if (e instanceof SeiFaultException) {
				throw (SeiFaultException) e;
			}
			throw new SeiFaultException(400, e.getMessage(), Message.MNE00001);
		}
	}
	
	private static String containsError(String content) throws SeiFaultException {
		boolean containsFault = StringUtils.hasMatch("SOAP-ENV:Fault", content);
		if (containsFault) {

			Envelope fault 		= XMLStream.DESERIALIZED.getFault(content);
			String faultcode 	= fault.getBody().getFault().getFaultcode();
			String faultstring 	= fault.getBody().getFault().getFaultstring();

			if (faultcode.equalsIgnoreCase("SOAP-ENV:Client")) {
				throw new SeiFaultException(400, faultstring, faultstring);
			} else {
				throw new SeiFaultException(500, faultstring, faultstring);
			}
		}
		return content;
	}
}
