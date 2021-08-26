package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.DocumentoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosIncluirDocumentoWS", propOrder = {
    "siglaSistema",
    "identificacaoServico",
    "idUnidade",
    "documento"
})
public class ParametrosIncluirDocumentoWS {
	
	@XmlElement(required = true)
	private String siglaSistema;
	
	@XmlElement(required = true)
	private String identificacaoServico;
	
	@XmlElement(required = true)
	private Long idUnidade;
	
	@XmlElement(required = true)
	private DocumentoWS documento;

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
	 * @return the documento
	 */
	public DocumentoWS getDocumento() {
		return documento;
	}

	/**
	 * @param documento
	 *            the documento to set
	 */
	public void setDocumento(DocumentoWS documento) {
		this.documento = documento;
	}

}