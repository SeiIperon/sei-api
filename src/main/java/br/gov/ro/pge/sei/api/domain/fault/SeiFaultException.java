package br.gov.ro.pge.sei.api.domain.fault;

import lombok.Getter;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpStatus;

public class SeiFaultException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2672687213016956488L;

	@Getter private FaultWS fault = FaultWS.builder().build();

	public SeiFaultException(Integer httpCode) {
		this.fault.setStatusCode(httpCode);
	}

	public SeiFaultException(Integer httpCode, String userMessage) {
		super(userMessage);
		this.fault.setStatusCode(httpCode);
		this.fault.setUserMessage(userMessage);
		this.fault.setDeveloperMessage(userMessage);
	}

	public SeiFaultException(Integer httpCode, String developerMessage, String userMessage) {
		super(developerMessage);
		this.fault.setStatusCode(httpCode);
		this.fault.setUserMessage(userMessage);
		this.fault.setDeveloperMessage(developerMessage);
	}

	public SeiFaultException(Integer httpCode, String userMessage, Throwable cause) {
		super(userMessage, cause);
		this.fault.setStatusCode(httpCode);
		this.fault.setUserMessage(userMessage);
		this.fault.setDeveloperMessage(ExceptionUtils.getStackTrace(cause));
	}

	public SeiFaultException(Integer httpCode, String developerMessage, String userMessage, Throwable cause) {
		super(userMessage, cause);
		this.fault.setStatusCode(httpCode);
		this.fault.setUserMessage(userMessage);
		this.fault.setDeveloperMessage(developerMessage);
		this.fault.getDetails().add(ExceptionUtils.getStackTrace(cause));
	}

	public SeiFaultException(Throwable cause) {
		super(cause);
		this.fault.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		this.fault.setUserMessage("Operação inválida! Ocorreu um erro ao executar a operação.");
		this.fault.setDeveloperMessage(ExceptionUtils.getStackTrace(cause));
	}
}
