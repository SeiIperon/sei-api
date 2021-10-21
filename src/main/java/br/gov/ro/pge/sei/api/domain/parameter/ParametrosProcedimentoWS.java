package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.ArrayOfAssuntoWS;
import br.gov.ro.pge.sei.api.domain.ArrayOfInteressadoWS;
import br.gov.ro.pge.sei.api.domain.NivelAcessoWS;
import lombok.*;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosProcedimentoWS {

	@NotNull
	@Getter @Setter
	private Long idTipoProcedimento;

	@Getter @Setter
	private String numeroProtocolo;

	@Getter @Setter
	private Date dataAutuacao;

	@Getter @Setter
	private String especificacao;

	@Getter @Setter
	private ArrayOfAssuntoWS assuntos;

	@Getter @Setter
	private ArrayOfInteressadoWS interessados;

	@Getter @Setter
	private String observacao;

	@Setter
	private NivelAcessoWS nivelAcesso;

	@Getter @Setter
	private String idHipoteseLegal;

	/**
	 * @return the nivelAcesso
	 */
	public NivelAcessoWS getNivelAcesso() {
		if (ObjectUtils.isEmpty(this.nivelAcesso)) {
			this.nivelAcesso = NivelAcessoWS.PUBLICO;
		}
		return nivelAcesso;
	}
}