package br.gov.ro.pge.sei.api.domain;

public enum TipoDocumentoWS {

	DOCUMENTO_GERADO("G"), DOCUMENTO_RECEBIDO("R");

	private String codSinalizador;

	private TipoDocumentoWS(String codSinalizador) {
		this.codSinalizador = codSinalizador;
	}

	/**
	 * @return the codSinalizador
	 */
	public String getCodSinalizador() {
		return codSinalizador;
	}

	/**
	 * @param codSinalizador
	 *            the codSinalizador to set
	 */
	public void setCodSinalizador(String codSinalizador) {
		this.codSinalizador = codSinalizador;
	}
}
