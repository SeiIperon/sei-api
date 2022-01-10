/**
 *
 */
package br.gov.ro.pge.sei.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SimDocumentoWS {

    SIM("S"), NAO("N");

    @Getter @Setter
    private String codSinalizador;

    SimDocumentoWS(String codSinalizador) {
        this.codSinalizador = codSinalizador;
    }
}
