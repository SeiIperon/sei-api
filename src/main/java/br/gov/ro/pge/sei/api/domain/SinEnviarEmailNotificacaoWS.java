package br.gov.ro.pge.sei.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SinEnviarEmailNotificacaoWS {

	SIM("S"), NAO("N");

	@Getter
	@Setter
	private String codSinalizador;

	SinEnviarEmailNotificacaoWS(String codSinalizador) {
		this.codSinalizador = codSinalizador;
	}
}
