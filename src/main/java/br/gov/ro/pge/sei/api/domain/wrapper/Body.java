package br.gov.ro.pge.sei.api.domain.wrapper;

import br.gov.ro.pge.sei.api.domain.response.RespostaConsultarSeriesWS;
import br.gov.ro.pge.sei.api.domain.response.RespostaListarUnidadesWS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Body {

	private GerarProcedimentoResponse gerarProcedimentoResponse;
	private IncluirDocumentoResponse incluirDocumentoResponse;
	private ListarAndamentosResponse listarAndamentosResponse;
	private ConcluirProcessoResponse concluirProcessoResponse;
	private ConcluirProcessoResponse enviarProcessoResponse;
	private RespostaListarUnidadesWS listarUnidades;
	private RespostaConsultarSeriesWS listarSeries;
	private ConsultarProcedimentoResponse consultarProcedimentoResponse;
	private ConsultarDocumentoResponse consultarDocumentoResponse;
	private ListarExtensoesPermitidasResponse listarExtensoesPermitidasResponse;
	
	private RelacionarProcessoResponse relacionarProcessoResponse;
	
	private Fault fault;
}
