/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.wrapper;

import br.gov.ro.pge.sei.api.domain.ArrayOfArquivoExtensaoWS;

/**
 * @author janon.sousa
 * 
 */
public class ListarExtensoesPermitidasResponse {

	private ArrayOfArquivoExtensaoWS parametros;

	/**
	 * @return the parametros
	 */
	public ArrayOfArquivoExtensaoWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(ArrayOfArquivoExtensaoWS parametros) {
		this.parametros = parametros;
	}
}
