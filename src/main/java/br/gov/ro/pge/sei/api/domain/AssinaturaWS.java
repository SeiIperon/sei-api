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
public class AssinaturaWS {

    private String nome;
    private String cargoFuncao;
    private Date dataHora;
    private Long idUsuario;
    private Long idOrigem;
    private Long idOrgao;
    private String sigla;

}
