/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * @author janon.sousa
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoConsultaProcedimentoWS", propOrder = {
    "idProcedimento",
    "procedimentoFormatado",
    "especificacao",
    "dataAutuacao",
    "linkAcesso",
    "tipoProcedimento",
    "andamentoGeracao",
    "andamentoConclusao",
    "ultimoAndamento",
    "unidadesProcedimentoAberto",
    "assuntos",
    "interessados",
    "observacoes",
    "procedimentosRelacionados",
    "procedimentosAnexados"
})
public class RetornoConsultaProcedimentoWS {

	private Long idProcedimento;
	private String procedimentoFormatado;
	private String especificacao;
	private Date dataAutuacao;
	private String linkAcesso;

	private TipoProcedimentoWS tipoProcedimento;

	private AndamentoWS andamentoGeracao;
	private AndamentoWS andamentoConclusao;
	private AndamentoWS ultimoAndamento;

	private ArrayOfUnidadeProcedimentoAbertoWS unidadesProcedimentoAberto;

	private ArrayOfAssuntoWS assuntos;
	private ArrayOfInteressadoWS interessados;

	private ArrayOfObservacaoWS observacoes;

	private ArrayOfProcedimentoResumidoWS procedimentosRelacionados;
	private ArrayOfProcedimentoResumidoWS procedimentosAnexados;

	/**
	 * @return the idProcedimento
	 */
	public Long getIdProcedimento() {
		return idProcedimento;
	}

	/**
	 * @param idProcedimento
	 *            the idProcedimento to set
	 */
	public void setIdProcedimento(Long idProcedimento) {
		this.idProcedimento = idProcedimento;
	}

	/**
	 * @return the procedimentoFormatado
	 */
	public String getProcedimentoFormatado() {
		return procedimentoFormatado;
	}

	/**
	 * @param procedimentoFormatado
	 *            the procedimentoFormatado to set
	 */
	public void setProcedimentoFormatado(String procedimentoFormatado) {
		this.procedimentoFormatado = procedimentoFormatado;
	}

	/**
	 * @return the especificacao
	 */
	public String getEspecificacao() {
		return especificacao;
	}

	/**
	 * @param especificacao
	 *            the especificacao to set
	 */
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	/**
	 * @return the dataAutuacao
	 */
	public Date getDataAutuacao() {
		return dataAutuacao;
	}

	/**
	 * @param dataAutuacao
	 *            the dataAutuacao to set
	 */
	public void setDataAutuacao(Date dataAutuacao) {
		this.dataAutuacao = dataAutuacao;
	}

	/**
	 * @return the linkAcesso
	 */
	public String getLinkAcesso() {
		return linkAcesso;
	}

	/**
	 * @param linkAcesso
	 *            the linkAcesso to set
	 */
	public void setLinkAcesso(String linkAcesso) {
		this.linkAcesso = linkAcesso;
	}

	/**
	 * @return the tipoProcedimento
	 */
	public TipoProcedimentoWS getTipoProcedimento() {
		return tipoProcedimento;
	}

	/**
	 * @param tipoProcedimento
	 *            the tipoProcedimento to set
	 */
	public void setTipoProcedimento(TipoProcedimentoWS tipoProcedimento) {
		this.tipoProcedimento = tipoProcedimento;
	}

	/**
	 * @return the andamentoGeracao
	 */
	public AndamentoWS getAndamentoGeracao() {
		return andamentoGeracao;
	}

	/**
	 * @param andamentoGeracao
	 *            the andamentoGeracao to set
	 */
	public void setAndamentoGeracao(AndamentoWS andamentoGeracao) {
		this.andamentoGeracao = andamentoGeracao;
	}

	/**
	 * @return the andamentoConclusao
	 */
	public AndamentoWS getAndamentoConclusao() {
		return andamentoConclusao;
	}

	/**
	 * @param andamentoConclusao
	 *            the andamentoConclusao to set
	 */
	public void setAndamentoConclusao(AndamentoWS andamentoConclusao) {
		this.andamentoConclusao = andamentoConclusao;
	}

	/**
	 * @return the ultimoAndamento
	 */
	public AndamentoWS getUltimoAndamento() {
		return ultimoAndamento;
	}

	/**
	 * @param ultimoAndamento
	 *            the ultimoAndamento to set
	 */
	public void setUltimoAndamento(AndamentoWS ultimoAndamento) {
		this.ultimoAndamento = ultimoAndamento;
	}

	/**
	 * @return the unidadesProcedimentoAberto
	 */
	public ArrayOfUnidadeProcedimentoAbertoWS getUnidadesProcedimentoAberto() {
		return unidadesProcedimentoAberto;
	}

	/**
	 * @param unidadesProcedimentoAberto
	 *            the unidadesProcedimentoAberto to set
	 */
	public void setUnidadesProcedimentoAberto(
			ArrayOfUnidadeProcedimentoAbertoWS unidadesProcedimentoAberto) {
		this.unidadesProcedimentoAberto = unidadesProcedimentoAberto;
	}

	/**
	 * @return the assuntos
	 */
	public ArrayOfAssuntoWS getAssuntos() {
		return assuntos;
	}

	/**
	 * @param assuntos
	 *            the assuntos to set
	 */
	public void setAssuntos(ArrayOfAssuntoWS assuntos) {
		this.assuntos = assuntos;
	}

	/**
	 * @return the interessados
	 */
	public ArrayOfInteressadoWS getInteressados() {
		return interessados;
	}

	/**
	 * @param interessados
	 *            the interessados to set
	 */
	public void setInteressados(ArrayOfInteressadoWS interessados) {
		this.interessados = interessados;
	}

	/**
	 * @return the observacoes
	 */
	public ArrayOfObservacaoWS getObservacoes() {
		return observacoes;
	}

	/**
	 * @param observacoes
	 *            the observacoes to set
	 */
	public void setObservacoes(ArrayOfObservacaoWS observacoes) {
		this.observacoes = observacoes;
	}

	/**
	 * @return the procedimentosRelacionados
	 */
	public ArrayOfProcedimentoResumidoWS getProcedimentosRelacionados() {
		return procedimentosRelacionados;
	}

	/**
	 * @param procedimentosRelacionados
	 *            the procedimentosRelacionados to set
	 */
	public void setProcedimentosRelacionados(
			ArrayOfProcedimentoResumidoWS procedimentosRelacionados) {
		this.procedimentosRelacionados = procedimentosRelacionados;
	}

	/**
	 * @return the procedimentosAnexados
	 */
	public ArrayOfProcedimentoResumidoWS getProcedimentosAnexados() {
		return procedimentosAnexados;
	}

	/**
	 * @param procedimentosAnexados
	 *            the procedimentosAnexados to set
	 */
	public void setProcedimentosAnexados(
			ArrayOfProcedimentoResumidoWS procedimentosAnexados) {
		this.procedimentosAnexados = procedimentosAnexados;
	}

}
