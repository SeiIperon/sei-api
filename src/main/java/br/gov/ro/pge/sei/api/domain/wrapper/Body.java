package br.gov.ro.pge.sei.api.domain.wrapper;

import br.gov.ro.pge.sei.api.domain.response.RespostaConsultarSeriesWS;
import br.gov.ro.pge.sei.api.domain.response.RespostaListarUnidadesWS;

public class Body {

	private GerarProcedimentoResponse gerarProcedimentoResponse;
	private IncluirDocumentoResponse incluirDocumentoResponse;
	private ListarAndamentosResponse listarAndamentosResponse;
	private ConcluirProcessoResponse concluirProcessoResponse;
	private ConcluirProcessoResponse enviarProcessoResponse;
	private RespostaListarUnidadesWS listarUnidades;
	private RespostaConsultarSeriesWS listarSeries;
	private ConsultarProcedimentoResponse consultarProcedimentoResponse;
	private ListarExtensoesPermitidasResponse listarExtensoesPermitidasResponse;
	
	private RelacionarProcessoResponse relacionarProcessoResponse;
	
	private Fault fault;

	/**
	 * @return the gerarProcedimentoResponse
	 */
	public GerarProcedimentoResponse getGerarProcedimentoResponse() {
		return gerarProcedimentoResponse;
	}

	/**
	 * @param gerarProcedimentoResponse
	 *            the gerarProcedimentoResponse to set
	 */
	public void setGerarProcedimentoResponse(
			GerarProcedimentoResponse gerarProcedimentoResponse) {
		this.gerarProcedimentoResponse = gerarProcedimentoResponse;
	}

	/**
	 * @return the incluirDocumentoResponse
	 */
	public IncluirDocumentoResponse getIncluirDocumentoResponse() {
		return incluirDocumentoResponse;
	}

	/**
	 * @param incluirDocumentoResponse
	 *            the incluirDocumentoResponse to set
	 */
	public void setIncluirDocumentoResponse(
			IncluirDocumentoResponse incluirDocumentoResponse) {
		this.incluirDocumentoResponse = incluirDocumentoResponse;
	}

	/**
	 * @return the listarAndamentosResponse
	 */
	public ListarAndamentosResponse getListarAndamentosResponse() {
		return listarAndamentosResponse;
	}

	/**
	 * @param listarAndamentosResponse
	 *            the listarAndamentosResponse to set
	 */
	public void setListarAndamentosResponse(
			ListarAndamentosResponse listarAndamentosResponse) {
		this.listarAndamentosResponse = listarAndamentosResponse;
	}

	/**
	 * @return the concluirProcessoResponse
	 */
	public ConcluirProcessoResponse getConcluirProcessoResponse() {
		return concluirProcessoResponse;
	}

	/**
	 * @param concluirProcessoResponse
	 *            the concluirProcessoResponse to set
	 */
	public void setConcluirProcessoResponse(
			ConcluirProcessoResponse concluirProcessoResponse) {
		this.concluirProcessoResponse = concluirProcessoResponse;
	}

	/**
	 * @return the enviarProcessoResponse
	 */
	public ConcluirProcessoResponse getEnviarProcessoResponse() {
		return enviarProcessoResponse;
	}

	/**
	 * @param enviarProcessoResponse
	 *            the enviarProcessoResponse to set
	 */
	public void setEnviarProcessoResponse(
			ConcluirProcessoResponse enviarProcessoResponse) {
		this.enviarProcessoResponse = enviarProcessoResponse;
	}

	/**
	 * @return the listarUnidades
	 */
	public RespostaListarUnidadesWS getListarUnidades() {
		return listarUnidades;
	}

	/**
	 * @param listarUnidades
	 *            the listarUnidades to set
	 */
	public void setListarUnidades(RespostaListarUnidadesWS listarUnidades) {
		this.listarUnidades = listarUnidades;
	}

	/**
	 * @return the listarSeries
	 */
	public RespostaConsultarSeriesWS getListarSeries() {
		return listarSeries;
	}

	/**
	 * @param listarSeries
	 *            the listarSeries to set
	 */
	public void setListarSeries(RespostaConsultarSeriesWS listarSeries) {
		this.listarSeries = listarSeries;
	}

	/**
	 * @return the consultarProcedimentoResponse
	 */
	public ConsultarProcedimentoResponse getConsultarProcedimentoResponse() {
		return consultarProcedimentoResponse;
	}

	/**
	 * @param consultarProcedimentoResponse
	 *            the consultarProcedimentoResponse to set
	 */
	public void setConsultarProcedimentoResponse(
			ConsultarProcedimentoResponse consultarProcedimentoResponse) {
		this.consultarProcedimentoResponse = consultarProcedimentoResponse;
	}

	/**
	 * @return the listarExtensoesPermitidasResponse
	 */
	public ListarExtensoesPermitidasResponse getListarExtensoesPermitidasResponse() {
		return listarExtensoesPermitidasResponse;
	}

	/**
	 * @param listarExtensoesPermitidasResponse
	 *            the listarExtensoesPermitidasResponse to set
	 */
	public void setListarExtensoesPermitidasResponse(
			ListarExtensoesPermitidasResponse listarExtensoesPermitidasResponse) {
		this.listarExtensoesPermitidasResponse = listarExtensoesPermitidasResponse;
	}

	/**
	 * @return the fault
	 */
	public Fault getFault() {
		return fault;
	}

	/**
	 * @param fault
	 *            the fault to set
	 */
	public void setFault(Fault fault) {
		this.fault = fault;
	}

	/**
	 * @return the relacionarProcessoResponse
	 */
	public RelacionarProcessoResponse getRelacionarProcessoResponse() {
		return relacionarProcessoResponse;
	}

	/**
	 * @param relacionarProcessoResponse the relacionarProcessoResponse to set
	 */
	public void setRelacionarProcessoResponse(RelacionarProcessoResponse relacionarProcessoResponse) {
		this.relacionarProcessoResponse = relacionarProcessoResponse;
	}

}
