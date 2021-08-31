package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.ArrayOfUnidadeWS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RespostaListarUnidadesWS {
	private ArrayOfUnidadeWS parametros;
}
