package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfAssuntoWS", propOrder = {
    "assunto"
})
public class ArrayOfAssuntoWS {

	@XmlElement(required = true)
	private List<AssuntoWS> assunto;

	public ArrayOfAssuntoWS() {
		
	}

	/**
	 * @param assunto
	 */
	public ArrayOfAssuntoWS(List<AssuntoWS> assunto) {
		this.assunto = assunto;
	}

	/**
	 * @return the assunto
	 */
	public List<AssuntoWS> getAssunto() {
		return assunto;
	}

	/**
	 * @param assunto
	 *            the assunto to set
	 */
	public void setAssunto(List<AssuntoWS> assunto) {
		this.assunto = assunto;
	}
}
