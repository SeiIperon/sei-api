package br.gov.ro.pge.sei.api.util;

import br.gov.ro.pge.sei.api.config.Message;
import br.gov.ro.pge.sei.api.domain.*;
import br.gov.ro.pge.sei.api.domain.fault.SeiFaultException;
import br.gov.ro.pge.sei.api.domain.response.RespostaListarExtensoesPermitidasWS;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.ObjectUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;

public class SeiElementsUtils {

    private SeiElementsUtils() {
        // Utility classes should not have public constructors
    }

    public static void validateDocumentoWs(DocumentoWS documentoWS, RespostaListarExtensoesPermitidasWS extensoes, boolean isProcedimentoObrigatorio) throws SeiFaultException {
        if (ObjectUtils.isEmpty(documentoWS)) {
            throw new SeiFaultException(400, Message.MNE00012);
        }
        if (ObjectUtils.isEmpty(documentoWS.getTipo())) {
            throw new SeiFaultException(400, Message.MNE00013);
        }
        if (ObjectUtils.isEmpty(documentoWS.getIdSerie())) {
            throw new SeiFaultException(400, Message.MNE00014);
        }
        if (isProcedimentoObrigatorio
                && ObjectUtils.isEmpty(documentoWS.getIdProcedimento())
                && ObjectUtils.isEmpty(documentoWS.getProtocoloProcedimento())) {
            throw new SeiFaultException(400, Message.MNE00015);
        }
        if (ObjectUtils.isEmpty(documentoWS.getNivelAcesso())) {
            throw new SeiFaultException(400, Message.MNE00010);
        }
        if (ObjectUtils.isEmpty(documentoWS.getSinBloqueado())) {
            documentoWS.setSinBloqueado(SinBloqueadoWS.NAO);
        }
        if (!ObjectUtils.isEmpty(documentoWS.getConteudo())
                && !ObjectUtils.isEmpty(documentoWS.getConteudoMTOM())) {
            throw new SeiFaultException(400, Message.MNE00024);
        }

        switch (documentoWS.getTipo()) {
            case DOCUMENTO_GERADO:
                if (!ObjectUtils.isEmpty(documentoWS.getConteudoMTOM())) {
                    throw new SeiFaultException(400, Message.MNE00025);
                }
                if (ObjectUtils.isEmpty(documentoWS.getConteudo())) {
                    throw new SeiFaultException(400, Message.MNE00016);
                }
                break;
            case DOCUMENTO_RECEBIDO:
                if (ObjectUtils.isEmpty(documentoWS.getData())) {
                    throw new SeiFaultException(400, Message.MNE00027);
                }
                if (ObjectUtils.isEmpty(documentoWS.getRemetente())) {
                    throw new SeiFaultException(400, Message.MNE00028);
                }
                if (ObjectUtils.isEmpty(documentoWS.getNomeArquivo())) {
                    throw new SeiFaultException(400, Message.MNE00029);
                }
                String extensao = FilenameUtils.getExtension(documentoWS.getNomeArquivo());
                if (ObjectUtils.isEmpty(extensao)) {
                    throw new SeiFaultException(400, Message.MNE00030);
                } else {
                    boolean contains = false;
                    for (ArquivoExtensaoWS iter : extensoes.getParametros().getItem()) {
                        if (extensao.equalsIgnoreCase(iter.getExtensao())) {
                            contains = true;
                            break;
                        }
                    }
                    if (!contains) {
                        StringBuilder str = new StringBuilder();
                        Iterator<ArquivoExtensaoWS> iter = extensoes.getParametros().getItem().iterator();
                        while (iter.hasNext()) {
                            ArquivoExtensaoWS ae = iter.next();
                            str.append(ae.getExtensao());
                            if (iter.hasNext()) {
                                str.append(", ");
                            }
                        }
                        throw new SeiFaultException(400, "Bad Request",
                                Message.getMessage(Message.MNE00031, str.toString()));
                    }
                }
                break;
        }
    }

