package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "interessadoWS", propOrder = {
    "idInteressado",
	"sigla",
    "nome"
})
public class InteressadoWS {

	@XmlElement(required = false)
	private Long idInteressado;

	@XmlElement(required = true)
	private String sigla;

	@XmlElement(required = true)
	private String nome;

	/**
	 * @return the idInteressado
	 */
	public Long getIdInteressado() {
		return idInteressado;
	}

	/**
	 * @param idInteressado
	 *            the idInteressado to set
	 */
	public void setIdInteressado(Long idInteressado) {
		this.idInteressado = idInteressado;
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