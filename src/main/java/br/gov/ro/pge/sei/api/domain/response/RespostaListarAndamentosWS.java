package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.ArrayOfAndamentoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respostaListarAndamentosWS", propOrder = {
    "parametros"
})
public class RespostaListarAndamentosWS {

	private ArrayOfAndamentoWS parametros;

	public RespostaListarAndamentosWS() {
		
	}

	/**
	 * @param parametros
	 */
	public RespostaListarAndamentosWS(ArrayOfAndamentoWS parametros) {
		this.parametros = parametros;
	}

	/**
	 * @return the parametros
	 */
	public ArrayOfAndamentoWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(ArrayOfAndamentoWS parametros) {
		this.parametros = parametros;
	}
}
