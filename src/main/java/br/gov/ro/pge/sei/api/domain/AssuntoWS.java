package br.gov.ro.pge.sei.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AssuntoWS {

	private Long idAssunto;

	@NotNull
	private String codigoEstruturado;

	@NotNull
	private String descricao;
}