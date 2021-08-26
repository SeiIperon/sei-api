package br.gov.ro.pge.sei.api.domain.wrapper;

import br.gov.ro.pge.sei.api.domain.ArrayOfAndamentoWS;

public class ListarAndamentosResponse {

	private ArrayOfAndamentoWS parametros;

	/**
	 * @return the parametros
	 */
	public ArrayOfAndamentoWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(ArrayOfAndamentoWS parametros) {
		this.parametros = parametros;
	}
}
