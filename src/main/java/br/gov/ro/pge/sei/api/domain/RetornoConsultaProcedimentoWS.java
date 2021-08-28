/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RetornoConsultaProcedimentoWS {

	private Long idProcedimento;
	private String procedimentoFormatado;
	private String especificacao;
	private Date dataAutuacao;
	private String linkAcesso;

	private TipoProcedimentoWS tipoProcedimento;

	private AndamentoWS andamentoGeracao;
	private AndamentoWS andamentoConclusao;
	private AndamentoWS ultimoAndamento;

	private ArrayOfUnidadeProcedimentoAbertoWS unidadesProcedimentoAberto;

	private ArrayOfAssuntoWS assuntos;
	private ArrayOfInteressadoWS interessados;

	private ArrayOfObservacaoWS observacoes;

	private ArrayOfProcedimentoResumidoWS procedimentosRelacionados;
	private ArrayOfProcedimentoResumidoWS procedimentosAnexados;
}
