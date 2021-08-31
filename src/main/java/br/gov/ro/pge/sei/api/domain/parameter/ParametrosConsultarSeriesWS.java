package br.gov.ro.pge.sei.api.domain.parameter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosConsultarSeriesWS {

	@NotNull
	private String siglaSistema;

	@NotNull
	private String identificacaoServico;

	private Long idUnidade;

	private Long idTipoProcedimento;

	private String nome;
}