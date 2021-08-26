package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.SimProcedimentoWS;
import org.apache.commons.lang3.ObjectUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosConsultarProcedimentoWS", propOrder = {
	"siglaSistema",
	"identificacaoServico",
	"idUnidade",
	"protocoloProcedimento",
	"sinRetornarAssuntos",
	"sinRetornarInteressados",
	"sinRetornarObservacoes",
	"sinRetornarAndamentoGeracao",
	"sinRetornarAndamentoConclusao",
	"sinRetornarUltimoAndamento",
	"sinRetornarUnidadesProcedimentoAberto",
	"sinRetornarProcedimentosRelacionados",
	"sinRetornarProcedimentosAnexados"
})
public class ParametrosConsultarProcedimentoWS {

	@XmlElement(required = true)
	private String siglaSistema;

	@XmlElement(required = true)
	private String identificacaoServico;

	@XmlElement(required = false)
	private Long idUnidade;

	@XmlElement(required = true)
	private String protocoloProcedimento;

	@XmlElement(required = false)
	private SimProcedimentoWS sinRetornarAssuntos;

	@XmlElement(required = false)
	private SimProcedimentoWS sinRetornarInteressados;

	@XmlElement(required = false)
	private SimProcedimentoWS sinRetornarObservacoes;

	@XmlElement(required = false)
	private SimProcedimentoWS sinRetornarAndamentoGeracao;

	@XmlElement(required = false)
	private SimProcedimentoWS sinRetornarAndamentoConclusao;

	@XmlElement(required = false)
	private SimProcedimentoWS sinRetornarUltimoAndamento;

	@XmlElement(required = false)
	private SimProcedimentoWS sinRetornarUnidadesProcedimentoAberto;

	@XmlElement(required = false)
	private SimProcedimentoWS sinRetornarProcedimentosRelacionados;

	@XmlElement(required = false)
	private SimProcedimentoWS sinRetornarProcedimentosAnexados;

	/**
	 * @return the siglaSistema
	 */
	public String getSiglaSistema() {
		return siglaSistema;
	}

	/**
	 * @param siglaSistema
	 *            the siglaSistema to set
	 */
	public void setSiglaSistema(String siglaSistema) {
		this.siglaSistema = siglaSistema;
	}

	/**
	 * @return the identificacaoServico
	 */
	public String getIdentificacaoServico() {
		return identificacaoServico;
	}

	/**
	 * @param identificacaoServico
	 *            the identificacaoServico to set
	 */
	public void setIdentificacaoServico(String identificacaoServico) {
		this.identificacaoServico = identificacaoServico;
	}

	/**
	 * @return the idUnidade
	 */
	public Long getIdUnidade() {
		return idUnidade;
	}

	/**
	 * @param idUnidade
	 *            the idUnidade to set
	 */
	public void setIdUnidade(Long idUnidade) {
		this.idUnidade = idUnidade;
	}

	/**
	 * @return the protocoloProcedimento
	 */
	public String getProtocoloProcedimento() {
		return protocoloProcedimento;
	}

	/**
	 * @param protocoloProcedimento
	 *            the protocoloProcedimento to set
	 */
	public void setProtocoloProcedimento(String protocoloProcedimento) {
		this.protocoloProcedimento = protocoloProcedimento;
	}

	/**
	 * @return the sinRetornarAssuntos
	 */
	public SimProcedimentoWS getSinRetornarAssuntos() {
		if (ObjectUtils.isEmpty(this.sinRetornarAssuntos)) {
			this.sinRetornarAssuntos = SimProcedimentoWS.NAO;
		}
		return sinRetornarAssuntos;
	}

	/**
	 * @param sinRetornarAssuntos
	 *            the sinRetornarAssuntos to set
	 */
	public void setSinRetornarAssuntos(SimProcedimentoWS sinRetornarAssuntos) {
		this.sinRetornarAssuntos = sinRetornarAssuntos;
	}

	/**
	 * @return the sinRetornarInteressados
	 */
	public SimProcedimentoWS getSinRetornarInteressados() {
		if (ObjectUtils.isEmpty(this.sinRetornarInteressados)) {
			this.sinRetornarInteressados = SimProcedimentoWS.NAO;
		}
		return sinRetornarInteressados;
	}

	/**
	 * @param sinRetornarInteressados
	 *            the sinRetornarInteressados to set
	 */
	public void setSinRetornarInteressados(
			SimProcedimentoWS sinRetornarInteressados) {
		this.sinRetornarInteressados = sinRetornarInteressados;
	}

	/**
	 * @return the sinRetornarObservacoes
	 */
	public SimProcedimentoWS getSinRetornarObservacoes() {
		if (ObjectUtils.isEmpty(this.sinRetornarObservacoes)) {
			this.sinRetornarObservacoes = SimProcedimentoWS.NAO;
		}
		return sinRetornarObservacoes;
	}

