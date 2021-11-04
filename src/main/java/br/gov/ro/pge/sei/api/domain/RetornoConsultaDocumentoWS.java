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

    private SerieWS Serie;
    private String Numero;
    private String Descricao;
    private Date Data;
    private UnidadeWS unidadeElaboradora;

    private AndamentoWS andamentoGeracao;
    private AssinaturasWS assinaturas;
    private PublicacaoWS publicacao;
    private CampoWS campos;
}
