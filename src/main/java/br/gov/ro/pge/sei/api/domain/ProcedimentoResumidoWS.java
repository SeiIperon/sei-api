/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProcedimentoResumidoWS {

	private BigDecimal idProcedimento;
	private String procedimentoFormatado;
	private TipoProcedimentoWS tipoProcedimento;
}
