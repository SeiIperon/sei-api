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
public class PublicacaoImprensaNacionalWS {

    private String siglaVeiculo;
    private String descricaoVeiculo;
    private String pagina;
    private String secao;
    private Date data;
}
