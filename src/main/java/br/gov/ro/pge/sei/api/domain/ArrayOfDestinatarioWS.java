package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfDestinatarioWS", propOrder = {
    "destinatario"
})
public class ArrayOfDestinatarioWS {

	private List<DestinatarioWS> destinatario;

	/**
	 * @return the destinatario
	 */
	public List<DestinatarioWS> getDestinatario() {
		return destinatario;
	}

	/**
	 * @param destinatario
	 *            the destinatario to set
	 */
	public void setDestinatario(List<DestinatarioWS> destinatario) {
		this.destinatario = destinatario;
	}
}
