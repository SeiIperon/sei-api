package br.gov.ro.pge.sei.api.domain.wrapper;

import br.gov.ro.pge.sei.api.domain.RetornoInclusaoDocumentoWS;

public class IncluirDocumentoResponse {

	private RetornoInclusaoDocumentoWS parametros;

	/**
	 * @return the parametros
	 */
	public RetornoInclusaoDocumentoWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(RetornoInclusaoDocumentoWS parametros) {
		this.parametros = parametros;
	}
}
