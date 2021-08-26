package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfSerieWS", propOrder = {
    "item"
})
public class ArrayOfSerieWS {

	private List<SerieWS> item;

	public ArrayOfSerieWS() {

	}

	/**
	 * @param serie
	 */
	public ArrayOfSerieWS(List<SerieWS> item) {
		this.item = item;
	}

	/**
	 * @return the item
	 */
	public List<SerieWS> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<SerieWS> item) {
		this.item = item;
	}
}
