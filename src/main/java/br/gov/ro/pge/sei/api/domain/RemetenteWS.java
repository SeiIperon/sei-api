package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remetenteWS", propOrder = {
    "idRemetente",
	"sigla",
    "nome"
})
public class RemetenteWS {
	
	@XmlElement(required = true)
	private Long idRemetente;

	@XmlElement(required = true)
	private String sigla;

	@XmlElement(required = true)
	private String nome;

	/**
	 * @return the idRemetente
	 */
	public Long getIdRemetente() {
		return idRemetente;
	}

	/**
	 * @param idRemetente
	 *            the idRemetente to set
	 */
	public void setIdRemetente(Long idRemetente) {
		this.idRemetente = idRemetente;
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