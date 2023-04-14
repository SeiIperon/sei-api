/**
 *
 */
package br.gov.ro.pge.sei.api.controller;

import br.gov.ro.pge.sei.api.domain.RetornoConsultaDocumentoWS;
import br.gov.ro.pge.sei.api.domain.fault.SeiFaultException;
import br.gov.ro.pge.sei.api.domain.parameter.*;
import br.gov.ro.pge.sei.api.domain.response.*;
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

    @PostMapping(value = "/enviar-processo", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseEnviarProcessoWS> enviarProcesso(@RequestBody(required = false) ParametrosEnviarProcessoWS param) throws SeiFaultException {
        ResponseEnviarProcessoWS out = this.seiService.enviarProcesso(param);
        return ResponseEntity.ok(out);
    }

    @PostMapping(value = "/incluir-documento", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespostaIncluirDocumentoWS> incluirDocumento(@RequestBody(required = false) ParametrosIncluirDocumentoWS param) throws SeiFaultException {
        RespostaIncluirDocumentoWS out = this.seiService.incluirDocumento(param);
        return ResponseEntity.ok(out);
    }

    @GetMapping(value = "/consultar-series", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespostaConsultarSeriesWS> consultarSeries(@RequestBody(required = false) ParametrosConsultarSeriesWS param) throws SeiFaultException {
        RespostaConsultarSeriesWS out = this.seiService.consultarSeries(param);
        return ResponseEntity.ok(out);
    }

    @PostMapping(value = "/consultar-documento", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RetornoConsultaDocumentoWS> consultarDocumento(@RequestBody(required = false) ParametrosConsultarDocumentoWS param) throws SeiFaultException {
        RespostaConsultarDocumentoWS out = this.seiService.consultarDocumento(param);
        return ResponseEntity.ok(out.getParametros());
    }
}
