package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfCampoWS", propOrder = {
    "campo"
})
public class ArrayOfCampoWS {

	private List<CampoWS> campo;

	public ArrayOfCampoWS() {

	}

	/**
	 * @param campo
	 */
	public ArrayOfCampoWS(List<CampoWS> campo) {
		this.campo = campo;
	}

	/**
	 * @return the campo
	 */
	public List<CampoWS> getCampo() {
		return campo;
	}

	/**
	 * @param campo
	 *            the campo to set
	 */
	public void setCampo(List<CampoWS> campo) {
		this.campo = campo;
	}
}
