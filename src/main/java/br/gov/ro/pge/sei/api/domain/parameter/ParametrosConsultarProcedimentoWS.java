package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.SimProcedimentoWS;
import lombok.*;
import org.apache.commons.lang3.ObjectUtils;

import javax.validation.constraints.NotNull;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosConsultarProcedimentoWS {

    @Getter
    @Setter
    private String siglaSistema;

    @Getter
    @Setter
    private String identificacaoServico;

    @Getter
    @Setter
    private Long idUnidade;

    @NotNull
    @Getter
    @Setter
    private String protocoloProcedimento;

    @Setter
    private SimProcedimentoWS sinRetornarAssuntos;

    @Setter
    private SimProcedimentoWS sinRetornarInteressados;

    @Setter
    private SimProcedimentoWS sinRetornarObservacoes;

    @Setter
    private SimProcedimentoWS sinRetornarAndamentoGeracao;

    @Setter
    private SimProcedimentoWS sinRetornarAndamentoConclusao;

    @Setter
    private SimProcedimentoWS sinRetornarUltimoAndamento;

    @Setter
    private SimProcedimentoWS sinRetornarUnidadesProcedimentoAberto;

    @Setter
    private SimProcedimentoWS sinRetornarProcedimentosRelacionados;

    @Setter
    private SimProcedimentoWS sinRetornarProcedimentosAnexados;

    /**
     * @return the sinRetornarAssuntos
     */
    public SimProcedimentoWS getSinRetornarAssuntos() {
        if (ObjectUtils.isEmpty(this.sinRetornarAssuntos)) {
            this.sinRetornarAssuntos = SimProcedimentoWS.NAO;
        }
        return sinRetornarAssuntos;
    }

    /**
     * @return the sinRetornarInteressados
     */
    public SimProcedimentoWS getSinRetornarInteressados() {
        if (ObjectUtils.isEmpty(this.sinRetornarInteressados)) {
            this.sinRetornarInteressados = SimProcedimentoWS.NAO;
        }
        return sinRetornarInteressados;
    }

    /**
     * @return the sinRetornarObservacoes
     */
    public SimProcedimentoWS getSinRetornarObservacoes() {
        if (ObjectUtils.isEmpty(this.sinRetornarObservacoes)) {
            this.sinRetornarObservacoes = SimProcedimentoWS.NAO;
        }
        return sinRetornarObservacoes;
    }

    /**
     * @return the sinRetornarAndamentoGeracao
     */
    public SimProcedimentoWS getSinRetornarAndamentoGeracao() {
        if (ObjectUtils.isEmpty(this.sinRetornarAndamentoGeracao)) {
            this.sinRetornarAndamentoGeracao = SimProcedimentoWS.NAO;
        }
        return sinRetornarAndamentoGeracao;
    }

    /**
     * @return the sinRetornarAndamentoConclusao
     */
    public SimProcedimentoWS getSinRetornarAndamentoConclusao() {
        if (ObjectUtils.isEmpty(this.sinRetornarAndamentoConclusao)) {
            this.sinRetornarAndamentoConclusao = SimProcedimentoWS.NAO;
        }
        return sinRetornarAndamentoConclusao;
    }

    /**
     * @return the sinRetornarUltimoAndamento
     */
    public SimProcedimentoWS getSinRetornarUltimoAndamento() {
        if (ObjectUtils.isEmpty(this.sinRetornarUltimoAndamento)) {
            this.sinRetornarUltimoAndamento = SimProcedimentoWS.NAO;
        }
        return sinRetornarUltimoAndamento;
    }

    /**
     * @return the sinRetornarUnidadesProcedimentoAberto
     */
    public SimProcedimentoWS getSinRetornarUnidadesProcedimentoAberto() {
        if (ObjectUtils.isEmpty(this.sinRetornarUnidadesProcedimentoAberto)) {
            this.sinRetornarUnidadesProcedimentoAberto = SimProcedimentoWS.NAO;
        }
        return sinRetornarUnidadesProcedimentoAberto;
    }

    /**
     * @return the sinRetornarProcedimentosRelacionados
     */
    public SimProcedimentoWS getSinRetornarProcedimentosRelacionados() {
        if (ObjectUtils.isEmpty(this.sinRetornarProcedimentosRelacionados)) {
            this.sinRetornarProcedimentosRelacionados = SimProcedimentoWS.NAO;
        }
        return sinRetornarProcedimentosRelacionados;
    }

    /**
     * @return the sinRetornarProcedimentosAnexados
     */
    public SimProcedimentoWS getSinRetornarProcedimentosAnexados() {
        if (ObjectUtils.isEmpty(this.sinRetornarProcedimentosAnexados)) {
            this.sinRetornarProcedimentosAnexados = SimProcedimentoWS.NAO;
        }
        return sinRetornarProcedimentosAnexados;
    }
}