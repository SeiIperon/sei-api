package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retornoGeracaoProcedimentoWS", propOrder = {
    "idProcedimento",
    "procedimentoFormatado",
    "linkAcesso"
})
public class RetornoGeracaoProcedimentoWS {

	private Long idProcedimento;
	private String procedimentoFormatado;
	private String linkAcesso;

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
