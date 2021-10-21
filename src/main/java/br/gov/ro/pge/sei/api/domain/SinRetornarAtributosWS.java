package br.gov.ro.pge.sei.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SinRetornarAtributosWS {

	SIM("S"), NAO("N");

	@Getter
	@Setter
	private String codSinalizador;

	SinRetornarAtributosWS(String codSinalizador) {
		this.codSinalizador = codSinalizador;
	}
}
