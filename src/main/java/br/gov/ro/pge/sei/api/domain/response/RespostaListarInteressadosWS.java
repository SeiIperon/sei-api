package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.ArrayOfInteressadoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respostaListarInteressadosWS", propOrder = {
    "parametros"
})
public class RespostaListarInteressadosWS {

	private ArrayOfInteressadoWS parametros;

	public RespostaListarInteressadosWS() {
		
	}

	/**
	 * @param parametros
	 */
	public RespostaListarInteressadosWS(ArrayOfInteressadoWS parametros) {
		this.parametros = parametros;
	}

	/**
	 * @return the parametros
	 */
	public ArrayOfInteressadoWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(ArrayOfInteressadoWS parametros) {
		this.parametros = parametros;
	}
}
