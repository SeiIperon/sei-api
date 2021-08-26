package br.gov.ro.pge.sei.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atributoAndamentoWS", propOrder = {
    "nome",
    "valor",
    "idOrigem"
})
public class AtributoAndamentoWS {

	private String nome;
	private String valor;
	private String idOrigem;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * @param valor
	 *            the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}

	/**
	 * @return the idOrigem
	 */
	public String getIdOrigem() {
		return idOrigem;
	}

	/**
	 * @param idOrigem
	 *            the idOrigem to set
	 */
	public void setIdOrigem(String idOrigem) {
		this.idOrigem = idOrigem;
	}

}
