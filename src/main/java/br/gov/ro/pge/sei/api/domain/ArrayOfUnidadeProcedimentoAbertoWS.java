/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import java.util.List;

/**
 * @author janon.sousa
 * 
 */
public class ArrayOfUnidadeProcedimentoAbertoWS {

	private List<UnidadeProcedimentoAbertoWS> item;

	/**
	 * @return the item
	 */
	public List<UnidadeProcedimentoAbertoWS> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<UnidadeProcedimentoAbertoWS> item) {
		this.item = item;
	}
}
