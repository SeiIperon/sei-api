package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.RetornoConsultaProcedimentoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respostaConsultarProcedimentoWS", propOrder = {
    "parametros"
})
public class RespostaConsultarProcedimentoWS {

	private RetornoConsultaProcedimentoWS parametros;

	public RespostaConsultarProcedimentoWS() {
		// --
	}

	/**
	 * @param parametros
	 */
	public RespostaConsultarProcedimentoWS(
			RetornoConsultaProcedimentoWS parametros) {
		super();
		this.parametros = parametros;
	}

	/**
	 * @return the parametros
	 */
	public RetornoConsultaProcedimentoWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(RetornoConsultaProcedimentoWS parametros) {
		this.parametros = parametros;
	}
}
