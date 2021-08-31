/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.wrapper;

import br.gov.ro.pge.sei.api.domain.ArrayOfArquivoExtensaoWS;
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
public class ListarExtensoesPermitidasResponse {
	private ArrayOfArquivoExtensaoWS parametros;
}
