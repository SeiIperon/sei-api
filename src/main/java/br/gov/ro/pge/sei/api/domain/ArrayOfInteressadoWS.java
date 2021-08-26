package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfInteressadoWS", propOrder = {
    "interessado"
})
public class ArrayOfInteressadoWS {

	@XmlElement(required = true)
	private List<InteressadoWS> interessado;

	public ArrayOfInteressadoWS() {

	}

	/**
	 * @param interessado
	 */
	public ArrayOfInteressadoWS(List<InteressadoWS> interessado) {
		this.interessado = interessado;
	}

	/**
	 * @return the interessado
	 */
	public List<InteressadoWS> getInteressado() {
		return interessado;
	}

	/**
	 * @param interessado
	 *            the interessado to set
	 */
	public void setInteressado(List<InteressadoWS> interessado) {
		this.interessado = interessado;
	}
}
