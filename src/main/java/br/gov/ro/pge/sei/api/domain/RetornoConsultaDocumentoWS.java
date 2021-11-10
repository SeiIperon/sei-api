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
public class RetornoConsultaDocumentoWS {

    private Long idProcedimento;
    private String procedimentoFormatado;
    private Long idDocumento;
    private String documentoFormatado;
    private String linkAcesso;

    private SerieWS serie;

    private String numero;
    private String descricao;
    private Date data;

    private UnidadeWS unidadeElaboradora;

    private AndamentoWS andamentoGeracao;

    private ArrayOfAssinaturaWS assinaturas;

    private PublicacaoWS publicacao;

    private ArrayOfCampoWS campos;
}
