/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Memora
 *
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SinReabrirWS {
	
	SIM("S"), NAO("N");

	@Getter
	@Setter
	private String codSinalizador;

	SinReabrirWS(String codSinalizador) {
		this.codSinalizador = codSinalizador;
	}
}
