package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfUnidadeWS", propOrder = {
    "item"
})
public class ArrayOfUnidadeWS {

	private List<UnidadeWS> item;

	public ArrayOfUnidadeWS() {

	}

	public ArrayOfUnidadeWS(List<UnidadeWS> item) {
		super();
		this.item = item;
	}

	/**
	 * @return the item
	 */
	public List<UnidadeWS> getItem() {
		return item;
	}

	/**
	 * @param item
	 *            the item to set
	 */
	public void setItem(List<UnidadeWS> item) {
		this.item = item;
	}
}
