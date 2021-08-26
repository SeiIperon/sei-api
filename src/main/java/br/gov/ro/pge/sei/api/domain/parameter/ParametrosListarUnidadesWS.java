/**
 * 
 */
package br.gov.ro.pge.sei.api.domain.parameter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Memora
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosListarUnidadesWS", propOrder = {
    "siglaSistema",
    "identificacaoServico",
    "idTipoProcedimento",
    "idSerie",
    "sigla"
})
public class ParametrosListarUnidadesWS {

	@XmlElement(required = true)
	private String siglaSistema;

	@XmlElement(required = true)
	private String identificacaoServico;

	@XmlElement(required = false)
	private Long idTipoProcedimento;

	@XmlElement(required = false)
	private Long idSerie;
	
	@XmlElement(required = false)
	private String sigla;

	/**
	 * @return the siglaSistema
	 */
	public String getSiglaSistema() {
		return siglaSistema;
	}

	/**
	 * @param siglaSistema
	 *            the siglaSistema to set
	 */
	public void setSiglaSistema(String siglaSistema) {
		this.siglaSistema = siglaSistema;
	}

	/**
	 * @return the identificacaoServico
	 */
	public String getIdentificacaoServico() {
		return identificacaoServico;
	}

	/**
	 * @param identificacaoServico
	 *            the identificacaoServico to set
	 */
	public void setIdentificacaoServico(String identificacaoServico) {
		this.identificacaoServico = identificacaoServico;
	}

	/**
	 * @return the idTipoProcedimento
	 */
	public Long getIdTipoProcedimento() {
		return idTipoProcedimento;
	}

	/**
	 * @param idTipoProcedimento
	 *            the idTipoProcedimento to set
	 */
	public void setIdTipoProcedimento(Long idTipoProcedimento) {
		this.idTipoProcedimento = idTipoProcedimento;
	}

	/**
	 * @return the idSerie
	 */
	public Long getIdSerie() {
		return idSerie;
	}

	/**
	 * @param idSerie
	 *            the idSerie to set
	 */
	public void setIdSerie(Long idSerie) {
		this.idSerie = idSerie;
	}

	/**
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
