package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfGrupoSerieWS", propOrder = {
    "grupoSerie"
})
public class ArrayOfGrupoSerieWS {

	private List<GrupoSerieWS> grupoSerie;

	public ArrayOfGrupoSerieWS() {

	}

	/**
	 * @param grupoSerie
	 */
	public ArrayOfGrupoSerieWS(List<GrupoSerieWS> grupoSerie) {
		this.grupoSerie = grupoSerie;
	}

	/**
	 * @return the grupoSerie
	 */
	public List<GrupoSerieWS> getGrupoSerie() {
		return grupoSerie;
	}

	/**
	 * @param grupoSerie
	 *            the grupoSerie to set
	 */
	public void setGrupoSerie(List<GrupoSerieWS> grupoSerie) {
		this.grupoSerie = grupoSerie;
	}

}
