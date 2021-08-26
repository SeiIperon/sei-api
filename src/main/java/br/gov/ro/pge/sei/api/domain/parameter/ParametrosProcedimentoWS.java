package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.ArrayOfAssuntoWS;
import br.gov.ro.pge.sei.api.domain.ArrayOfInteressadoWS;
import br.gov.ro.pge.sei.api.domain.NivelAcessoWS;
import org.apache.commons.lang3.ObjectUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosProcedimentoWS", propOrder = {
    "idTipoProcedimento",
    "numeroProtocolo",
    "dataAutuacao",
    "especificacao",
    "observacao",
    "assuntos",
    "interessados",
    "nivelAcesso",
    "idHipoteseLegal",
})
public class ParametrosProcedimentoWS {

	@XmlElement(required = true)
	private Long idTipoProcedimento;
	
	@XmlElement(required = false)
	private String numeroProtocolo;
	
	@XmlElement(required = false)
	private Date dataAutuacao;
	
	@XmlElement(required = false)
	private String especificacao;
	
	@XmlElement(required = false)
	private ArrayOfAssuntoWS assuntos;
	
	@XmlElement(required = false)
	private ArrayOfInteressadoWS interessados;
	
	@XmlElement(required = false)
	private String observacao;
	
	@XmlElement(required = false)
	private NivelAcessoWS nivelAcesso;
	
	private String idHipoteseLegal;

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
	 * @return the numeroProtocolo
	 */
	public String getNumeroProtocolo() {
		return numeroProtocolo;
	}

	/**
	 * @param numeroProtocolo
	 *            the numeroProtocolo to set
	 */
	public void setNumeroProtocolo(String numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
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
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao
	 *            the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	/**
	 * @return the nivelAcesso
	 */
	public NivelAcessoWS getNivelAcesso() {
		if (ObjectUtils.isEmpty(this.nivelAcesso)) {
			this.nivelAcesso = NivelAcessoWS.PUBLICO;
		}
		return nivelAcesso;
	}

	/**
	 * @param nivelAcesso
	 *            the nivelAcesso to set
	 */
	public void setNivelAcesso(NivelAcessoWS nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	/**
	 * @return the idHipoteseLegal
	 */
	public String getIdHipoteseLegal() {
		return idHipoteseLegal;
	}

	/**
	 * @param idHipoteseLegal
	 *            the idHipoteseLegal to set
	 */
	public void setIdHipoteseLegal(String idHipoteseLegal) {
		this.idHipoteseLegal = idHipoteseLegal;
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
}