package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grupoSerieWS", propOrder = {
    "idGrupoSerie",
    "nome",
    "sinAtivo",
    "descricao"
})
public class GrupoSerieWS {

	private Long idGrupoSerie;
	private String nome;
	private String sinAtivo;
	private String descricao;

	/**
	 * @return the idGrupoSerie
	 */
	public Long getIdGrupoSerie() {
		return idGrupoSerie;
	}

	/**
	 * @param idGrupoSerie
	 *            the idGrupoSerie to set
	 */
	public void setIdGrupoSerie(Long idGrupoSerie) {
		this.idGrupoSerie = idGrupoSerie;
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
	 * @return the sinAtivo
	 */
	public String getSinAtivo() {
		return sinAtivo;
	}

	/**
	 * @param sinAtivo
	 *            the sinAtivo to set
	 */
	public void setSinAtivo(String sinAtivo) {
		this.sinAtivo = sinAtivo;
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
