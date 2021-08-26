package br.gov.ro.pge.sei.api.domain.fault;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.http.HttpStatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faultWS", propOrder = {
    "errorCode",
    "developerMessage",
    "userMessage",
    "moreInfo"
})
public class FaultWS {
	
	private Integer errorCode;
	private String developerMessage;
	private String userMessage;
	private List<String> moreInfo;

	public FaultWS() {
	}

	/**
	 * @return the errorCode
	 */
	public Integer getErrorCode() {
		if (ObjectUtils.isEmpty(this.errorCode)) {
			this.errorCode = HttpStatus.INTERNAL_SERVER_ERROR.value();
		}
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
	 */
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the developerMessage
	 */
	public String getDeveloperMessage() {
		if (ObjectUtils.isEmpty(this.developerMessage)) {
			this.developerMessage = HttpStatus.valueOf(this.getErrorCode()).getReasonPhrase();
		}
		return developerMessage;
	}

	/**
	 * @param developerMessage
	 *            the developerMessage to set
	 */
	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	/**
	 * @return the userMessage
	 */
	public String getUserMessage() {
		if (ObjectUtils.isEmpty(this.userMessage)) {
			this.userMessage = HttpStatus.valueOf(this.getErrorCode()).getReasonPhrase();
		}
		return userMessage;
	}

	/**
	 * @param userMessage
	 *            the userMessage to set
	 */
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

	/**
	 * @return the moreInfo
	 */
	public List<String> getMoreInfo() {
		if (ObjectUtils.isEmpty(this.moreInfo)) {
			this.moreInfo = new ArrayList<String>();
		}
		return moreInfo;
	}

	/**
	 * @param moreInfo
	 *            the moreInfo to set
	 */
	public void setMoreInfo(List<String> moreInfo) {
		this.moreInfo = moreInfo;
	}
}
