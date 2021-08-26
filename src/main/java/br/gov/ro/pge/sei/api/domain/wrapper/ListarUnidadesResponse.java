/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.wrapper;

import br.gov.ro.pge.sei.api.domain.ArrayOfUnidadeWS;

/**
 * @author Memora
 * 
 */
public class ListarUnidadesResponse {

	private ArrayOfUnidadeWS parametros;

	/**
	 * @return the parametros
	 */
	public ArrayOfUnidadeWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(ArrayOfUnidadeWS parametros) {
		this.parametros = parametros;
	}
}
