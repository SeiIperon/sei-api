/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import java.util.List;

/**
 * @author janon.sousa
 * 
 */
public class ArrayOfArquivoExtensaoWS {

	private List<ArquivoExtensaoWS> item;

	public ArrayOfArquivoExtensaoWS() {
		// --
	}

	/**
	 * @param item
	 */
	public ArrayOfArquivoExtensaoWS(List<ArquivoExtensaoWS> item) {
		super();
		this.item = item;
	}

	/**
	 * @return the item
	 */
	public List<ArquivoExtensaoWS> getItem() {
		return item;
	}

	/**
	 * @param item
	 *            the item to set
	 */
	public void setItem(List<ArquivoExtensaoWS> item) {
		this.item = item;
	}
}
