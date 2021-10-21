package br.gov.ro.pge.sei.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TipoDocumentoWS {

	DOCUMENTO_GERADO("G"), DOCUMENTO_RECEBIDO("R");

	@Getter
	@Setter
	private String codSinalizador;

	TipoDocumentoWS(String codSinalizador) {
		this.codSinalizador = codSinalizador;
	}
}
