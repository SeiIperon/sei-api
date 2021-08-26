package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.ArrayOfUnidadeWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respostaListarUnidadesWS", propOrder = {
    "parametros"
})
public class RespostaListarUnidadesWS {

	private ArrayOfUnidadeWS parametros;

	public RespostaListarUnidadesWS() {

	}

	public RespostaListarUnidadesWS(ArrayOfUnidadeWS parametros) {
		super();
		this.parametros = parametros;
	}

	/**
	 * @return the parametros
	 */
	public ArrayOfUnidadeWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(ArrayOfUnidadeWS parametros) {
		this.parametros = parametros;
	}
}
