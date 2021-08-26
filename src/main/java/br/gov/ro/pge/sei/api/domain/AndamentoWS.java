package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "andamentoWS", propOrder = {
    "idAndamento",
    "idTarefa",
    "descricao",
    "dataHora",
    "unidade",
    "usuario",
    "atributos"
})
public class AndamentoWS {

	private Long idAndamento;
	private Long idTarefa;
	private String descricao;
	private String dataHora;
	private UnidadeWS unidade;
	private UsuarioWS usuario;
	private ArrayOfAtributoAndamentoWS atributos;

	/**
	 * @return the idAndamento
	 */
	public Long getIdAndamento() {
		return idAndamento;
	}

	/**
	 * @param idAndamento
	 *            the idAndamento to set
	 */
	public void setIdAndamento(Long idAndamento) {
		this.idAndamento = idAndamento;
	}

	/**
	 * @return the idTarefa
	 */
	public Long getIdTarefa() {
		return idTarefa;
	}

	/**
	 * @param idTarefa
	 *            the idTarefa to set
	 */
	public void setIdTarefa(Long idTarefa) {
		this.idTarefa = idTarefa;
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
	 * @return the dataHora
	 */
	public String getDataHora() {
		return dataHora;
	}

	/**
	 * @param dataHora
	 *            the dataHora to set
	 */
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
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

	/**
	 * @return the usuario
	 */
	public UsuarioWS getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(UsuarioWS usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the atributos
	 */
	public ArrayOfAtributoAndamentoWS getAtributos() {
		return atributos;
	}

	/**
	 * @param atributos
	 *            the atributos to set
	 */
	public void setAtributos(ArrayOfAtributoAndamentoWS atributos) {
		this.atributos = atributos;
	}

}
