package br.gov.ro.pge.sei.api.domain.parameter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrosListarExtensoesPermitidasWS", propOrder = {
    "siglaSistema",
    "identificacaoServico",
    "idUnidade",
    "idArquivoExtensao"
})
public class ParametrosListarExtensoesPermitidasWS {

	@XmlElement(required = true)
	private String siglaSistema;

	@XmlElement(required = true)
	private String identificacaoServico;

	@XmlElement(required = false)
	private Long idUnidade;

	@XmlElement(required = false)
	private Long idArquivoExtensao;

	public ParametrosListarExtensoesPermitidasWS() {
		// --
	}

	/**
	 * @param siglaSistema
	 * @param identificacaoServico
	 */
	public ParametrosListarExtensoesPermitidasWS(String siglaSistema,
			String identificacaoServico) {
		super();
		this.siglaSistema = siglaSistema;
		this.identificacaoServico = identificacaoServico;
	}
	
	

	public ParametrosListarExtensoesPermitidasWS(String siglaSistema, String identificacaoServico, Long idUnidade) {
		super();
		this.siglaSistema = siglaSistema;
		this.identificacaoServico = identificacaoServico;
		this.idUnidade = idUnidade;
	}

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
	 * @return the idUnidade
	 */
	public Long getIdUnidade() {
		return idUnidade;
	}

	/**
	 * @param idUnidade
	 *            the idUnidade to set
	 */
	public void setIdUnidade(Long idUnidade) {
		this.idUnidade = idUnidade;
	}

	/**
	 * @return the idArquivoExtensao
	 */
	public Long getIdArquivoExtensao() {
		return idArquivoExtensao;
	}

	/**
	 * @param idArquivoExtensao
	 *            the idArquivoExtensao to set
	 */
	public void setIdArquivoExtensao(Long idArquivoExtensao) {
		this.idArquivoExtensao = idArquivoExtensao;
	}
}