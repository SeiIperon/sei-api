package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfAndamentoWS", propOrder = {
    "andamento"
})
public class ArrayOfAndamentoWS {

	private List<AndamentoWS> andamento;

	/**
	 * @return the andamento
	 */
	public List<AndamentoWS> getAndamento() {
		return andamento;
	}

	/**
	 * @param andamento
	 *            the andamento to set
	 */
	public void setAndamento(List<AndamentoWS> andamento) {
		this.andamento = andamento;
	}
}
