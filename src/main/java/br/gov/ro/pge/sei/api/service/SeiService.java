package br.gov.ro.pge.sei.api.service;

import br.gov.ro.pge.sei.api.config.Message;
import br.gov.ro.pge.sei.api.domain.*;
import br.gov.ro.pge.sei.api.domain.fault.SeiFaultException;
import br.gov.ro.pge.sei.api.domain.parameter.*;
import br.gov.ro.pge.sei.api.domain.response.*;
import br.gov.ro.pge.sei.api.domain.wrapper.Envelope;
import br.gov.ro.pge.sei.api.util.*;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class SeiService {

	private static final Logger LOGGER = LoggerFactory.getLogger(SeiService.class);

	private String realPath;

	@PostConstruct
	public void init() {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("operation").getFile());
		this.realPath = file.getAbsolutePath();
	}

	public RespostaGerarProcedimentoWS gerarProcedimento(ParametrosGerarProcedimentoWS param)
			throws SeiFaultException {
		if (ObjectUtils.isEmpty(param))
			throw new SeiFaultException(400, Message.MNE00002);
		if (ObjectUtils.isEmpty(param.getSiglaSistema()))
			throw new SeiFaultException(400, Message.MNE00003);
		if (ObjectUtils.isEmpty(param.getIdentificacaoServico()))
			throw new SeiFaultException(400, Message.MNE00004);
		if (ObjectUtils.isEmpty(param.getIdUnidade()))
			throw new SeiFaultException(400, Message.MNE00005);
		if (ObjectUtils.isEmpty(param.getProcedimento()))
			throw new SeiFaultException(400, Message.MNE00006);
		if (ObjectUtils.isEmpty(param.getProcedimento().getIdTipoProcedimento()))
			throw new SeiFaultException(400, Message.MNE00007);
		if (ObjectUtils.isEmpty(param.getProcedimento().getNivelAcesso()))
			throw new SeiFaultException(400, Message.MNE00010);
		if (ObjectUtils.isEmpty(param.getProcedimento().getNivelAcesso()))
			param.getProcedimento().setNivelAcesso(NivelAcessoWS.PUBLICO);
		if (ObjectUtils.isEmpty(param.getSinManterAbertoUnidade()))
			param.setSinManterAbertoUnidade(SinManterAbertoUnidadeWS.SIM);
		if (ObjectUtils.isEmpty(param.getSinEnviarEmailNotificacao()))
			param.setSinEnviarEmailNotificacao(SinEnviarEmailNotificacaoWS.NAO);
		if (ObjectUtils.isEmpty(param.getSinDiasUteisRetornoProgramado()))
			param.setSinDiasUteisRetornoProgramado(SinDiasUteisRetornoProgramadoWS.NAO);

		if (ObjectUtils.isNotEmpty(param.getDocumentos())
				&& !CollectionUtils.isEmpty(param.getDocumentos().getDocumento())) {
			RespostaListarExtensoesPermitidasWS extensoes = this
					.listarExtensoesPermitidas(new ParametrosListarExtensoesPermitidasWS(
							param.getSiglaSistema(), param.getIdentificacaoServico(), param.getIdUnidade()));
			for (DocumentoWS documentoWS : param.getDocumentos().getDocumento()) {
				SeiElementsUtils.validateDocumentoWs(documentoWS, extensoes, false);
			}
		}

		try {
			String messageBody = XMLUtils.readXMLFile(this.realPath + File.separator + "GerarProcedimentoIN.xml");
			
			messageBody = StringUtils.replace(messageBody, "PARAM_1", param.getSiglaSistema());
			messageBody = StringUtils.replace(messageBody, "PARAM_2", param.getIdentificacaoServico());
			messageBody = StringUtils.replace(messageBody, "PARAM_3", StringUtils.toString(param.getIdUnidade()));
			messageBody = StringUtils.replace(messageBody, "PARAM_4", StringUtils.toString(param.getProcedimento().getIdTipoProcedimento()));
			
			// --
			if (!ObjectUtils.isEmpty(param.getProcedimento().getNumeroProtocolo())) {
				messageBody = StringUtils.replace(messageBody, "PARAM_5", param.getProcedimento().getNumeroProtocolo());
			} else {
				messageBody = StringUtils.replace(messageBody, "PARAM_5", null);
			}
			// --
			
			messageBody = StringUtils.replace(messageBody, "PARAM_6", StringUtils.toString(param.getProcedimento().getDataAutuacao()));
			messageBody = StringUtils.replace(messageBody, "PARAM_7", param.getProcedimento().getEspecificacao());
			
			if (!ObjectUtils.isEmpty(param.getProcedimento().getAssuntos()) && !ObjectUtils.isEmpty(param.getProcedimento().getAssuntos().getAssunto())) {
				String arrayOfAssuntoIN = Utils.readFile(this.realPath + File.separator + "elements" + File.separator + "ArrayOfAssuntoIN.xml");
				String auxIN = "";
				int count 	 = 0;
				for (AssuntoWS iter : param.getProcedimento().getAssuntos().getAssunto()) {
					if (count == 0) {
						auxIN = StringUtils.replace(arrayOfAssuntoIN, "PARAM_1", iter.getCodigoEstruturado());
						auxIN = StringUtils.replace(auxIN, "PARAM_2", iter.getDescricao());
					} else {
						auxIN = auxIN + "\n" + StringUtils.replace(arrayOfAssuntoIN, "PARAM_1", iter.getCodigoEstruturado());
						auxIN = StringUtils.replace(auxIN, "PARAM_2", iter.getDescricao());
					}
					count++;
				}
				messageBody = StringUtils.replace(messageBody, "PARAM_LENGTH_1", StringUtils.toString(count));
				messageBody = StringUtils.replace(messageBody, "PARAM_8", auxIN);
			} else {
				messageBody = StringUtils.replace(messageBody, "PARAM_LENGTH_1", StringUtils.toString(0));
				messageBody = StringUtils.replace(messageBody, "PARAM_8", StringUtils.toString(null));
			}

			if (!ObjectUtils.isEmpty(param.getProcedimento().getInteressados()) && !ObjectUtils.isEmpty(param.getProcedimento().getInteressados().getInteressado())) {
				String arrayOfInteressadoIN = Utils.readFile(this.realPath + File.separator + "elements" + File.separator + "ArrayOfInteressadoIN.xml");
				String auxIN = "";
				int count 	 = 0;
				for (InteressadoWS iter : param.getProcedimento().getInteressados().getInteressado()) {
					if (count == 0) {
						auxIN = StringUtils.replace(arrayOfInteressadoIN, "PARAM_1", iter.getSigla());
						auxIN = StringUtils.replace(auxIN, "PARAM_2", iter.getNome());
					} else {
						auxIN = auxIN + "\n" + StringUtils.replace(arrayOfInteressadoIN, "PARAM_1", iter.getSigla());
						auxIN = StringUtils.replace(auxIN, "PARAM_2", iter.getNome());
					}
					count++;
				}
				messageBody = StringUtils.replace(messageBody, "PARAM_LENGTH_2", StringUtils.toString(count));
				messageBody = StringUtils.replace(messageBody, "PARAM_9", auxIN);
			} else {
				messageBody = StringUtils.replace(messageBody, "PARAM_LENGTH_2", StringUtils.toString(0));
				messageBody = StringUtils.replace(messageBody, "PARAM_9", StringUtils.toString(null));
			}
			
			messageBody = StringUtils.replace(messageBody, "PARAM_10", param.getProcedimento().getObservacao());
			messageBody = StringUtils.replace(messageBody, "PARAM_11", StringUtils.toString(param.getProcedimento().getNivelAcesso().getCodSinalizador()));
			messageBody = StringUtils.replace(messageBody, "PARAM_12", param.getProcedimento().getIdHipoteseLegal());
			messageBody = StringUtils.replace(messageBody, "PARAM_13", param.getSinManterAbertoUnidade().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_14", param.getSinEnviarEmailNotificacao().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_15", StringUtils.toString(param.getDataRetornoProgramado()));
			messageBody = StringUtils.replace(messageBody, "PARAM_16", StringUtils.toString(param.getDiasRetornoProgramado()));
			messageBody = StringUtils.replace(messageBody, "PARAM_17", param.getSinDiasUteisRetornoProgramado().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_18", StringUtils.toString(param.getIdMarcador()));
			messageBody = StringUtils.replace(messageBody, "PARAM_19", param.getTextoMarcador());

			List<Attachment> attachmentList = new ArrayList<>();
			if (ObjectUtils.isNotEmpty(param.getDocumentos())
					&& !ObjectUtils.isEmpty(param.getDocumentos().getDocumento())) {
				StringBuilder auxIN = new StringBuilder();
				int count = 0;
				for (DocumentoWS iter : param.getDocumentos().getDocumento()) {
					Attachment attachment = SeiElementsUtils.getAttachment(iter);
					if (ObjectUtils.isNotEmpty(attachment)) {
						attachmentList.add(attachment);
					}
					String documentoIn = SeiElementsUtils.gerarDocumentoWsXML(iter, attachment);
					if (count == 0) {
						auxIN.append(documentoIn);
					} else {
						auxIN.append("\n").append(documentoIn);
					}
					count++;
				}
				messageBody = StringUtils.replace(messageBody, "PARAM_LENGTH_3", StringUtils.toString(count));
				messageBody = StringUtils.replace(messageBody, "PARAM_20", auxIN.toString());
			} else {
				messageBody = StringUtils.replace(messageBody, "PARAM_LENGTH_3", StringUtils.toString(0));
				messageBody = StringUtils.replace(messageBody, "PARAM_20", StringUtils.toString(null));
			}
			String output = SOAPUtils.call(messageBody, attachmentList);
			RespostaGerarProcedimentoWS gerarProcedimento = null;
			Envelope envelope = XMLStream.DESERIALIZED.getGerarProcedimento(output);
			if (!ObjectUtils.isEmpty(envelope)
					&& !ObjectUtils.isEmpty(envelope.getBody())
					&& !ObjectUtils.isEmpty(envelope.getBody().getGerarProcedimentoResponse())) {
				gerarProcedimento = new RespostaGerarProcedimentoWS();
				gerarProcedimento.setParametros(envelope.getBody().getGerarProcedimentoResponse().getParametros());
			}
			return gerarProcedimento;
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			if (e instanceof SeiFaultException) {
				throw (SeiFaultException) e;
			}
			throw new SeiFaultException(500, e.getMessage(), Message.MNE00001);
		}
	}
	
	public RespostaIncluirDocumentoWS incluirDocumento(
			ParametrosIncluirDocumentoWS param) throws SeiFaultException {
		try {
			if (ObjectUtils.isEmpty(param))
				throw new SeiFaultException(400, Message.MNE00002);
			if (ObjectUtils.isEmpty(param.getSiglaSistema()))
				throw new SeiFaultException(400, Message.MNE00003);
			if (ObjectUtils.isEmpty(param.getIdentificacaoServico()))
				throw new SeiFaultException(400, Message.MNE00004);
			if (ObjectUtils.isEmpty(param.getIdUnidade()))
				throw new SeiFaultException(400, Message.MNE00005);

			RespostaListarExtensoesPermitidasWS extensoes = this
					.listarExtensoesPermitidas(new ParametrosListarExtensoesPermitidasWS(
							param.getSiglaSistema(), param.getIdentificacaoServico(), param.getIdUnidade()));
			SeiElementsUtils.validateDocumentoWs(param.getDocumento(), extensoes, true);
			
			String messageBody = XMLUtils.readXMLFile(this.realPath + File.separator + "IncluirDocumentoIN.xml");

			Attachment attachment = SeiElementsUtils.getAttachment(param.getDocumento());
			String documentoIn = SeiElementsUtils.gerarDocumentoWsXML(param.getDocumento(), attachment);
			// --
			messageBody = StringUtils.replace(messageBody, "PARAM_1", param.getSiglaSistema());
			messageBody = StringUtils.replace(messageBody, "PARAM_2", param.getIdentificacaoServico());
			messageBody = StringUtils.replace(messageBody, "PARAM_3", StringUtils.toString(param.getIdUnidade()));
			messageBody = StringUtils.replace(messageBody, "PARAM_4", documentoIn);

			// --
			if (ObjectUtils.isEmpty(attachment)) {
				messageBody = SOAPUtils.call(messageBody);
			} else {
				messageBody = SOAPUtils.call(messageBody, attachment);
			}
			RespostaIncluirDocumentoWS respostaIncluirDocumento = null;
			Envelope envelope = XMLStream.DESERIALIZED.getIncluirDocumento(messageBody);
			if (!ObjectUtils.isEmpty(envelope) && !ObjectUtils.isEmpty(envelope.getBody())
					&& !ObjectUtils.isEmpty(envelope.getBody().getIncluirDocumentoResponse())) {
				respostaIncluirDocumento = new RespostaIncluirDocumentoWS();
				respostaIncluirDocumento.setParametros(envelope.getBody().getIncluirDocumentoResponse().getParametros());
			}
			return respostaIncluirDocumento;
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			if (e instanceof SeiFaultException) {
				throw (SeiFaultException) e;
			}
			throw new SeiFaultException(500, e.getMessage(), Message.MNE00001);
		}
	}
	
	public RespostaListarAndamentosWS listarAndamentos(
			ParametrosListarAndamentosWS param) throws SeiFaultException {
		
		if (ObjectUtils.isEmpty(param))
			throw new SeiFaultException(400, Message.MNE00002);
		if (ObjectUtils.isEmpty(param.getSiglaSistema()))
			throw new SeiFaultException(400, Message.MNE00003);
		if (ObjectUtils.isEmpty(param.getIdentificacaoServico()))
			throw new SeiFaultException(400, Message.MNE00004);
		if (ObjectUtils.isEmpty(param.getProtocoloProcedimento()))
			throw new SeiFaultException(400, Message.MNE00008);
		if (ObjectUtils.isEmpty(param.getSinRetornarAtributos()))
			param.setSinRetornarAtributos(SinRetornarAtributosWS.SIM);
		
		try {
			String messageBody = XMLUtils.readXMLFile(this.realPath + File.separator + "ListarAndamentosIN.xml");
			
			messageBody = StringUtils.replace(messageBody, "PARAM_1", StringUtils.toString(param.getSiglaSistema()));
			messageBody = StringUtils.replace(messageBody, "PARAM_2", StringUtils.toString(param.getIdentificacaoServico()));
			messageBody = StringUtils.replace(messageBody, "PARAM_3", StringUtils.toString(param.getIdUnidade()));			
			messageBody = StringUtils.replace(messageBody, "PARAM_4", StringUtils.toString(param.getProtocoloProcedimento()));
			messageBody = StringUtils.replace(messageBody, "PARAM_5", StringUtils.toString(param.getSinRetornarAtributos().getCodSinalizador()));
			
			String output = SOAPUtils.call(messageBody);
			RespostaListarAndamentosWS listarAndamentos = null;
			Envelope envelope = XMLStream.DESERIALIZED.getListarAndamentos(output);
			if (!ObjectUtils.isEmpty(envelope)
					&& !ObjectUtils.isEmpty(envelope.getBody())
					&& !ObjectUtils.isEmpty(envelope.getBody().getListarAndamentosResponse())) {
				listarAndamentos = new RespostaListarAndamentosWS();
				listarAndamentos.setParametros(envelope.getBody().getListarAndamentosResponse().getParametros());
			}
			return listarAndamentos;
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			if (e instanceof SeiFaultException) {
				throw (SeiFaultException) e;
			}
			throw new SeiFaultException(500, e.getMessage(), Message.MNE00001);
		}
	}
	
	public ResponseConcluirProcessoWS concluirProcesso(
			ParametrosConcluirProcessoWS param) throws SeiFaultException {
		if (ObjectUtils.isEmpty(param))
			throw new SeiFaultException(400, Message.MNE00002);
		if (ObjectUtils.isEmpty(param.getSiglaSistema()))
			throw new SeiFaultException(400, Message.MNE00003);
		if (ObjectUtils.isEmpty(param.getIdentificacaoServico()))
			throw new SeiFaultException(400, Message.MNE00004);
		if (ObjectUtils.isEmpty(param.getIdUnidade()))
			throw new SeiFaultException(400, Message.MNE00005);
		if (ObjectUtils.isEmpty(param.getProtocoloProcedimento()))
			throw new SeiFaultException(400, Message.MNE00008);
		
		try {
			String messageBody = XMLUtils.readXMLFile(this.realPath + File.separator + "ConcluirProcessoIN.xml");
			
			messageBody = StringUtils.replace(messageBody, "PARAM_1", StringUtils.toString(param.getSiglaSistema()));
			messageBody = StringUtils.replace(messageBody, "PARAM_2", StringUtils.toString(param.getIdentificacaoServico()));
			messageBody = StringUtils.replace(messageBody, "PARAM_3", StringUtils.toString(param.getIdUnidade()));			
			messageBody = StringUtils.replace(messageBody, "PARAM_4", StringUtils.toString(param.getProtocoloProcedimento()));
			
			String output = SOAPUtils.call(messageBody);
			ResponseConcluirProcessoWS out = null;
			Envelope envelope = XMLStream.DESERIALIZED.getConcluirProcesso(output);
			if (!ObjectUtils.isEmpty(envelope)
					&& !ObjectUtils.isEmpty(envelope.getBody())
					&& !ObjectUtils.isEmpty(envelope.getBody().getConcluirProcessoResponse())) {
				out = new ResponseConcluirProcessoWS();
				out.setParametros(envelope.getBody().getConcluirProcessoResponse().getParametros());
			}
			return out;
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			if (e instanceof SeiFaultException) {
				throw (SeiFaultException) e;
			}
			throw new SeiFaultException(500, e.getMessage(), Message.MNE00001);
		}
	}
	
	public ResponseEnviarProcessoWS enviarProcesso(
			ParametrosEnviarProcessoWS param) throws SeiFaultException {
		if (ObjectUtils.isEmpty(param))
			throw new SeiFaultException(400, Message.MNE00002);
		if (ObjectUtils.isEmpty(param.getSiglaSistema()))
			throw new SeiFaultException(400, Message.MNE00003);
		if (ObjectUtils.isEmpty(param.getIdentificacaoServico()))
			throw new SeiFaultException(400, Message.MNE00004);
		if (ObjectUtils.isEmpty(param.getIdUnidade()))
			throw new SeiFaultException(400, Message.MNE00005);
		if (ObjectUtils.isEmpty(param.getProtocoloProcedimento()))
			throw new SeiFaultException(400, Message.MNE00008);
		if (ObjectUtils.isEmpty(param.getUnidadesDestino()) && ObjectUtils.isEmpty(param.getUnidadesDestino().getIdUnidade()))
			throw new SeiFaultException(400, Message.MNE00023);
		
		try {
			String messageBody = XMLUtils.readXMLFile(this.realPath + File.separator + "EnviarProcessoIN.xml");
			
			messageBody = StringUtils.replace(messageBody, "PARAM_1", param.getSiglaSistema());
			messageBody = StringUtils.replace(messageBody, "PARAM_2", param.getIdentificacaoServico());
			messageBody = StringUtils.replace(messageBody, "PARAM_3", StringUtils.toString(param.getIdUnidade()));			
			messageBody = StringUtils.replace(messageBody, "PARAM_4", param.getProtocoloProcedimento());
			// --
			messageBody = StringUtils.replace(messageBody, "PARAM_LENGTH_1", StringUtils.toString(param.getUnidadesDestino().getIdUnidade().size() -1));
			StringBuilder sb = new StringBuilder();
			for (Long iter : param.getUnidadesDestino().getIdUnidade()) {
				sb.append("<string>");
				sb.append(String.valueOf(iter));
				sb.append("</string>");
			}
			messageBody = StringUtils.replace(messageBody, "PARAM_5", sb.toString());
			// --
			messageBody = StringUtils.replace(messageBody, "PARAM_6", param.getSinManterAbertoUnidade().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_7", param.getSinRemoverAnotacao().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_8", param.getSinEnviarEmailNotificacao().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_9", param.getDataRetornoProgramado());
			messageBody = StringUtils.replace(messageBody, "PARAM_10", StringUtils.toString(param.getDiasRetornoProgramado()));
			messageBody = StringUtils.replace(messageBody, "PARAM_11", param.getSinDiasUteisRetornoProgramado().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_12", param.getSinReabrir().getCodSinalizador());
			
			String output = SOAPUtils.call(messageBody);
			ResponseEnviarProcessoWS out = null;
			Envelope envelope = XMLStream.DESERIALIZED.getEnviarProcesso(output);
			if (!ObjectUtils.isEmpty(envelope)
					&& !ObjectUtils.isEmpty(envelope.getBody())
					&& !ObjectUtils.isEmpty(envelope.getBody().getEnviarProcessoResponse())) {
				out = new ResponseEnviarProcessoWS();
				out.setParametros(envelope.getBody().getEnviarProcessoResponse().getParametros());
			}
			return out;
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			if (e instanceof SeiFaultException) {
				throw (SeiFaultException) e;
			}
			throw new SeiFaultException(500, e.getMessage(), Message.MNE00001);
		}
	}
	
	public RespostaListarUnidadesWS consultarUnidades(
			ParametrosListarUnidadesWS param) throws SeiFaultException {
		if (ObjectUtils.isEmpty(param))
			throw new SeiFaultException(400, Message.MNE00002);
		if (ObjectUtils.isEmpty(param.getSiglaSistema()))
			throw new SeiFaultException(400, Message.MNE00003);
		if (ObjectUtils.isEmpty(param.getIdentificacaoServico()))
			throw new SeiFaultException(400, Message.MNE00004);
		// --
		try {
			String messageBody = XMLUtils.readXMLFile(this.realPath + File.separator + "ListarUnidas.xml");
			
			messageBody = StringUtils.replace(messageBody, "PARAM_1", param.getSiglaSistema());
			messageBody = StringUtils.replace(messageBody, "PARAM_2", param.getIdentificacaoServico());
			messageBody = StringUtils.replace(messageBody, "PARAM_3", StringUtils.toString(param.getIdTipoProcedimento()));			
			messageBody = StringUtils.replace(messageBody, "PARAM_4", StringUtils.toString(param.getIdSerie()));
			// --			
			String output = SOAPUtils.call(messageBody);
			Envelope envelope = XMLStream.DESERIALIZED.getListarUnidades(output);			
			if (!ObjectUtils.isEmpty(envelope)
					&& !ObjectUtils.isEmpty(envelope.getBody())
					&& !ObjectUtils.isEmpty(envelope.getBody().getListarUnidades())) {
				if (!ObjectUtils.isEmpty(param.getSigla())) {// Realiza o Filtro
					RespostaListarUnidadesWS out = new RespostaListarUnidadesWS(new ArrayOfUnidadeWS(new ArrayList<UnidadeWS>()));
					for (UnidadeWS iter : envelope.getBody().getListarUnidades().getParametros().getItem()) {
						if (iter.getSigla().trim().toUpperCase().contains(param.getSigla().trim().toUpperCase())) {
							out.getParametros().getItem().add(iter);
						}
					}
					if (!ObjectUtils.isEmpty(out.getParametros().getItem())) {
						return out;
					}
					throw new SeiFaultException(400, Message.MNE00019);
				}
				return envelope.getBody().getListarUnidades();
			}
			throw new SeiFaultException(400, Message.MNE00019);
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			if (e instanceof SeiFaultException) {
				throw (SeiFaultException) e;
			}
			throw new SeiFaultException(500, e.getMessage(), Message.MNE00001);
		}
	}
	
	public RespostaConsultarSeriesWS consultarSeries(ParametrosConsultarSeriesWS param)
			throws SeiFaultException {
		if (ObjectUtils.isEmpty(param))
			throw new SeiFaultException(400, Message.MNE00002);
		if (ObjectUtils.isEmpty(param.getSiglaSistema()))
			throw new SeiFaultException(400, Message.MNE00003);
		if (ObjectUtils.isEmpty(param.getIdentificacaoServico()))
			throw new SeiFaultException(400, Message.MNE00004);
		// --
		try {
			String messageBody = XMLUtils.readXMLFile(this.realPath + File.separator + "ListarSeries.xml");
			
			messageBody = StringUtils.replace(messageBody, "PARAM_1", param.getSiglaSistema());
			messageBody = StringUtils.replace(messageBody, "PARAM_2", param.getIdentificacaoServico());
			messageBody = StringUtils.replace(messageBody, "PARAM_3", StringUtils.toString(param.getIdUnidade()));
			messageBody = StringUtils.replace(messageBody, "PARAM_4", StringUtils.toString(param.getIdTipoProcedimento()));
			// --			
			String output = SOAPUtils.call(messageBody);
			Envelope envelope = XMLStream.DESERIALIZED.getListarSeries(output);
			if (!ObjectUtils.isEmpty(envelope)
					&& !ObjectUtils.isEmpty(envelope.getBody())
					&& !ObjectUtils.isEmpty(envelope.getBody().getListarSeries())) {
				if (!ObjectUtils.isEmpty(param.getNome())) {// Realiza o Filtro
					RespostaConsultarSeriesWS out = new RespostaConsultarSeriesWS(new ArrayOfSerieWS(new ArrayList<SerieWS>()));
					for (SerieWS iter : envelope.getBody().getListarSeries().getParametros().getItem()) {
						if (iter.getNome().trim().toUpperCase().contains(param.getNome().trim().toUpperCase())) {
							out.getParametros().getItem().add(iter);
						}
					}
					if (!ObjectUtils.isEmpty(out.getParametros().getItem())) {
						return out;
					}
					throw new SeiFaultException(400, Message.MNE00019);
				}
				return envelope.getBody().getListarSeries();
			}
			throw new SeiFaultException(400, Message.MNE00019);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			if (e instanceof SeiFaultException) {
				throw (SeiFaultException) e;
			}
			throw new SeiFaultException(500, e.getMessage(), Message.MNE00001);
		}
	}
	
	public RespostaConsultarProcedimentoWS consultarProcedimento(
			ParametrosConsultarProcedimentoWS param) throws SeiFaultException {
		if (ObjectUtils.isEmpty(param))
			throw new SeiFaultException(400, Message.MNE00002);
		if (ObjectUtils.isEmpty(param.getSiglaSistema()))
			throw new SeiFaultException(400, Message.MNE00003);
		if (ObjectUtils.isEmpty(param.getIdentificacaoServico()))
			throw new SeiFaultException(400, Message.MNE00004);
		if (ObjectUtils.isEmpty(param.getProtocoloProcedimento()))
			throw new SeiFaultException(400, Message.MNE00008);
		// --
		try {
			String messageBody = XMLUtils.readXMLFile(this.realPath + File.separator + "ConsultarProcedimento.xml");

			messageBody = StringUtils.replace(messageBody, "PARAM_1", param.getSiglaSistema());
			messageBody = StringUtils.replace(messageBody, "PARAM_2", param.getIdentificacaoServico());
			messageBody = StringUtils.replace(messageBody, "PARAM_3", StringUtils.toString(param.getIdUnidade()));			
			messageBody = StringUtils.replace(messageBody, "PARAM_4", param.getProtocoloProcedimento());
			
			messageBody = StringUtils.replace(messageBody, "PARAM_5", param.getSinRetornarAssuntos().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_6", param.getSinRetornarInteressados().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_7", param.getSinRetornarObservacoes().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_8", param.getSinRetornarAndamentoGeracao().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_9", param.getSinRetornarAndamentoConclusao().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_10", param.getSinRetornarUltimoAndamento().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_11", param.getSinRetornarUnidadesProcedimentoAberto().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_12", param.getSinRetornarProcedimentosRelacionados().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_13", param.getSinRetornarProcedimentosAnexados().getCodSinalizador());
			// --			
			String output = SOAPUtils.call(messageBody);
			RespostaConsultarProcedimentoWS out = null;
			Envelope envelope = XMLStream.DESERIALIZED.getConsultarProcedimento(output);
			if (!ObjectUtils.isEmpty(envelope)
					&& !ObjectUtils.isEmpty(envelope.getBody())
					&& !ObjectUtils.isEmpty(envelope.getBody().getConsultarProcedimentoResponse())) {
				out = new RespostaConsultarProcedimentoWS();
				out.setParametros(envelope.getBody().getConsultarProcedimentoResponse().getParametros());
				return out;
			}
			throw new SeiFaultException(400, Message.MNE00019);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			if (e instanceof SeiFaultException) {
				throw (SeiFaultException) e;
			}
			throw new SeiFaultException(500, e.getMessage(), Message.MNE00001);
		}
	}

	public RespostaConsultarDocumentoWS consultarDocumento(ParametrosConsultarDocumentoWS param) throws SeiFaultException {
		// revisar Message
		if (ObjectUtils.isEmpty(param)) {
			throw new SeiFaultException(400, Message.MNE00002);
		}
		if (ObjectUtils.isEmpty(param.getSiglaSistema())) {
			throw new SeiFaultException(400, Message.MNE00003);
		}
		if (ObjectUtils.isEmpty(param.getIdentificacaoServico())) {
			throw new SeiFaultException(400, Message.MNE00004);
		}
		if (ObjectUtils.isEmpty(param.getProtocoloDocumento())) {
			throw new SeiFaultException(400, Message.MNE00008);
		}
		// --
		try {
			String messageBody = XMLUtils.readXMLFile(this.realPath + File.separator + "ConsultarDocumento.xml");

			messageBody = StringUtils.replace(messageBody, "PARAM_1", param.getSiglaSistema());
			messageBody = StringUtils.replace(messageBody, "PARAM_2", param.getIdentificacaoServico());
			messageBody = StringUtils.replace(messageBody, "PARAM_3", StringUtils.toString(param.getIdUnidade()));
			messageBody = StringUtils.replace(messageBody, "PARAM_4", param.getProtocoloDocumento());
			messageBody = StringUtils.replace(messageBody, "PARAM_5", param.getSinRetornarAdamentoGeracao().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_6", param.getSinRetornarAssinaturas().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_7", param.getSinRetornarPublicacao().getCodSinalizador());
			messageBody = StringUtils.replace(messageBody, "PARAM_8", param.getSinRetornarCampos().getCodSinalizador());
			// --
			String output = SOAPUtils.call(messageBody);
			RespostaConsultarDocumentoWS out = null;
			Envelope envelope = XMLStream.DESERIALIZED.getConsultarDocumento(output);
			if (!ObjectUtils.isEmpty(envelope)
					&& !ObjectUtils.isEmpty(envelope.getBody())
					&& !ObjectUtils.isEmpty(envelope.getBody().getConsultarDocumentoResponse())) {
				out = new RespostaConsultarDocumentoWS();
				out.setParametros(envelope.getBody().getConsultarDocumentoResponse().getParametros());
				return out;
			}
			throw new SeiFaultException(400, Message.MNE00019);
		} catch (SeiFaultException e) {
			LOGGER.error(e.getMessage(), e);
			throw (SeiFaultException) e;
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			throw new SeiFaultException(500, e.getMessage(), Message.MNE00001);
		}
	}
	
	public RespostaListarExtensoesPermitidasWS listarExtensoesPermitidas(
			ParametrosListarExtensoesPermitidasWS param) throws SeiFaultException {
		// --
		if (ObjectUtils.isEmpty(param))
			throw new SeiFaultException(400, Message.MNE00002);
		if (ObjectUtils.isEmpty(param.getSiglaSistema()))
			throw new SeiFaultException(400, Message.MNE00003);
		if (ObjectUtils.isEmpty(param.getIdentificacaoServico()))
			throw new SeiFaultException(400, Message.MNE00004);
		// --
		try {
			String messageBody = XMLUtils.readXMLFile(this.realPath + File.separator + "ListarExtensoesPermitidas.xml");
			
			messageBody = StringUtils.replace(messageBody, "PARAM_1", param.getSiglaSistema());
			messageBody = StringUtils.replace(messageBody, "PARAM_2", param.getIdentificacaoServico());
			messageBody = StringUtils.replace(messageBody, "PARAM_3", StringUtils.toString(param.getIdUnidade()));
			messageBody = StringUtils.replace(messageBody, "PARAM_4", StringUtils.toString(param.getIdArquivoExtensao()));
			// --			
			String output = SOAPUtils.call(messageBody);
			RespostaListarExtensoesPermitidasWS out = null;
			Envelope envelope = XMLStream.DESERIALIZED.getListarExtensoesPermitidas(output);
			if (!ObjectUtils.isEmpty(envelope)
					&& !ObjectUtils.isEmpty(envelope.getBody())
					&& !ObjectUtils.isEmpty(envelope.getBody().getListarExtensoesPermitidasResponse())) {
				out = new RespostaListarExtensoesPermitidasWS();
				out.setParametros(envelope.getBody().getListarExtensoesPermitidasResponse().getParametros());
				return out;
			}
			throw new SeiFaultException(400, Message.MNE00019);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			if (e instanceof SeiFaultException) {
				throw (SeiFaultException) e;
			}
			throw new SeiFaultException(500, e.getMessage(), Message.MNE00001);
		}
	}
	
	public ResponseRelacionarProcessoWS relacionarProcesso(
			ParametrosRelacionarProcessoWS param) throws SeiFaultException {
		if (ObjectUtils.isEmpty(param))
			throw new SeiFaultException(400, Message.MNE00002);
		if (ObjectUtils.isEmpty(param.getSiglaSistema()))
			throw new SeiFaultException(400, Message.MNE00003);
		if (ObjectUtils.isEmpty(param.getIdentificacaoServico()))
			throw new SeiFaultException(400, Message.MNE00004);
		if (ObjectUtils.isEmpty(param.getProtocoloProcedimento1()))
			throw new SeiFaultException(400, Message.MNE00008);
		if (ObjectUtils.isEmpty(param.getProtocoloProcedimento2()))
			throw new SeiFaultException(400, Message.MNE00008);
		// --
		try {
			String messageBody = XMLUtils.readXMLFile(this.realPath + File.separator + "RelacionarProcessoIN.xml");
			
			messageBody = StringUtils.replace(messageBody, "PARAM_1", param.getSiglaSistema());
			messageBody = StringUtils.replace(messageBody, "PARAM_2", param.getIdentificacaoServico());
			messageBody = StringUtils.replace(messageBody, "PARAM_3", StringUtils.toString(param.getIdUnidade()));			
			messageBody = StringUtils.replace(messageBody, "PARAM_4", param.getProtocoloProcedimento1());
			messageBody = StringUtils.replace(messageBody, "PARAM_5", param.getProtocoloProcedimento2());
			// --			
			String output = SOAPUtils.call(messageBody);
			
			ResponseRelacionarProcessoWS out = null;
			Envelope envelope = XMLStream.DESERIALIZED.getRelacionarProcesso(output);
			if (!ObjectUtils.isEmpty(envelope)
					&& !ObjectUtils.isEmpty(envelope.getBody())
					&& !ObjectUtils.isEmpty(envelope.getBody().getRelacionarProcessoResponse())) {
				out = new ResponseRelacionarProcessoWS();
				out.setParametros(envelope.getBody().getRelacionarProcessoResponse().getParametros());
				return out;
			}
			throw new SeiFaultException(400, Message.MNE00019);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			if (e instanceof SeiFaultException) {
				throw (SeiFaultException) e;
			}
			throw new SeiFaultException(500, e.getMessage(), Message.MNE00001);
		}
	}
}
