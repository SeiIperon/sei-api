package br.gov.ro.pge.sei.api.domain.parameter;

import br.gov.ro.pge.sei.api.domain.SimDocumentoWS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.ObjectUtils;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParametrosConsultarDocumentoWS {

    private String siglaSistema;

    private String identificacaoServico;

    private Long idUnidade;

    private String protocoloDocumento;

    private SimDocumentoWS sinRetornarAndamentoGeracao;

    private SimDocumentoWS sinRetornarAssinaturas;

    private SimDocumentoWS sinRetornarPublicacao;

    private SimDocumentoWS sinRetornarCampos;

    /**
     * @return the sinRetornarAdamentoGeracao
     */
    public SimDocumentoWS getSinRetornarAdamentoGeracao() {
        if (ObjectUtils.isEmpty(this.sinRetornarAndamentoGeracao)) {
            this.sinRetornarAndamentoGeracao = SimDocumentoWS.NAO;
        }
        return sinRetornarAndamentoGeracao;
    }

    /**
     * @return the sinRetornarAssinaturas
     */
    public SimDocumentoWS getSinRetornarAssinaturas() {
        if (ObjectUtils.isEmpty(this.sinRetornarAssinaturas)) {
            this.sinRetornarAssinaturas = SimDocumentoWS.NAO;
        }
        return sinRetornarAssinaturas;
    }

    /**
     * @return the sinRetornarPublicacao
     */
    public SimDocumentoWS getSinRetornarPublicacao() {
        if (ObjectUtils.isEmpty(this.sinRetornarPublicacao)) {
            this.sinRetornarPublicacao = SimDocumentoWS.NAO;
        }
        return sinRetornarPublicacao;
    }

    /**
     * @return the sinRetornarCampos
     */
    public SimDocumentoWS getSinRetornarCampos() {
        if (ObjectUtils.isEmpty(this.sinRetornarCampos)) {
            this.sinRetornarCampos = SimDocumentoWS.NAO;
        }
        return sinRetornarCampos;
    }


}
