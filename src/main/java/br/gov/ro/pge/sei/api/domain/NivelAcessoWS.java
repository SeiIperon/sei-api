package br.gov.ro.pge.sei.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum NivelAcessoWS {

	PUBLICO(0), RESTRITO(1), SIGILOSO(2);

	@Getter
	@Setter
	private Integer codSinalizador;

	NivelAcessoWS(Integer codSinalizador) {
		this.codSinalizador = codSinalizador;
	}
}
