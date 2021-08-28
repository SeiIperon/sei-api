package br.gov.ro.pge.sei.api.domain.parameter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosListarExtensoesPermitidasWS {

	@NotNull
	private String siglaSistema;

	@NotNull
	private String identificacaoServico;

	private Long idUnidade;

	private Long idArquivoExtensao;

	public ParametrosListarExtensoesPermitidasWS(String siglaSistema, String identificacaoServico, Long idUnidade) {
		this.siglaSistema = siglaSistema;
		this.identificacaoServico = identificacaoServico;
		this.idUnidade = idUnidade;
	}
}