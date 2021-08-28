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
public class RemetenteWS {

	@NotNull
	private Long idRemetente;

	@NotNull
	private String sigla;

	@NotNull
	private String nome;
}