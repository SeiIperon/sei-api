package br.gov.ro.pge.sei.api.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GrupoSerieWS {

	private Long idGrupoSerie;
	private String nome;
	private String sinAtivo;
	private String descricao;
}
