/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseRelacionarProcessoWS {
	
	private String parametros;
}
