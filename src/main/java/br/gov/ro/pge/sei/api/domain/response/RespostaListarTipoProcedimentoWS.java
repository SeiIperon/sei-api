package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.ArrayOfTipoProcedimentoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respostaListarTipoProcedimentoWS", propOrder = {
    "tiposProcedimento"
})
public class RespostaListarTipoProcedimentoWS {

	private ArrayOfTipoProcedimentoWS tiposProcedimento;

	public RespostaListarTipoProcedimentoWS() {

	}

	/**
	 * @param tiposProcedimento
	 */
	public RespostaListarTipoProcedimentoWS(
			ArrayOfTipoProcedimentoWS tiposProcedimento) {
		this.tiposProcedimento = tiposProcedimento;
	}

	/**
	 * @return the tiposProcedimento
	 */
	public ArrayOfTipoProcedimentoWS getTiposProcedimento() {
		return tiposProcedimento;
	}

	/**
	 * @param tiposProcedimento
	 *            the tiposProcedimento to set
	 */
	public void setTiposProcedimento(ArrayOfTipoProcedimentoWS tiposProcedimento) {
		this.tiposProcedimento = tiposProcedimento;
	}
}
