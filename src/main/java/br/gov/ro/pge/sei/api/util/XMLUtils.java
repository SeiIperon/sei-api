/**
 * 
 */
package br.gov.ro.pge.sei.api.util;

import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author janon.sousa
 * 
 */
public class XMLUtils {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(XMLUtils.class);
	
	private static final String XOP_INCLUDE_ELEMENT = "<inc:Include href=\"cid:CONTENT_ID\" xmlns:inc=\"http://www.w3.org/2004/08/xop/include\"/>";
	
	public static String getDocumentAsString(Document document) {
		if (ObjectUtils.isEmpty(document)) {
			throw new IllegalArgumentException("Document is null");
		}
		String output = null;
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			StringWriter writer = new StringWriter();
			transformer.transform(new DOMSource(document), new StreamResult(writer));
			output = writer.getBuffer().toString();
		} catch (TransformerException e) {
			LOGGER.warn(e.getMessage(), e);
			throw new RuntimeException(e.getMessage());
		}
		return output;
	}
	
	public static Document getStringAsXmlDocument(String xml) {
		if (ObjectUtils.isEmpty(xml)) {
			throw new IllegalArgumentException("Object is null");
		}
		Document doc = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setValidating(true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource sourceXML = new InputSource(new StringReader(xml));
			doc = db.parse(sourceXML);
		} catch (ParserConfigurationException e) {
			LOGGER.warn(e.getMessage(), e);
			throw new RuntimeException(e.getMessage());
		} catch (SAXException e) {
			LOGGER.warn(e.getMessage(), e);
			throw new RuntimeException(e.getMessage());
		} catch (IOException e) {
			LOGGER.warn(e.getMessage(), e);
			throw new RuntimeException(e.getMessage());
		}
		return doc;
	}
	
	public static String readXMLFile(String pathname) {
		String output = null;
		try {
			File fXmlFile = new File(pathname);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			StringWriter writer = new StringWriter();
			transformer.transform(new DOMSource(doc), new StreamResult(writer));
			output = writer.getBuffer().toString();
			return output;
		} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
		} catch (SAXException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (TransformerException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static String deleteElement(String str, String tagName) {
		StringBuilder sb = new StringBuilder(str);
		String[] src = StringUtils.hasIndexMatch(tagName, str);
		sb.replace(Integer.valueOf(src[0]) - 1, Integer.valueOf(src[1]) + 1, "");
		return sb.toString();
	}
	
	/**
	 * The special <xop:Include> element that references the relevant MIME
	 * attachment using a URI.
	 * 
	 * @return The <xop:Include> element references the binary attachment.
	 */
	public static String getElementXOP(String contentId) {
		return StringUtils.replace(XMLUtils.XOP_INCLUDE_ELEMENT, "CONTENT_ID",
				contentId);
	}
}
