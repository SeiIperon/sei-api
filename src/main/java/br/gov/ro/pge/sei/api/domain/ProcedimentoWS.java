/**
 * 
 */
package br.gov.ro.pge.sei.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Memora
 * 
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ProcedimentoWS {
	AUTOMATICO, INFORMADO;
}
