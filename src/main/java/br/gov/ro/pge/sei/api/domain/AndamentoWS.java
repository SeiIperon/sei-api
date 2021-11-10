package br.gov.ro.pge.sei.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AndamentoWS {

	private Long idAndamento;
	private Long idTarefa;
	private Long idTarefaModulo;
	private String descricao;
	private String dataHora;

	private UnidadeWS unidade;

	private UsuarioWS usuario;

	private ArrayOfAtributoAndamentoWS atributos;
}
