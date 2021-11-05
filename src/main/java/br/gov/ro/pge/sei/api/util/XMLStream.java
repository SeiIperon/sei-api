package br.gov.ro.pge.sei.api.util;

import br.gov.ro.pge.sei.api.domain.*;
import br.gov.ro.pge.sei.api.domain.response.RespostaConsultarSeriesWS;
import br.gov.ro.pge.sei.api.domain.response.RespostaListarUnidadesWS;
import br.gov.ro.pge.sei.api.domain.wrapper.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.util.TimeZone;

public final class XMLStream {
	
	public static final XMLStream DESERIALIZED = new XMLStream();
	
	public Envelope getFault(String xml) {
		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("SOAP-ENV:Fault", Body.class, "fault");
		
		xstream.aliasField("faultcode", Fault.class, "faultcode");
		xstream.aliasField("faultstring", Fault.class, "faultstring");

		xstream.aliasField("detail", Detail.class, "detail");
		
		xstream.aliasField("item", Item.class, "item");
		xstream.aliasField("key", Item.class, "key");
		xstream.aliasField("value", Item.class, "value");

		Object obj = xstream.fromXML(xml);
		return (Envelope) obj;
	}
	
	public Envelope getGerarProcedimento(String xml) {
		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("ns1:gerarProcedimentoResponse", Body.class, "gerarProcedimentoResponse");
		
		xstream.alias("parametros", RetornoGeracaoProcedimentoWS.class);
		xstream.aliasField("IdProcedimento", RetornoGeracaoProcedimentoWS.class, "idProcedimento");
		xstream.aliasField("ProcedimentoFormatado", RetornoGeracaoProcedimentoWS.class, "procedimentoFormatado");
		xstream.aliasField("LinkAcesso", RetornoGeracaoProcedimentoWS.class, "linkAcesso");
		
		xstream.ignoreUnknownElements();
		Envelope envelope = (Envelope) xstream.fromXML(xml);
		return envelope;
	}
	
	public Envelope getIncluirDocumento(String xml) {
		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("ns1:incluirDocumentoResponse", Body.class, "incluirDocumentoResponse");
		
		xstream.alias("parametros", RetornoInclusaoDocumentoWS.class);
		xstream.aliasField("IdDocumento", RetornoInclusaoDocumentoWS.class, "idDocumento");
		xstream.aliasField("DocumentoFormatado", RetornoInclusaoDocumentoWS.class, "documentoFormatado");
		xstream.aliasField("LinkAcesso", RetornoInclusaoDocumentoWS.class, "linkAcesso");
		
		xstream.ignoreUnknownElements();
		Envelope envelope = (Envelope) xstream.fromXML(xml);
		return envelope;
	}
	
	public Envelope getListarAndamentos(String xml) {
		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("ns1:listarAndamentosResponse", Body.class, "listarAndamentosResponse");
		
		xstream.aliasField("parametros", ListarAndamentosResponse.class, "parametros");
		xstream.aliasField("item", ArrayOfAndamentoWS.class, "andamento");
		
		xstream.alias("item xsi:type=\"ns1:Andamento\"", AndamentoWS.class);
		xstream.aliasField("IdAndamento", AndamentoWS.class, "idAndamento");
		xstream.aliasField("IdTarefa", AndamentoWS.class, "idTarefa");
		xstream.aliasField("Descricao", AndamentoWS.class, "descricao");
		xstream.aliasField("DataHora", AndamentoWS.class, "dataHora");
		
		xstream.aliasField("Unidade", AndamentoWS.class, "unidade");
		xstream.aliasField("IdUnidade", UnidadeWS.class, "idUnidade");
		xstream.aliasField("Sigla", UnidadeWS.class, "sigla");
		xstream.aliasField("Descricao", UnidadeWS.class, "descricao");
		
		xstream.aliasField("Usuario", AndamentoWS.class, "usuario");
		xstream.aliasField("IdUsuario", UsuarioWS.class, "idUsuario");
		xstream.aliasField("Sigla", UsuarioWS.class, "sigla");
		xstream.aliasField("Nome", UsuarioWS.class, "nome");
		
		xstream.aliasField("Atributos", AndamentoWS.class, "atributos");
		xstream.alias("item xsi:type=\"ns1:AtributoAndamento\"", AtributoAndamentoWS.class);
		xstream.aliasField("Nome", AtributoAndamentoWS.class, "nome");
		xstream.aliasField("Valor", AtributoAndamentoWS.class, "valor");
		xstream.aliasField("IdOrigem", AtributoAndamentoWS.class, "idOrigem");
		
		xstream.addImplicitCollection(ArrayOfAndamentoWS.class, "andamento", "item xsi:type=\"ns1:Andamento\"", AndamentoWS.class);
		xstream.addImplicitCollection(ArrayOfAtributoAndamentoWS.class, "item", "item xsi:type=\"ns1:AtributoAndamento\"", AtributoAndamentoWS.class);
		
		Envelope envelope = (Envelope) xstream.fromXML(xml);
		return envelope;
	}
	
