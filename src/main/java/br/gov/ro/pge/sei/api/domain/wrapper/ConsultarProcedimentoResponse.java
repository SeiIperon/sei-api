/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.wrapper;

import br.gov.ro.pge.sei.api.domain.RetornoConsultaProcedimentoWS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author janon.sousa
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsultarProcedimentoResponse {
	private RetornoConsultaProcedimentoWS parametros;
}
