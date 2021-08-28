package br.gov.ro.pge.sei.api.domain.response;

import br.gov.ro.pge.sei.api.domain.ArrayOfGrupoSerieWS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RespostaListarGrupoSerieWS {

	private ArrayOfGrupoSerieWS grupos;
}
