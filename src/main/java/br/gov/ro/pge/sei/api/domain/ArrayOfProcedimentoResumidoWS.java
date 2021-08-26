/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import java.util.List;

/**
 * @author janon.sousa
 * 
 */
public class ArrayOfProcedimentoResumidoWS {

	private List<ProcedimentoResumidoWS> item;

	public ArrayOfProcedimentoResumidoWS() {
		// --
	}

	/**
	 * @return the item
	 */
	public List<ProcedimentoResumidoWS> getItem() {
		return item;
	}

	/**
	 * @param item
	 *            the item to set
	 */
	public void setItem(List<ProcedimentoResumidoWS> item) {
		this.item = item;
	}
}
