package br.gov.ro.pge.sei.api.domain.fault;

import lombok.*;
import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FaultWS {

	@Getter @Setter private Integer errorCode;
	@Getter @Setter private Integer statusCode;
	@Getter @Setter private String developerMessage;
	@Getter @Setter private String userMessage;
	@Setter private List<String> details;

	/**
	 * @return the moreInfo
	 */
	public List<String> getDetails() {
		if (ObjectUtils.isEmpty(this.details)) {
			this.details = new ArrayList<String>();
		}
		return details;
	}
}
