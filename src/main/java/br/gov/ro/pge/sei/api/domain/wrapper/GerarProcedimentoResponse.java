package br.gov.ro.pge.sei.api.domain.wrapper;

import br.gov.ro.pge.sei.api.domain.RetornoGeracaoProcedimentoWS;

public class GerarProcedimentoResponse {

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
