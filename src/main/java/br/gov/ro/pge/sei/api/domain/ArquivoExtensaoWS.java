/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * @author janon.sousa
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arquivoExtensaoWS", propOrder = {
    "idArquivoExtensao",
    "extensao",
    "descricao"
})
public class ArquivoExtensaoWS {

	private Long idArquivoExtensao;
	private String extensao;
	private String descricao;

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

	/**
	 * @return the extensao
	 */
	public String getExtensao() {
		return extensao;
	}

	/**
	 * @param extensao
	 *            the extensao to set
	 */
	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