    public static String gerarDocumentoWsXML(DocumentoWS documentoWS, Attachment attachment) throws IOException {
        String documentoIN = Utils.readFile(Utils.getRealPath() + File.separator + "elements" + File.separator + "DocumentoIN.xml");

        if (documentoWS.getTipo() == TipoDocumentoWS.DOCUMENTO_GERADO) {
            documentoIN = StringUtils.replace(documentoIN, "PARAM_16", StringUtils.escapeHTML(documentoWS.getConteudo()));
            documentoIN = XMLUtils.deleteElement(documentoIN, "ConteudoMTOM");

        } else if (documentoWS.getTipo() == TipoDocumentoWS.DOCUMENTO_RECEBIDO) {
            if (!ObjectUtils.isEmpty(documentoWS.getConteudoMTOM())) {
                documentoIN = XMLUtils.deleteElement(documentoIN, "Conteudo");
                documentoIN = StringUtils.replace(documentoIN, "PARAM_17", XMLUtils.getElementXOP(attachment.getContentId()));
            } else {
                documentoIN = StringUtils.replace(documentoIN, "PARAM_16", documentoWS.getConteudo()); // deve ser base64 encoded nos clientes
                documentoIN = XMLUtils.deleteElement(documentoIN, "ConteudoMTOM");
            }
        }

        documentoIN = StringUtils.replace(documentoIN, "PARAM_4", documentoWS.getTipo().getCodSinalizador());
        documentoIN = StringUtils.replace(documentoIN, "PARAM_5", StringUtils.toString(documentoWS.getIdProcedimento()));
        documentoIN = StringUtils.replace(documentoIN, "PARAM_6", documentoWS.getProtocoloProcedimento());
        documentoIN = StringUtils.replace(documentoIN, "PARAM_7", StringUtils.toString(documentoWS.getIdSerie()));
        documentoIN = StringUtils.replace(documentoIN, "PARAM_8", StringUtils.toString(documentoWS.getNumero()));
        documentoIN = StringUtils.replace(documentoIN, "PARAM_9", StringUtils.toString(documentoWS.getData()));
        documentoIN = StringUtils.replace(documentoIN, "PARAM_10", StringUtils.toString(documentoWS.getDescricao()));
        documentoIN = StringUtils.replace(documentoIN, "PARAM_11", StringUtils.toString(documentoWS.getIdTipoConferencia()));
        documentoIN = StringUtils.replace(documentoIN, "PARAM_12", StringUtils.toString(documentoWS.getObservacao()));
        documentoIN = StringUtils.replace(documentoIN, "PARAM_13", StringUtils.toString(documentoWS.getNomeArquivo()));
        documentoIN = StringUtils.replace(documentoIN, "PARAM_14", StringUtils.toString(documentoWS.getNivelAcesso().getCodSinalizador()));
        documentoIN = StringUtils.replace(documentoIN, "PARAM_15", StringUtils.toString(documentoWS.getIdHipoteseLegal()));
        documentoIN = StringUtils.replace(documentoIN, "PARAM_18", StringUtils.toString(documentoWS.getIdArquivo()));
        documentoIN = StringUtils.replace(documentoIN, "PARAM_19", documentoWS.getSinBloqueado().getCodSinalizador());
        // --
        if (!ObjectUtils.isEmpty(documentoWS.getInteressados()) && !ObjectUtils.isEmpty(documentoWS.getInteressados().getInteressado())) {
            String arrayOfInteressadoIN = Utils.readFile(Utils.getRealPath() + File.separator + "elements" + File.separator + "ArrayOfInteressadoIN.xml");
            String auxIN = "";
            int count = 0;
            for (InteressadoWS iter : documentoWS.getInteressados().getInteressado()) {
                if (count == 0) {
                    auxIN = StringUtils.replace(arrayOfInteressadoIN, "PARAM_1", StringUtils.toString(iter.getSigla()));
                    auxIN = StringUtils.replace(auxIN, "PARAM_2", StringUtils.toString(iter.getNome()));
                } else {
                    auxIN = auxIN + "\n" + StringUtils.replace(arrayOfInteressadoIN, "PARAM_1", StringUtils.toString(iter.getSigla()));
                    auxIN = StringUtils.replace(auxIN, "PARAM_2", StringUtils.toString(iter.getNome()));
                }
                count++;
            }
            documentoIN = StringUtils.replace(documentoIN, "PARAM_LENGTH_1", StringUtils.toString(count));
            documentoIN = StringUtils.replace(documentoIN, "PARAM_21", StringUtils.toString(auxIN));
        } else {
            documentoIN = StringUtils.replace(documentoIN, "PARAM_LENGTH_1", StringUtils.toString(null));
            documentoIN = StringUtils.replace(documentoIN, "PARAM_21", StringUtils.toString(null));
        }

        if (!ObjectUtils.isEmpty(documentoWS.getDestinatarios()) && !ObjectUtils.isEmpty(documentoWS.getDestinatarios().getDestinatario())) {
            String arrayOfDestinatarioIN = Utils.readFile(Utils.getRealPath() + File.separator + "elements" + File.separator + "ArrayOfDestinatarioIN.xml");
            String auxIN = "";
            int count = 0;
            for (DestinatarioWS iter : documentoWS.getDestinatarios().getDestinatario()) {
                if (count == 0) {
                    auxIN = StringUtils.replace(arrayOfDestinatarioIN, "PARAM_1", StringUtils.toString(iter.getSigla()));
                    auxIN = StringUtils.replace(auxIN, "PARAM_2", StringUtils.toString(iter.getNome()));
                } else {
                    auxIN = auxIN + "\n" + StringUtils.replace(arrayOfDestinatarioIN, "PARAM_1", StringUtils.toString(iter.getSigla()));
                    auxIN = StringUtils.replace(auxIN, "PARAM_2", StringUtils.toString(iter.getNome()));
                }
                count++;
            }
            documentoIN = StringUtils.replace(documentoIN, "PARAM_LENGTH_2", StringUtils.toString(count));
            documentoIN = StringUtils.replace(documentoIN, "PARAM_22", StringUtils.toString(auxIN));
        } else {
            documentoIN = StringUtils.replace(documentoIN, "PARAM_LENGTH_2", StringUtils.toString(null));
            documentoIN = StringUtils.replace(documentoIN, "PARAM_22", StringUtils.toString(null));
        }

        if (!ObjectUtils.isEmpty(documentoWS.getRemetente())) {
            if (!ObjectUtils.isEmpty(documentoWS.getRemetente().getNome())
                    || !ObjectUtils.isEmpty(documentoWS.getRemetente().getSigla())) {
                String remetenteIN = Utils.readFile(Utils.getRealPath() + File.separator + "elements" + File.separator + "RemetenteIN.xml");
                remetenteIN = StringUtils.replace(remetenteIN, "PARAM_1", StringUtils.toString(documentoWS.getRemetente().getSigla()));
                remetenteIN = StringUtils.replace(remetenteIN, "PARAM_2", StringUtils.toString(documentoWS.getRemetente().getNome()));

                StringBuilder sb = new StringBuilder(documentoIN);
                String[] src = StringUtils.hasIndexMatch("Remetente", documentoIN);
                sb.replace(Integer.parseInt(src[0]) - 1, Integer.parseInt(src[1]) + 1, remetenteIN);
                documentoIN = sb.toString();
            } else {
                documentoIN = StringUtils.replace(documentoIN, "PARAM_20", StringUtils.toString(null));
            }
        } else {
            documentoIN = StringUtils.replace(documentoIN, "PARAM_20", StringUtils.toString(null));
        }
        return documentoIN;
    }

    public static Attachment getAttachment(DocumentoWS documentoWS) {
        Attachment attachment = null;
        if (ObjectUtils.isNotEmpty(documentoWS)
                && documentoWS.getTipo() == TipoDocumentoWS.DOCUMENTO_RECEBIDO
                && !ObjectUtils.isEmpty(documentoWS.getConteudoMTOM())) {
            attachment = new Attachment();
            attachment.setFilename(documentoWS.getNomeArquivo());
            attachment.setData(documentoWS.getConteudoMTOM());
            attachment.setMTOM(true);
        }
        return attachment;
    }
}
