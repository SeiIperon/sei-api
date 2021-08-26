package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.SinRetornarAtributosWS;
import org.apache.commons.lang3.ObjectUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosListarAndamentosWS", propOrder = {
    "siglaSistema",
    "identificacaoServico",
    "idUnidade",
    "protocoloProcedimento",
    "sinRetornarAtributos"
})
public class ParametrosListarAndamentosWS {

	@XmlElement(required = true)
	private String siglaSistema;

	@XmlElement(required = true)
	private String identificacaoServico;

	@XmlElement(required = true)
	private Long idUnidade;

	@XmlElement(required = true)
	private String protocoloProcedimento;

	@XmlElement(required = true)
	private SinRetornarAtributosWS sinRetornarAtributos;

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
	 * @return the sinRetornarAtributos
	 */
	public SinRetornarAtributosWS getSinRetornarAtributos() {
		if (ObjectUtils.isEmpty(this.sinRetornarAtributos)) {
			this.sinRetornarAtributos = SinRetornarAtributosWS.SIM;
		}
		return sinRetornarAtributos;
	}

	/**
	 * @param sinRetornarAtributos
	 *            the sinRetornarAtributos to set
	 */
	public void setSinRetornarAtributos(
			SinRetornarAtributosWS sinRetornarAtributos) {
		this.sinRetornarAtributos = sinRetornarAtributos;
	}

}
