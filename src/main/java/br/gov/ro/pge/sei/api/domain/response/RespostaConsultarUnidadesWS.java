/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.ArrayOfUnidadeWS;

/**
 * @author Memora
 * 
 */
public class RespostaConsultarUnidadesWS {

	private ArrayOfUnidadeWS unidades;

	public RespostaConsultarUnidadesWS() {
		// --
	}

	public RespostaConsultarUnidadesWS(ArrayOfUnidadeWS unidades) {
		super();
		this.unidades = unidades;
	}

	/**
	 * @return the unidades
	 */
	public ArrayOfUnidadeWS getUnidades() {
		return unidades;
	}

	/**
	 * @param unidades
	 *            the unidades to set
	 */
	public void setUnidades(ArrayOfUnidadeWS unidades) {
		this.unidades = unidades;
	}
}
