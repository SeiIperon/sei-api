/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.parameter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author janon.sousa
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosRelacionarProcessoWS {

	@NotNull
	private String siglaSistema;

	@NotNull
	private String identificacaoServico;

	@NotNull
	private BigDecimal idUnidade;

	@NotNull
	private String protocoloProcedimento1;

	@NotNull
	private String protocoloProcedimento2;
}
