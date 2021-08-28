package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.SinDiasUteisRetornoProgramadoWS;
import br.gov.ro.pge.sei.api.domain.SinEnviarEmailNotificacaoWS;
import br.gov.ro.pge.sei.api.domain.SinManterAbertoUnidadeWS;
import lombok.*;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosGerarProcedimentoWS {

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
	private ParametrosProcedimentoWS procedimento;
	
	@Setter
	private SinManterAbertoUnidadeWS sinManterAbertoUnidade;

	@Setter
	private SinEnviarEmailNotificacaoWS sinEnviarEmailNotificacao;

	@Getter @Setter
	private Date dataRetornoProgramado;

	@Getter @Setter
	private Long diasRetornoProgramado;

	@Setter
	private SinDiasUteisRetornoProgramadoWS sinDiasUteisRetornoProgramado;

	@Getter @Setter
	private Long idMarcador;

	@Getter @Setter
	private String textoMarcador;

	/**
	 * @return the sinManterAbertoUnidade
	 */
	public SinManterAbertoUnidadeWS getSinManterAbertoUnidade() {
		if (ObjectUtils.isEmpty(this.sinManterAbertoUnidade)) {
			this.sinManterAbertoUnidade = SinManterAbertoUnidadeWS.SIM;
		}
		return sinManterAbertoUnidade;
	}

	/**
	 * @return the sinEnviarEmailNotificacao
	 */
	public SinEnviarEmailNotificacaoWS getSinEnviarEmailNotificacao() {
		if (ObjectUtils.isEmpty(this.sinEnviarEmailNotificacao)) {
			this.sinEnviarEmailNotificacao = SinEnviarEmailNotificacaoWS.NAO;
		}
		return sinEnviarEmailNotificacao;
	}

	/**
	 * @return the sinDiasUteisRetornoProgramadoWS
	 */
	public SinDiasUteisRetornoProgramadoWS getSinDiasUteisRetornoProgramado() {
		if (ObjectUtils.isEmpty(this.sinDiasUteisRetornoProgramado)) {
			this.sinDiasUteisRetornoProgramado = SinDiasUteisRetornoProgramadoWS.NAO;
		}
		return sinDiasUteisRetornoProgramado;
	}
}