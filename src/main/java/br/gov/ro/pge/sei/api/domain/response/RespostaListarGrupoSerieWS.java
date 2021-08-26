package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.ArrayOfGrupoSerieWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respostaListarGrupoSerieWS", propOrder = {
    "grupos"
})
public class RespostaListarGrupoSerieWS {

	private ArrayOfGrupoSerieWS grupos;

	public RespostaListarGrupoSerieWS() {

	}

	/**
	 * @param grupos
	 */
	public RespostaListarGrupoSerieWS(ArrayOfGrupoSerieWS grupos) {
		this.grupos = grupos;
	}

	/**
	 * @return the grupos
	 */
	public ArrayOfGrupoSerieWS getGrupos() {
		return grupos;
	}

	/**
	 * @param grupos
	 *            the grupos to set
	 */
	public void setGrupos(ArrayOfGrupoSerieWS grupos) {
		this.grupos = grupos;
	}
}
