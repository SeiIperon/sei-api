package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.RetornoInclusaoDocumentoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respostaIncluirDocumentoWS", propOrder = {
    "parametros"
})
public class RespostaIncluirDocumentoWS {

	private RetornoInclusaoDocumentoWS parametros;

	/**
	 * @return the parametros
	 */
	public RetornoInclusaoDocumentoWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(RetornoInclusaoDocumentoWS parametros) {
		this.parametros = parametros;
	}
}
