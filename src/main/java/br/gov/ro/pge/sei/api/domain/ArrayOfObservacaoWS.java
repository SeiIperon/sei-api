/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import java.util.List;

/**
 * @author janon.sousa
 * 
 */
public class ArrayOfObservacaoWS {

	private List<ObservacaoWS> observacao;

	public ArrayOfObservacaoWS() {
		// --
	}

	/**
	 * @param observacao
	 */
	public ArrayOfObservacaoWS(List<ObservacaoWS> observacao) {
		super();
		this.observacao = observacao;
	}

	/**
	 * @return the observacao
	 */
	public List<ObservacaoWS> getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao
	 *            the observacao to set
	 */
	public void setObservacao(List<ObservacaoWS> observacao) {
		this.observacao = observacao;
	}
}
