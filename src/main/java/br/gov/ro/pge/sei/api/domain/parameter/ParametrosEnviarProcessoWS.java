/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.*;
import lombok.*;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;

/**
 * @author Memora
 *
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosEnviarProcessoWS {

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
	@Getter @Setter
	private ArrayOfIdUnidadeWS unidadesDestino;

	@Setter
	private SinManterAbertoUnidadeWS sinManterAbertoUnidade;

	@Setter
	private SinRemoverAnotacaoWS sinRemoverAnotacao;

	@Setter
	private SinEnviarEmailNotificacaoWS sinEnviarEmailNotificacao;

	@Getter @Setter
	private String dataRetornoProgramado;

	@Getter @Setter
	private Integer diasRetornoProgramado;

	@Setter
	private SinDiasUteisRetornoProgramadoWS sinDiasUteisRetornoProgramado;

	@Setter
	private SinReabrirWS sinReabrir;

	/**
	 * @return the sinManterAbertoUnidade
	 */
	public SinManterAbertoUnidadeWS getSinManterAbertoUnidade() {
		if (ObjectUtils.isEmpty(this.sinManterAbertoUnidade)) {
			this.sinManterAbertoUnidade = SinManterAbertoUnidadeWS.NAO;
		}
		return sinManterAbertoUnidade;
	}

	/**
	 * @return the sinRemoverAnotacao
	 */
	public SinRemoverAnotacaoWS getSinRemoverAnotacao() {
		if (ObjectUtils.isEmpty(this.sinRemoverAnotacao)) {
			this.sinRemoverAnotacao = SinRemoverAnotacaoWS.NAO;
		}
		return sinRemoverAnotacao;
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
	 * @return the sinDiasUteisRetornoProgramado
	 */
	public SinDiasUteisRetornoProgramadoWS getSinDiasUteisRetornoProgramado() {
		if (ObjectUtils.isEmpty(this.sinDiasUteisRetornoProgramado)) {
			this.sinDiasUteisRetornoProgramado = SinDiasUteisRetornoProgramadoWS.NAO;
		}
		return sinDiasUteisRetornoProgramado;
	}

	/**
	 * @return the sinReabrir
	 */
	public SinReabrirWS getSinReabrir() {
		if (ObjectUtils.isEmpty(this.sinReabrir)) {
			this.sinReabrir = SinReabrirWS.NAO;
		}
		return sinReabrir;
	}
}
