package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.SinDiasUteisRetornoProgramadoWS;
import br.gov.ro.pge.sei.api.domain.SinEnviarEmailNotificacaoWS;
import br.gov.ro.pge.sei.api.domain.SinManterAbertoUnidadeWS;
import org.apache.commons.lang3.ObjectUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosGerarProcedimentoWS", propOrder = {
    "siglaSistema",
    "identificacaoServico",
    "idUnidade",
    "procedimento",
    "sinManterAbertoUnidade",
    "sinEnviarEmailNotificacao",
    "dataRetornoProgramado",
    "diasRetornoProgramado",
    "sinDiasUteisRetornoProgramado",
    "idMarcador",
    "textoMarcador",
})
public class ParametrosGerarProcedimentoWS {

	@XmlElement(required = true)
	private String siglaSistema;

	@XmlElement(required = true)
	private String identificacaoServico;

	@XmlElement(required = true)
	private Long idUnidade;

	@XmlElement(required = true)
	private ParametrosProcedimentoWS procedimento;
	
	@XmlElement(required = false)
	private SinManterAbertoUnidadeWS sinManterAbertoUnidade;
	
	@XmlElement(required = false)
	private SinEnviarEmailNotificacaoWS sinEnviarEmailNotificacao;
	
	@XmlElement(required = false)
	private Date dataRetornoProgramado;
	
	@XmlElement(required = false)
	private Long diasRetornoProgramado;
	
	@XmlElement(required = false)
	private SinDiasUteisRetornoProgramadoWS sinDiasUteisRetornoProgramado;
	
	@XmlElement(required = false)
	private Long idMarcador;
	
	@XmlElement(required = false)
	private String textoMarcador;

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
	 * @return the procedimento
	 */
	public ParametrosProcedimentoWS getProcedimento() {
		return procedimento;
	}

	/**
	 * @param procedimento
	 *            the procedimento to set
	 */
	public void setProcedimento(ParametrosProcedimentoWS procedimento) {
		this.procedimento = procedimento;
	}

	/**
	 * @return the sinManterAbertoUnidade
	 */
	public SinManterAbertoUnidadeWS getSinManterAbertoUnidade() {
		if (ObjectUtils.isEmpty(this.sinManterAbertoUnidade)) {
			this.sinManterAbertoUnidade = SinManterAbertoUnidadeWS.SIM;
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
	public Date getDataRetornoProgramado() {
		return dataRetornoProgramado;
	}

	/**
	 * @param dataRetornoProgramado
	 *            the dataRetornoProgramado to set
	 */
	public void setDataRetornoProgramado(Date dataRetornoProgramado) {
		this.dataRetornoProgramado = dataRetornoProgramado;
	}

	/**
	 * @return the diasRetornoProgramado
	 */
	public Long getDiasRetornoProgramado() {
		return diasRetornoProgramado;
	}

	/**
	 * @param diasRetornoProgramado
	 *            the diasRetornoProgramado to set
	 */
	public void setDiasRetornoProgramado(Long diasRetornoProgramado) {
		this.diasRetornoProgramado = diasRetornoProgramado;
	}

	/**
	 * @return the sinDiasUteisRetornoProgramadoWS
	 */
	public SinDiasUteisRetornoProgramadoWS getSinDiasUteisRetornoProgramado() {
		if (ObjectUtils.isEmpty(this.sinDiasUteisRetornoProgramado)) {
			this.sinDiasUteisRetornoProgramado = SinDiasUteisRetornoProgramadoWS.NAO;
		}
		return sinDiasUteisRetornoProgramado;
	}

	/**
	 * @param sinDiasUteisRetornoProgramado
	 *            the sinDiasUteisRetornoProgramadoWS to set
	 */
	public void setSinDiasUteisRetornoProgramado(
			SinDiasUteisRetornoProgramadoWS sinDiasUteisRetornoProgramado) {
		this.sinDiasUteisRetornoProgramado = sinDiasUteisRetornoProgramado;
	}

	/**
	 * @return the idMarcador
	 */
	public Long getIdMarcador() {
		return idMarcador;
	}

	/**
	 * @param idMarcador
	 *            the idMarcador to set
	 */
	public void setIdMarcador(Long idMarcador) {
		this.idMarcador = idMarcador;
	}

	/**
	 * @return the textoMarcador
	 */
	public String getTextoMarcador() {
		return textoMarcador;
	}

	/**
	 * @param textoMarcador
	 *            the textoMarcador to set
	 */
	public void setTextoMarcador(String textoMarcador) {
		this.textoMarcador = textoMarcador;
	}

}