/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArrayOfObservacaoWS {

	private List<ObservacaoWS> observacao;
}
