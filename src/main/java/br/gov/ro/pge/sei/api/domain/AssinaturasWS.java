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
public class AssinaturasWS {

    private String nome;
    private String CargoFuncao;
    private Date DataHora;
    private Long IdUsuario;
    private Long IdOrigem;
    private Long IdOrgao;
    private String Sigla;

}
