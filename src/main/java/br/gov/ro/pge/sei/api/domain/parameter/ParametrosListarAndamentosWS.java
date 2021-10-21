package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.SinRetornarAtributosWS;
import lombok.*;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;


@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosListarAndamentosWS {

	@NotNull
	@Getter @Setter
	private String siglaSistema;

	@NotNull
	@Getter @Setter
	private String identificacaoServico;

	@NotNull
	@Getter @Setter
	private Long idUnidade;

	@NotNull
	@Getter @Setter
	private String protocoloProcedimento;

	@NotNull
	@Setter
	private SinRetornarAtributosWS sinRetornarAtributos;

	/**
	 * @return the sinRetornarAtributos
	 */
	public SinRetornarAtributosWS getSinRetornarAtributos() {
		if (ObjectUtils.isEmpty(this.sinRetornarAtributos)) {
			this.sinRetornarAtributos = SinRetornarAtributosWS.SIM;
		}
		return sinRetornarAtributos;
	}
}
