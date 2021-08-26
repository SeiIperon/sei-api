package br.gov.ro.pge.sei.api.domain;

public enum SinBloqueadoWS {

	SIM("S"), NAO("N");

	private String codSinalizador;

	private SinBloqueadoWS(String codSinalizador) {
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
