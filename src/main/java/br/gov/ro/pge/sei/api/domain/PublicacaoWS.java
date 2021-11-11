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
public class PublicacaoWS {

    private String nomeVeiculo;
    private String numero;
    private Date dataDisponibilizacao;
    private Date dataPublicacao;
    private String estado;

    private PublicacaoImprensaNacionalWS imprensaNacional;
}
