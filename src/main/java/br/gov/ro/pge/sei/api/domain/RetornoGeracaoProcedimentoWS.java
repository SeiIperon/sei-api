package br.gov.ro.pge.sei.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RetornoGeracaoProcedimentoWS {

	private Long idProcedimento;
	private String procedimentoFormatado;
	private String linkAcesso;
}
