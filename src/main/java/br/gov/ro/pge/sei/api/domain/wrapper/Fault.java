package br.gov.ro.pge.sei.api.domain.wrapper;

public class Fault {

	private String faultcode;
	private String faultstring;
	private Detail detail;

	/**
	 * @return the faultcode
	 */
	public String getFaultcode() {
		return faultcode;
	}

	/**
	 * @param faultcode
	 *            the faultcode to set
	 */
	public void setFaultcode(String faultcode) {
		this.faultcode = faultcode;
	}

	/**
	 * @return the faultstring
	 */
	public String getFaultstring() {
		return faultstring;
	}

	/**
	 * @param faultstring
	 *            the faultstring to set
	 */
	public void setFaultstring(String faultstring) {
		this.faultstring = faultstring;
	}

	/**
	 * @return the detail
	 */
	public Detail getDetail() {
		return detail;
	}

	/**
	 * @param detail
	 *            the detail to set
	 */
	public void setDetail(Detail detail) {
		this.detail = detail;
	}

}