	public Envelope getConcluirProcesso(String xml) {
		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("ns1:concluirProcessoResponse", Body.class, "concluirProcessoResponse");
		
		xstream.aliasField("parametros", ConcluirProcessoResponse.class, "parametros");
		
		xstream.ignoreUnknownElements();
		Envelope envelope = (Envelope) xstream.fromXML(xml);
		return envelope;
	}
	
	public Envelope getEnviarProcesso(String xml) {
		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("ns1:enviarProcessoResponse", Body.class, "enviarProcessoResponse");
		
		xstream.aliasField("parametros", EnviarProcessoResponse.class, "parametros");
		
		xstream.ignoreUnknownElements();
		Envelope envelope = (Envelope) xstream.fromXML(xml);
		return envelope;
	}
	
	public Envelope getListarUnidades(String xml) {
		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("ns1:listarUnidadesResponse", Body.class, "listarUnidades");
		
		xstream.aliasField("parametros", RespostaListarUnidadesWS.class, "parametros");
		xstream.aliasField("item", ArrayOfUnidadeWS.class, "item");
		
		xstream.alias("item xsi:type=\"ns1:Unidade\"", UnidadeWS.class);
		xstream.aliasField("IdUnidade", UnidadeWS.class, "idUnidade");
		xstream.aliasField("Sigla", UnidadeWS.class, "sigla");
		xstream.aliasField("Descricao", UnidadeWS.class, "descricao");
		
		xstream.addImplicitCollection(ArrayOfUnidadeWS.class, "item", "item xsi:type=\"ns1:Unidade\"", UnidadeWS.class);
		
		xstream.ignoreUnknownElements();
		Envelope envelope = (Envelope) xstream.fromXML(xml);
		return envelope;
	}
	
	public Envelope getListarSeries(String xml) {
		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("ns1:listarSeriesResponse", Body.class, "listarSeries");
		
		xstream.aliasField("parametros", RespostaConsultarSeriesWS.class, "parametros");
		xstream.aliasField("item", ArrayOfSerieWS.class, "item");
		
		xstream.alias("item xsi:type=\"ns1:Serie\"", SerieWS.class);
		xstream.aliasField("IdSerie", SerieWS.class, "idSerie");
		xstream.aliasField("Nome", SerieWS.class, "nome");
		xstream.aliasField("Aplicabilidade", SerieWS.class, "aplicabilidade");
		
		xstream.addImplicitCollection(ArrayOfSerieWS.class, "item", "item xsi:type=\"ns1:Serie\"", SerieWS.class);
		
		xstream.ignoreUnknownElements();
		Envelope envelope = (Envelope) xstream.fromXML(xml);
		return envelope;
	}
	
	public Envelope getConsultarProcedimento(String xml) {
		// --
		final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
		// --
		XStream xstream = new XStream(new DomDriver());
		// --
		xstream.registerConverter(new DateConverter(DATE_FORMAT, new String[] { "dd/MM/yyyy" }, TimeZone.getDefault()));
		// --
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("ns1:consultarProcedimentoResponse", Body.class, "consultarProcedimentoResponse");
		
		xstream.alias("parametros", RetornoConsultaProcedimentoWS.class);
		xstream.aliasField("IdProcedimento", RetornoConsultaProcedimentoWS.class, "idProcedimento");
		xstream.aliasField("ProcedimentoFormatado", RetornoConsultaProcedimentoWS.class, "procedimentoFormatado");
		xstream.aliasField("Especificacao", RetornoConsultaProcedimentoWS.class, "especificacao");
		xstream.aliasField("DataAutuacao", RetornoConsultaProcedimentoWS.class, "dataAutuacao");
		xstream.aliasField("LinkAcesso", RetornoConsultaProcedimentoWS.class, "linkAcesso");
		
		xstream.aliasField("TipoProcedimento", RetornoConsultaProcedimentoWS.class, "tipoProcedimento");
		xstream.aliasField("IdTipoProcedimento", TipoProcedimentoWS.class, "idTipoProcedimento");
		xstream.aliasField("Nome", TipoProcedimentoWS.class, "nome");
		
		xstream.aliasField("UnidadesProcedimentoAberto", RetornoConsultaProcedimentoWS.class, "unidadesProcedimentoAberto");		
		xstream.aliasField("item xsi:type=\"ns1:UnidadeProcedimentoAberto\"", ArrayOfUnidadeProcedimentoAbertoWS.class, "item");
		xstream.aliasField("Unidade", UnidadeProcedimentoAbertoWS.class, "unidade");
		xstream.aliasField("IdUnidade", UnidadeWS.class, "idUnidade");
		xstream.aliasField("Sigla", UnidadeWS.class, "sigla");
		xstream.aliasField("Descricao", UnidadeWS.class, "descricao");		
		xstream.addImplicitCollection(ArrayOfUnidadeProcedimentoAbertoWS.class, "item", "item xsi:type=\"ns1:UnidadeProcedimentoAberto\"", UnidadeProcedimentoAbertoWS.class);		
		
		xstream.aliasField("ProcedimentosRelacionados", RetornoConsultaProcedimentoWS.class, "procedimentosRelacionados");
		xstream.aliasField("item xsi:type=\"ns1:ProcedimentoResumido\"", ArrayOfProcedimentoResumidoWS.class, "item");
		xstream.aliasField("IdProcedimento", ProcedimentoResumidoWS.class, "idProcedimento");
		xstream.aliasField("ProcedimentoFormatado", ProcedimentoResumidoWS.class, "procedimentoFormatado");
		xstream.aliasField("TipoProcedimento", ProcedimentoResumidoWS.class, "tipoProcedimento");
		xstream.aliasField("IdTipoProcedimento", TipoProcedimentoWS.class, "idTipoProcedimento");
		xstream.aliasField("Nome", TipoProcedimentoWS.class, "nome");
		xstream.addImplicitCollection(ArrayOfProcedimentoResumidoWS.class, "item", "item xsi:type=\"ns1:ProcedimentoResumido\"", ProcedimentoResumidoWS.class);
		
		xstream.ignoreUnknownElements();
		Envelope envelope = (Envelope) xstream.fromXML(xml);
		return envelope;
	}

