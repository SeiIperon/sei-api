package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assuntoWS", propOrder = {
	"idAssunto",
    "codigoEstruturado",
    "descricao"
})
public class AssuntoWS {

	@XmlElement(required = false)
	private Long idAssunto;

	@XmlElement(required = true)
	private String codigoEstruturado;

	@XmlElement(required = false)
	private String descricao;

	/**
	 * @return the idAssunto
	 */
	public Long getIdAssunto() {
		return idAssunto;
	}

	/**
	 * @param idAssunto
	 *            the idAssunto to set
	 */
	public void setIdAssunto(Long idAssunto) {
		this.idAssunto = idAssunto;
	}

	/**
	 * @return the codigoEstruturado
	 */
	public String getCodigoEstruturado() {
		return codigoEstruturado;
	}

	/**
	 * @param codigoEstruturado
	 *            the codigoEstruturado to set
	 */
	public void setCodigoEstruturado(String codigoEstruturado) {
		this.codigoEstruturado = codigoEstruturado;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}