package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfTipoProcedimentoWS", propOrder = {
    "tipoProcedimento"
})
public class ArrayOfTipoProcedimentoWS {

	private List<TipoProcedimentoWS> tipoProcedimento;

	public ArrayOfTipoProcedimentoWS() {

	}

	/**
	 * @param tipoProcedimento
	 */
	public ArrayOfTipoProcedimentoWS(List<TipoProcedimentoWS> tipoProcedimento) {
		this.tipoProcedimento = tipoProcedimento;
	}

	/**
	 * @return the tipoProcedimento
	 */
	public List<TipoProcedimentoWS> getTipoProcedimento() {
		return tipoProcedimento;
	}

	/**
	 * @param tipoProcedimento
	 *            the tipoProcedimento to set
	 */
	public void setTipoProcedimento(List<TipoProcedimentoWS> tipoProcedimento) {
		this.tipoProcedimento = tipoProcedimento;
	}
}
