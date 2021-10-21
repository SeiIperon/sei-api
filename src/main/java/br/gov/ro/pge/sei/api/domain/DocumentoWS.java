package br.gov.ro.pge.sei.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentoWS {

	@NotNull
	private TipoDocumentoWS tipo;

	private Long idProcedimento;

	private String protocoloProcedimento;

	@NotNull
	private Long idSerie;

	private String numero;

	private Date data;

	private String descricao;

	private Long idTipoConferencia;

	private RemetenteWS remetente;

	private ArrayOfInteressadoWS interessados;

	private ArrayOfDestinatarioWS destinatarios;

	private String observacao;

	private String nomeArquivo;

	private NivelAcessoWS nivelAcesso;

	private Long idHipoteseLegal;

	private String conteudo;

	private byte[] conteudoMTOM;

	private Long idArquivo;

	private ArrayOfCampoWS campos;

	private SinBloqueadoWS sinBloqueado;
}
