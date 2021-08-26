/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

/**
 * @author janon.sousa
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procedimentoResumidoWS", propOrder = {
	"idProcedimento",
    "procedimentoFormatado",
    "tipoProcedimento"
})
public class ProcedimentoResumidoWS {

	private BigDecimal idProcedimento;
	private String procedimentoFormatado;
	private TipoProcedimentoWS tipoProcedimento;

	/**
	 * @return the idProcedimento
	 */
	public BigDecimal getIdProcedimento() {
		return idProcedimento;
	}

	/**
	 * @param idProcedimento
	 *            the idProcedimento to set
	 */
	public void setIdProcedimento(BigDecimal idProcedimento) {
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
	 * @return the tipoProcedimento
	 */
	public TipoProcedimentoWS getTipoProcedimento() {
		return tipoProcedimento;
	}

	/**
	 * @param tipoProcedimento
	 *            the tipoProcedimento to set
	 */
	public void setTipoProcedimento(TipoProcedimentoWS tipoProcedimento) {
		this.tipoProcedimento = tipoProcedimento;
	}
}
