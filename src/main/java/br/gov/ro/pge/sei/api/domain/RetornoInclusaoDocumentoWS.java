package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoInclusaoDocumentoWS", propOrder = {
    "idDocumento",
    "documentoFormatado",
    "linkAcesso"
})
public class RetornoInclusaoDocumentoWS {

	private Long idDocumento;
	private String documentoFormatado;
	private String linkAcesso;

	/**
	 * @return the idDocumento
	 */
	public Long getIdDocumento() {
		return idDocumento;
	}

	/**
	 * @param idDocumento
	 *            the idDocumento to set
	 */
	public void setIdDocumento(Long idDocumento) {
		this.idDocumento = idDocumento;
	}

	/**
	 * @return the documentoFormatado
	 */
	public String getDocumentoFormatado() {
		return documentoFormatado;
	}

	/**
	 * @param documentoFormatado
	 *            the documentoFormatado to set
	 */
	public void setDocumentoFormatado(String documentoFormatado) {
		this.documentoFormatado = documentoFormatado;
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

}