package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfAtributoAndamentoWS", propOrder = {
    "item"
})
public class ArrayOfAtributoAndamentoWS {

	private List<AtributoAndamentoWS> item;

	/**
	 * @return the item
	 */
	public List<AtributoAndamentoWS> getItem() {
		return item;
	}

	/**
	 * @param item
	 *            the item to set
	 */
	public void setItem(List<AtributoAndamentoWS> item) {
		this.item = item;
	}
}
