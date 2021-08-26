package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "destinatarioWS", propOrder = {
    "idDestinatario",
	"sigla",
    "nome"
})
public class DestinatarioWS {

	@XmlElement(required = false)
	private Long idDestinatario;

	@XmlElement(required = true)
	private String sigla;

	@XmlElement(required = true)
	private String nome;

	/**
	 * @return the idDestinatario
	 */
	public Long getIdDestinatario() {
		return idDestinatario;
	}

	/**
	 * @param idDestinatario
	 *            the idDestinatario to set
	 */
	public void setIdDestinatario(Long idDestinatario) {
		this.idDestinatario = idDestinatario;
	}

	/**
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla
	 *            the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
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

}