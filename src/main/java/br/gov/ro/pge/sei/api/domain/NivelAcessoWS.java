package br.gov.ro.pge.sei.api.domain;

public enum NivelAcessoWS {

	PUBLICO(0), RESTRITO(1), SIGILOSO(2);

	private Integer codSinalizador;

	private NivelAcessoWS(Integer codSinalizador) {
		this.setCodSinalizador(codSinalizador);
	}

	/**
	 * @return the codSinalizador
	 */
	public Integer getCodSinalizador() {
		return codSinalizador;
	}

	/**
	 * @param codSinalizador
	 *            the codSinalizador to set
	 */
	public void setCodSinalizador(Integer codSinalizador) {
		this.codSinalizador = codSinalizador;
	}
}
