/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.parameter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

/**
 * @author janon.sousa
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosRelacionarProcessoWS", propOrder = {
    "siglaSistema",
    "identificacaoServico",
    "idUnidade",
    "protocoloProcedimento1",
    "protocoloProcedimento2"
})
public class ParametrosRelacionarProcessoWS {

	@XmlElement(required = true)
	private String siglaSistema;

	@XmlElement(required = true)
	private String identificacaoServico;

	@XmlElement(required = true)
	private BigDecimal idUnidade;

	@XmlElement(required = true)
	private String protocoloProcedimento1;

	@XmlElement(required = true)
	private String protocoloProcedimento2;

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
	public BigDecimal getIdUnidade() {
		return idUnidade;
	}

	/**
	 * @param idUnidade
	 *            the idUnidade to set
	 */
	public void setIdUnidade(BigDecimal idUnidade) {
		this.idUnidade = idUnidade;
	}

	/**
	 * @return the protocoloProcedimento1
	 */
	public String getProtocoloProcedimento1() {
		return protocoloProcedimento1;
	}

	/**
	 * @param protocoloProcedimento1
	 *            the protocoloProcedimento1 to set
	 */
	public void setProtocoloProcedimento1(String protocoloProcedimento1) {
		this.protocoloProcedimento1 = protocoloProcedimento1;
	}

	/**
	 * @return the protocoloProcedimento2
	 */
	public String getProtocoloProcedimento2() {
		return protocoloProcedimento2;
	}

	/**
	 * @param protocoloProcedimento2
	 *            the protocoloProcedimento2 to set
	 */
	public void setProtocoloProcedimento2(String protocoloProcedimento2) {
		this.protocoloProcedimento2 = protocoloProcedimento2;
	}

}
