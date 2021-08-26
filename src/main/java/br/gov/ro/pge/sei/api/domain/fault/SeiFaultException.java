package br.gov.ro.pge.sei.api.domain.fault;

import javax.xml.ws.WebFault;

@WebFault(name = "SeiFaultException", targetNamespace = "http://ws.memora.com.br/Sei")
public class SeiFaultException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2672687213016956488L;

	private FaultWS faultWS;

	public SeiFaultException(String message) {
		// --
		super(message);
	}

	public SeiFaultException(String message, Throwable cause) {
		// --
		super(message, cause);
	}

	public SeiFaultException(Throwable cause) {
		// --
		super(cause);
	}

	public SeiFaultException(Integer code, String userMessage) {
		// --
		super(userMessage);
		// --
		this.faultWS = new FaultWS();
		this.faultWS.setErrorCode(code);
		this.faultWS.setDeveloperMessage(userMessage);
		this.faultWS.setUserMessage(userMessage);
	}

	public SeiFaultException(Integer code, String developerMessage,
			String userMessage) {
		// --
		super(developerMessage);
		// --
		this.faultWS = new FaultWS();
		this.faultWS.setErrorCode(code);
		this.faultWS.setDeveloperMessage(developerMessage);
		this.faultWS.setUserMessage(userMessage);
	}

	public SeiFaultException(FaultWS faultWS) {
		// --
		super(faultWS.getDeveloperMessage());
		this.faultWS = faultWS;
	}

	public SeiFaultException(String message, FaultWS faultWS) {
		// --
		super(message);
		this.faultWS = faultWS;
	}

	public SeiFaultException(String message, FaultWS faultWS,
			Throwable cause) {
		// --
		super(message, cause);
		this.faultWS = faultWS;
	}

	public FaultWS getFaultInfo() {
		return faultWS;
	}
}
