package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfIdUnidadeWS", propOrder = {
    "idUnidade"
})
public class ArrayOfIdUnidadeWS {

	private List<Long> idUnidade;

	/**
	 * @return the idUnidade
	 */
	public List<Long> getIdUnidade() {
		return idUnidade;
	}

	/**
	 * @param idUnidade
	 *            the idUnidade to set
	 */
	public void setIdUnidade(List<Long> idUnidade) {
		this.idUnidade = idUnidade;
	}
}
