/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * @author janon.sousa
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "observacaoWS", propOrder = {
    "descricao",
    "unidade"
})
public class ObservacaoWS {

	private String descricao;
	private UnidadeWS unidade;

	public ObservacaoWS() {
		// --
	}

	/**
	 * @param descricao
	 * @param unidade
	 */
	public ObservacaoWS(String descricao, UnidadeWS unidade) {
		super();
		this.descricao = descricao;
		this.unidade = unidade;
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

	/**
	 * @return the unidade
	 */
	public UnidadeWS getUnidade() {
		return unidade;
	}

	/**
	 * @param unidade
	 *            the unidade to set
	 */
	public void setUnidade(UnidadeWS unidade) {
		this.unidade = unidade;
	}
}
