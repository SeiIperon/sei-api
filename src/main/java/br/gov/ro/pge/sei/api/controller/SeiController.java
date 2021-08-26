/**
 *
 */
package br.gov.ro.pge.sei.api.controller;

import br.gov.ro.pge.sei.api.domain.fault.SeiFaultException;
import br.gov.ro.pge.sei.api.domain.parameter.ParametrosGerarProcedimentoWS;
import br.gov.ro.pge.sei.api.domain.parameter.ParametrosListarExtensoesPermitidasWS;
import br.gov.ro.pge.sei.api.domain.response.RespostaGerarProcedimentoWS;
import br.gov.ro.pge.sei.api.domain.response.RespostaListarExtensoesPermitidasWS;
import br.gov.ro.pge.sei.api.service.SeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author janon.sousa
 *
 */
@RestController
@RequestMapping("v1/sei")
public class SeiController {

    @Autowired private SeiService seiService;

    @GetMapping(value = "/extensoes-permitidas", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespostaListarExtensoesPermitidasWS> listarExtensoesPermitidas(@RequestBody(required = false) ParametrosListarExtensoesPermitidasWS param) throws SeiFaultException {
        RespostaListarExtensoesPermitidasWS out = this.seiService.listarExtensoesPermitidas(param);
        return ResponseEntity.ok(out);
    }

    @PostMapping(value = "/procedimento", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespostaGerarProcedimentoWS> gerarProcedimento(@RequestBody(required = false) ParametrosGerarProcedimentoWS param) throws SeiFaultException {
        RespostaGerarProcedimentoWS out = this.seiService.gerarProcedimento(param);
        return ResponseEntity.ok(out);
    }
}
