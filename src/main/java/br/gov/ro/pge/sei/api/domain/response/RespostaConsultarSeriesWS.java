package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.ArrayOfSerieWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respostaConsultarSeriesWS", propOrder = {
    "parametros"
})
public class RespostaConsultarSeriesWS {

	private ArrayOfSerieWS parametros;

	public RespostaConsultarSeriesWS() {
		// --
	}

	public RespostaConsultarSeriesWS(ArrayOfSerieWS parametros) {
		super();
		this.parametros = parametros;
	}

	/**
	 * @return the parametros
	 */
	public ArrayOfSerieWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(ArrayOfSerieWS parametros) {
		this.parametros = parametros;
	}
}