	public Envelope getConsultarDocumento(String xml) {
		// --
		final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
		// --
		XStream xstream = new XStream(new DomDriver());
		// --
		xstream.registerConverter(new DateConverter(DATE_FORMAT, new String[] { "dd/MM/yyyy" }, TimeZone.getDefault()));
		// --
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("ns1:consultarDocumentoResponse", Body.class, "consultarDocumentoResponse");

		xstream.alias("parametros", RetornoConsultaDocumentoWS.class);
		xstream.aliasField("IdProcedimento", RetornoConsultaDocumentoWS.class, "idProcedimento");
		xstream.aliasField("ProcedimentoFormatado", RetornoConsultaDocumentoWS.class, "procedimentoFormatado");
		xstream.aliasField("IdDocumento", RetornoConsultaDocumentoWS.class, "idDocumento");
		xstream.aliasField("DocumentoFormatado", RetornoConsultaDocumentoWS.class, "documentoFormatado");
		xstream.aliasField("LinkAcesso", RetornoConsultaDocumentoWS.class, "linkAcesso");

		xstream.aliasField("Serie", SerieWS.class, "serie");
		xstream.aliasField("IdSerie", SerieWS.class, "idSerie");
		xstream.aliasField("Nome", SerieWS.class, "nome");
		xstream.aliasField("Aplicabilidade", SerieWS.class, "aplicabilidade");

		xstream.aliasField("Numero", RetornoConsultaDocumentoWS.class, "numero");
		xstream.aliasField("Descricao", RetornoConsultaDocumentoWS.class, "descricao");
		xstream.aliasField("Data", RetornoConsultaDocumentoWS.class, "data");

		xstream.aliasField("UnidadeElaboradora", UnidadeWS.class, "unidadeElaboradora");
		xstream.aliasField("IdUnidade", UnidadeWS.class, "idUnidade");
		xstream.aliasField("Sigla", UnidadeWS.class, "sigla");
		xstream.aliasField("Descricao", UnidadeWS.class, "descricao");

		xstream.aliasField("AndamentoGeracao", AndamentoWS.class, "andamentoGeracao");
		xstream.aliasField("IdAndamento", AndamentoWS.class, "idAndamento");
		xstream.aliasField("IdTarefa", AndamentoWS.class, "idTarefa");
		xstream.aliasField("Descricao", AndamentoWS.class, "descricao");
		xstream.aliasField("DataHora", AndamentoWS.class, "dataHora");
		xstream.aliasField("Unidade", AndamentoWS.class, "unidade");
		xstream.aliasField("Usuario", AndamentoWS.class, "usuario");

		xstream.aliasField("Item", ArrayOfAtributoAndamentoWS.class, "item");
		xstream.alias("item xsi:type=\"ns1:ArquivoExtensao\"", AtributoAndamentoWS.class);
		xstream.aliasField("Nome", AtributoAndamentoWS.class, "nome");
		xstream.aliasField("Valor", AtributoAndamentoWS.class, "valor");
		xstream.aliasField("IdOrigem", AtributoAndamentoWS.class, "idOrigem");
		xstream.addImplicitCollection(ArrayOfAtributoAndamentoWS.class, "andamento", "item xsi:type=\"ns1:andamento\"", AtributoAndamentoWS.class);

		xstream.aliasField("Assinaturas", ArrayOfAssinaturaWS.class, "assinaturas");
		xstream.alias("item xsi:type=\"ns1:assinaturas\"", AssinaturaWS.class);
		xstream.aliasField("Nome", AssinaturaWS.class, "nome");
		xstream.aliasField("CargoFuncao", AssinaturaWS.class, "cargoFuncao");
		xstream.aliasField("DataHora", AssinaturaWS.class, "dataHora");
		xstream.aliasField("IdUsuario", AssinaturaWS.class, "idUsuario");
		xstream.aliasField("IdOrigem", AssinaturaWS.class, "idOrigem");
		xstream.aliasField("IdOrgao", AssinaturaWS.class, "idOrgao");
		xstream.aliasField("Sigla", AssinaturaWS.class, "sigla");
		xstream.addImplicitCollection(ArrayOfAssinaturaWS.class, "assinaturas", "item xsi:type=\"ns1:assinatura\"", AssinaturaWS.class);

		xstream.aliasField("Publicacao", PublicacaoWS.class, "publicacao");
		xstream.aliasField("IdPublicacao", PublicacaoWS.class, "idPublicacao");
		xstream.aliasField("IdDocumento", PublicacaoWS.class, "idDocumento");
		xstream.aliasField("StaMotivo", PublicacaoWS.class, "staMotivo");
		xstream.aliasField("Resumo", PublicacaoWS.class, "resumo");
		xstream.aliasField("IdVeiculoPublicacao", PublicacaoWS.class, "idVeiculoPublicacao");
		xstream.aliasField("NomeVeiculo", PublicacaoWS.class, "nomeVeiculo");
		xstream.aliasField("StaVeiculo", PublicacaoWS.class, "staTipoVeiculo");
		xstream.aliasField("DataDisponibilizacao", PublicacaoWS.class, "dataDisponibilizacao");
		xstream.aliasField("DataPublicacao", PublicacaoWS.class, "dataPublicacao");
		xstream.aliasField("Estado", PublicacaoWS.class, "estado");

		xstream.aliasField("Campo", ArrayOfCampoWS.class, "campo");
		xstream.alias("item xsi:type=\"ns1:campo\"", CampoWS.class);
		xstream.aliasField("IdCampo", CampoWS.class, "idCampo");
		xstream.aliasField("Nome", CampoWS.class, "nome");
		xstream.aliasField("Valor", CampoWS.class, "valor");
		xstream.addImplicitCollection(ArrayOfCampoWS.class, "campo", "item xsi:type=\"ns1:campo\"", CampoWS.class);


		xstream.ignoreUnknownElements();
		Envelope envelope = (Envelope) xstream.fromXML(xml);
		return envelope;
	}

	
	public Envelope getListarExtensoesPermitidas(String xml) {
		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("ns1:listarExtensoesPermitidasResponse", Body.class, "listarExtensoesPermitidasResponse");
		
		xstream.aliasField("parametros", ListarExtensoesPermitidasResponse.class, "parametros");
		xstream.aliasField("item", ArrayOfArquivoExtensaoWS.class, "item");
		
		xstream.alias("item xsi:type=\"ns1:ArquivoExtensao\"", ArquivoExtensaoWS.class);
		xstream.aliasField("IdArquivoExtensao", ArquivoExtensaoWS.class, "idArquivoExtensao");
		xstream.aliasField("Extensao", ArquivoExtensaoWS.class, "extensao");
		xstream.aliasField("Descricao", ArquivoExtensaoWS.class, "descricao");
		
		xstream.addImplicitCollection(ArrayOfArquivoExtensaoWS.class, "item", "item xsi:type=\"ns1:ArquivoExtensao\"", ArquivoExtensaoWS.class);
		
		Envelope envelope = (Envelope) xstream.fromXML(xml);
		return envelope;
	}
	
	public Envelope getRelacionarProcesso(String xml) {
		XStream xstream = new XStream(new DomDriver());
		
		xstream.alias("SOAP-ENV:Envelope", Envelope.class);
		xstream.aliasField("SOAP-ENV:Body", Envelope.class, "body");
		xstream.aliasField("ns1:relacionarProcessoResponse", Body.class, "relacionarProcessoResponse");
		
		xstream.aliasField("parametros", RelacionarProcessoResponse.class, "parametros");
		
		xstream.ignoreUnknownElements();
		Envelope envelope = (Envelope) xstream.fromXML(xml);
		return envelope;
	}
}
