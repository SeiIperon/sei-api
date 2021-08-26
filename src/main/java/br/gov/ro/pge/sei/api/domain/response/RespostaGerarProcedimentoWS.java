package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.RetornoGeracaoProcedimentoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respostaGerarProcedimentoWS", propOrder = {
    "parametros"
})
public class RespostaGerarProcedimentoWS {

	private RetornoGeracaoProcedimentoWS parametros;

	/**
	 * @return the parametros
	 */
	public RetornoGeracaoProcedimentoWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(RetornoGeracaoProcedimentoWS parametros) {
		this.parametros = parametros;
	}
}
