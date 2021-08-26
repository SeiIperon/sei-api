package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.ArrayOfAssuntoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respostaListarAssuntosWS", propOrder = {
    "parametros"
})
public class RespostaListarAssuntosWS {

	private ArrayOfAssuntoWS parametros;

	public RespostaListarAssuntosWS() {

	}

	/**
	 * @param parametros
	 */
	public RespostaListarAssuntosWS(ArrayOfAssuntoWS parametros) {
		this.parametros = parametros;
	}

	/**
	 * @return the parametros
	 */
	public ArrayOfAssuntoWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(ArrayOfAssuntoWS parametros) {
		this.parametros = parametros;
	}
}