	/**
	 * @param sinRetornarObservacoes
	 *            the sinRetornarObservacoes to set
	 */
	public void setSinRetornarObservacoes(
			SimProcedimentoWS sinRetornarObservacoes) {
		this.sinRetornarObservacoes = sinRetornarObservacoes;
	}

	/**
	 * @return the sinRetornarAndamentoGeracao
	 */
	public SimProcedimentoWS getSinRetornarAndamentoGeracao() {
		if (ObjectUtils.isEmpty(this.sinRetornarAndamentoGeracao)) {
			this.sinRetornarAndamentoGeracao = SimProcedimentoWS.NAO;
		}
		return sinRetornarAndamentoGeracao;
	}

	/**
	 * @param sinRetornarAndamentoGeracao
	 *            the sinRetornarAndamentoGeracao to set
	 */
	public void setSinRetornarAndamentoGeracao(
			SimProcedimentoWS sinRetornarAndamentoGeracao) {
		this.sinRetornarAndamentoGeracao = sinRetornarAndamentoGeracao;
	}

	/**
	 * @return the sinRetornarAndamentoConclusao
	 */
	public SimProcedimentoWS getSinRetornarAndamentoConclusao() {
		if (ObjectUtils.isEmpty(this.sinRetornarAndamentoConclusao)) {
			this.sinRetornarAndamentoConclusao = SimProcedimentoWS.NAO;
		}
		return sinRetornarAndamentoConclusao;
	}

	/**
	 * @param sinRetornarAndamentoConclusao
	 *            the sinRetornarAndamentoConclusao to set
	 */
	public void setSinRetornarAndamentoConclusao(
			SimProcedimentoWS sinRetornarAndamentoConclusao) {
		this.sinRetornarAndamentoConclusao = sinRetornarAndamentoConclusao;
	}

	/**
	 * @return the sinRetornarUltimoAndamento
	 */
	public SimProcedimentoWS getSinRetornarUltimoAndamento() {
		if (ObjectUtils.isEmpty(this.sinRetornarUltimoAndamento)) {
			this.sinRetornarUltimoAndamento = SimProcedimentoWS.NAO;
		}
		return sinRetornarUltimoAndamento;
	}

	/**
	 * @param sinRetornarUltimoAndamento
	 *            the sinRetornarUltimoAndamento to set
	 */
	public void setSinRetornarUltimoAndamento(
			SimProcedimentoWS sinRetornarUltimoAndamento) {
		this.sinRetornarUltimoAndamento = sinRetornarUltimoAndamento;
	}

	/**
	 * @return the sinRetornarUnidadesProcedimentoAberto
	 */
	public SimProcedimentoWS getSinRetornarUnidadesProcedimentoAberto() {
		if (ObjectUtils.isEmpty(this.sinRetornarUnidadesProcedimentoAberto)) {
			this.sinRetornarUnidadesProcedimentoAberto = SimProcedimentoWS.NAO;
		}
		return sinRetornarUnidadesProcedimentoAberto;
	}

	/**
	 * @param sinRetornarUnidadesProcedimentoAberto
	 *            the sinRetornarUnidadesProcedimentoAberto to set
	 */
	public void setSinRetornarUnidadesProcedimentoAberto(
			SimProcedimentoWS sinRetornarUnidadesProcedimentoAberto) {
		this.sinRetornarUnidadesProcedimentoAberto = sinRetornarUnidadesProcedimentoAberto;
	}

	/**
	 * @return the sinRetornarProcedimentosRelacionados
	 */
	public SimProcedimentoWS getSinRetornarProcedimentosRelacionados() {
		if (ObjectUtils.isEmpty(this.sinRetornarProcedimentosRelacionados)) {
			this.sinRetornarProcedimentosRelacionados = SimProcedimentoWS.NAO;
		}
		return sinRetornarProcedimentosRelacionados;
	}

	/**
	 * @param sinRetornarProcedimentosRelacionados
	 *            the sinRetornarProcedimentosRelacionados to set
	 */
	public void setSinRetornarProcedimentosRelacionados(
			SimProcedimentoWS sinRetornarProcedimentosRelacionados) {
		this.sinRetornarProcedimentosRelacionados = sinRetornarProcedimentosRelacionados;
	}

	/**
	 * @return the sinRetornarProcedimentosAnexados
	 */
	public SimProcedimentoWS getSinRetornarProcedimentosAnexados() {
		if (ObjectUtils.isEmpty(this.sinRetornarProcedimentosAnexados)) {
			this.sinRetornarProcedimentosAnexados = SimProcedimentoWS.NAO;
		}
		return sinRetornarProcedimentosAnexados;
	}

	/**
	 * @param sinRetornarProcedimentosAnexados
	 *            the sinRetornarProcedimentosAnexados to set
	 */
	public void setSinRetornarProcedimentosAnexados(
			SimProcedimentoWS sinRetornarProcedimentosAnexados) {
		this.sinRetornarProcedimentosAnexados = sinRetornarProcedimentosAnexados;
	}

}