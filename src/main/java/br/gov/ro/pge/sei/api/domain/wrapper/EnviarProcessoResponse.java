/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Memora
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnviarProcessoResponse {
	private String parametros;
}
