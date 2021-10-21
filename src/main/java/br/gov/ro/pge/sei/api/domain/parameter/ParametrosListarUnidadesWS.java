/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.parameter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author Memora
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosListarUnidadesWS {

	@NotNull
	private String siglaSistema;

	@NotNull
	private String identificacaoServico;

	private Long idTipoProcedimento;

	private Long idSerie;

	private String sigla;
}
