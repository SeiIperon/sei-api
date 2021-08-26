/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.parameter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Memora
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosConcluirProcessoWS", propOrder = { 
		"siglaSistema",
		"identificacaoServico", 
		"idUnidade", 
		"protocoloProcedimento" 
})
public class ParametrosConcluirProcessoWS {

	@XmlElement(required = true)
	private String siglaSistema;

	@XmlElement(required = true)
	private String identificacaoServico;

	@XmlElement(required = true)
	private Long idUnidade;

	@XmlElement(required = true)
	private String protocoloProcedimento;

	public String getSiglaSistema() {
		return siglaSistema;
	}

	public void setSiglaSistema(String siglaSistema) {
		this.siglaSistema = siglaSistema;
	}

	public String getIdentificacaoServico() {
		return identificacaoServico;
	}

	public void setIdentificacaoServico(String identificacaoServico) {
		this.identificacaoServico = identificacaoServico;
	}

	public Long getIdUnidade() {
		return idUnidade;
	}

	public void setIdUnidade(Long idUnidade) {
		this.idUnidade = idUnidade;
	}

	public String getProtocoloProcedimento() {
		return protocoloProcedimento;
	}

	public void setProtocoloProcedimento(String protocoloProcedimento) {
		this.protocoloProcedimento = protocoloProcedimento;
	}
}