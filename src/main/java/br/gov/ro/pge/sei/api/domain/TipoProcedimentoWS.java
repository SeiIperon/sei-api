package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoProcedimentoWS", propOrder = {
    "idTipoProcedimento",
    "nome",
    "descricao"
})
public class TipoProcedimentoWS {

	private Long idTipoProcedimento;
	private String nome;
	private String descricao;

	/**
	 * @return the idTipoProcedimento
	 */
	public Long getIdTipoProcedimento() {
		return idTipoProcedimento;
	}

	/**
	 * @param idTipoProcedimento
	 *            the idTipoProcedimento to set
	 */
	public void setIdTipoProcedimento(Long idTipoProcedimento) {
		this.idTipoProcedimento = idTipoProcedimento;
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
