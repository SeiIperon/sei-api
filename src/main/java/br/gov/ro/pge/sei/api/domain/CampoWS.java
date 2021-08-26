package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "campoWS", propOrder = {
	"idCampo",
    "nome",
    "valor"
})
public class CampoWS {

	@XmlElement(required = false)
	private Long idCampo;

	@XmlElement(required = false)
	private String nome;

	@XmlElement(required = false)
	private String valor;

	/**
	 * @return the idCampo
	 */
	public Long getIdCampo() {
		return idCampo;
	}

	/**
	 * @param idCampo
	 *            the idCampo to set
	 */
	public void setIdCampo(Long idCampo) {
		this.idCampo = idCampo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

}