package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serieWS", propOrder = {
    "idSerie",
    "nome",
    "aplicabilidade"
})
public class SerieWS {

	private Long idSerie;
	private String nome;
	private String aplicabilidade;

	/**
	 * @return the idSerie
	 */
	public Long getIdSerie() {
		return idSerie;
	}

	/**
	 * @param idSerie
	 *            the idSerie to set
	 */
	public void setIdSerie(Long idSerie) {
		this.idSerie = idSerie;
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
	 * @return the aplicabilidade
	 */
	public String getAplicabilidade() {
		return aplicabilidade;
	}

	/**
	 * @param aplicabilidade
	 *            the aplicabilidade to set
	 */
	public void setAplicabilidade(String aplicabilidade) {
		this.aplicabilidade = aplicabilidade;
	}

}
