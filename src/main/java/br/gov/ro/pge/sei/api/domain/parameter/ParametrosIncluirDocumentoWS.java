package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.DocumentoWS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosIncluirDocumentoWS {
	
	@NotNull
	private String siglaSistema;

	@NotNull
	private String identificacaoServico;

	@NotNull
	private Long idUnidade;

	@NotNull
	private DocumentoWS documento;
}