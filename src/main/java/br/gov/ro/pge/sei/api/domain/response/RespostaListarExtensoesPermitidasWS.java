package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.ArrayOfArquivoExtensaoWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respostaListarExtensoesPermitidasWS", propOrder = {
    "parametros"
})
public class RespostaListarExtensoesPermitidasWS {

	private ArrayOfArquivoExtensaoWS parametros;

	public RespostaListarExtensoesPermitidasWS() {
		// --
	}

	/**
	 * @param parametros
	 */
	public RespostaListarExtensoesPermitidasWS(
			ArrayOfArquivoExtensaoWS parametros) {
		super();
		this.parametros = parametros;
	}

	/**
	 * @return the parametros
	 */
	public ArrayOfArquivoExtensaoWS getParametros() {
		return parametros;
	}

	/**
	 * @param parametros
	 *            the parametros to set
	 */
	public void setParametros(ArrayOfArquivoExtensaoWS parametros) {
		this.parametros = parametros;
	}
}
