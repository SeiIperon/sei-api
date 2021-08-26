/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.wrapper;

import br.gov.ro.pge.sei.api.domain.RetornoConsultaProcedimentoWS;

/**
 * @author janon.sousa
 * 
 */
public class ConsultarProcedimentoResponse {

	private RetornoConsultaProcedimentoWS parametros;

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
