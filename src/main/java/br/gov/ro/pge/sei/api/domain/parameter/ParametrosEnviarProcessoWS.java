/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.*;
import org.apache.commons.lang3.ObjectUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Memora
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosEnviarProcessoWS", propOrder = {
    "siglaSistema",
    "identificacaoServico",
    "idUnidade",
    "protocoloProcedimento",
    "unidadesDestino",
    "sinManterAbertoUnidade",
    "sinRemoverAnotacao",
    "sinEnviarEmailNotificacao",
    "dataRetornoProgramado",
    "diasRetornoProgramado",
    "sinDiasUteisRetornoProgramado",
    "sinReabrir"
})
public class ParametrosEnviarProcessoWS {

	@XmlElement(required = true)
	private String siglaSistema;

	@XmlElement(required = true)
	private String identificacaoServico;

	@XmlElement(required = true)
	private Long idUnidade;

	@XmlElement(required = true)
	private String protocoloProcedimento;

	@XmlElement(required = true)
	private ArrayOfIdUnidadeWS unidadesDestino;

	@XmlElement(required = false)
	private SinManterAbertoUnidadeWS sinManterAbertoUnidade;

	@XmlElement(required = false)
	private SinRemoverAnotacaoWS sinRemoverAnotacao;

	@XmlElement(required = false)
	private SinEnviarEmailNotificacaoWS sinEnviarEmailNotificacao;

	@XmlElement(required = false)
	private String dataRetornoProgramado;

	@XmlElement(required = false)
	private Integer diasRetornoProgramado;

	@XmlElement(required = false)
	private SinDiasUteisRetornoProgramadoWS sinDiasUteisRetornoProgramado;

	@XmlElement(required = false)
	private SinReabrirWS sinReabrir;

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
	 * @return the unidadesDestino
	 */
	public ArrayOfIdUnidadeWS getUnidadesDestino() {
		return unidadesDestino;
	}

	/**
	 * @param unidadesDestino
	 *            the unidadesDestino to set
	 */
	public void setUnidadesDestino(ArrayOfIdUnidadeWS unidadesDestino) {
		this.unidadesDestino = unidadesDestino;
	}

	/**
	 * @return the sinManterAbertoUnidade
	 */
	public SinManterAbertoUnidadeWS getSinManterAbertoUnidade() {
		if (ObjectUtils.isEmpty(this.sinManterAbertoUnidade)) {
			this.sinManterAbertoUnidade = SinManterAbertoUnidadeWS.NAO;
		}
		return sinManterAbertoUnidade;
	}

	/**
	 * @param sinManterAbertoUnidade
	 *            the sinManterAbertoUnidade to set
	 */
	public void setSinManterAbertoUnidade(
			SinManterAbertoUnidadeWS sinManterAbertoUnidade) {
		this.sinManterAbertoUnidade = sinManterAbertoUnidade;
	}

	/**
	 * @return the sinRemoverAnotacao
	 */
	public SinRemoverAnotacaoWS getSinRemoverAnotacao() {
		if (ObjectUtils.isEmpty(this.sinRemoverAnotacao)) {
			this.sinRemoverAnotacao = SinRemoverAnotacaoWS.NAO;
		}
		return sinRemoverAnotacao;
	}

	/**
	 * @param sinRemoverAnotacao
	 *            the sinRemoverAnotacao to set
	 */
	public void setSinRemoverAnotacao(SinRemoverAnotacaoWS sinRemoverAnotacao) {
		this.sinRemoverAnotacao = sinRemoverAnotacao;
	}

	/**
	 * @return the sinEnviarEmailNotificacao
	 */
	public SinEnviarEmailNotificacaoWS getSinEnviarEmailNotificacao() {
		if (ObjectUtils.isEmpty(this.sinEnviarEmailNotificacao)) {
			this.sinEnviarEmailNotificacao = SinEnviarEmailNotificacaoWS.NAO;
		}
		return sinEnviarEmailNotificacao;
	}

	/**
	 * @param sinEnviarEmailNotificacao
	 *            the sinEnviarEmailNotificacao to set
	 */
	public void setSinEnviarEmailNotificacao(
			SinEnviarEmailNotificacaoWS sinEnviarEmailNotificacao) {
		this.sinEnviarEmailNotificacao = sinEnviarEmailNotificacao;
	}

	/**
	 * @return the dataRetornoProgramado
	 */
	public String getDataRetornoProgramado() {
		return dataRetornoProgramado;
	}

	/**
	 * @param dataRetornoProgramado
	 *            the dataRetornoProgramado to set
	 */
	public void setDataRetornoProgramado(String dataRetornoProgramado) {
		this.dataRetornoProgramado = dataRetornoProgramado;
	}

	/**
	 * @return the diasRetornoProgramado
	 */
	public Integer getDiasRetornoProgramado() {
		return diasRetornoProgramado;
	}

	/**
	 * @param diasRetornoProgramado
	 *            the diasRetornoProgramado to set
	 */
	public void setDiasRetornoProgramado(Integer diasRetornoProgramado) {
		this.diasRetornoProgramado = diasRetornoProgramado;
	}

	/**
	 * @return the sinDiasUteisRetornoProgramado
	 */
	public SinDiasUteisRetornoProgramadoWS getSinDiasUteisRetornoProgramado() {
		if (ObjectUtils.isEmpty(this.sinDiasUteisRetornoProgramado)) {
			this.sinDiasUteisRetornoProgramado = SinDiasUteisRetornoProgramadoWS.NAO;
		}
		return sinDiasUteisRetornoProgramado;
	}

	/**
	 * @param sinDiasUteisRetornoProgramado
	 *            the sinDiasUteisRetornoProgramado to set
	 */
	public void setSinDiasUteisRetornoProgramado(
			SinDiasUteisRetornoProgramadoWS sinDiasUteisRetornoProgramado) {
		this.sinDiasUteisRetornoProgramado = sinDiasUteisRetornoProgramado;
	}

	/**
	 * @return the sinReabrir
	 */
	public SinReabrirWS getSinReabrir() {
		if (ObjectUtils.isEmpty(this.sinReabrir)) {
			this.sinReabrir = SinReabrirWS.NAO;
		}
		return sinReabrir;
	}

	/**
	 * @param sinReabrir
	 *            the sinReabrir to set
	 */
	public void setSinReabrir(SinReabrirWS sinReabrir) {
		this.sinReabrir = sinReabrir;
	}
}
