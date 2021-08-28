package br.gov.ro.pge.sei.api.domain.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Fault {
	private String faultcode;
	private String faultstring;
	private Detail detail;
}
