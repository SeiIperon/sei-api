/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

/**
 * @author Memora
 *
 */
public enum SinReabrirWS {
	
	SIM("S"), NAO("N");

	private String codSinalizador;

	private SinReabrirWS(String codSinalizador) {
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
