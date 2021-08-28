/**
 * 
 */
package br.gov.ro.pge.sei.api.util;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.text.StringEscapeUtils;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author janon.sousa
 *
 */
public class StringUtils {
	
	public static String toString(Object value) {
		String string = "";
		if (!ObjectUtils.isEmpty(value)) {
			if (value instanceof String) {
				if (!ObjectUtils.isEmpty(value)) {
					string = (String) value;
					try {
						string = new String(HexUtils.fromHexString(HexUtils.toHexString(string.getBytes("UTF-8"))));
					} catch (UnsupportedEncodingException e) {
						throw new RuntimeException(e);
					}
				}
			} else if (value instanceof Integer) {
				if (!ObjectUtils.isEmpty(value)) {
					string = ((Integer) value).toString();
				}
			} else if (value instanceof Long) {
				if (!ObjectUtils.isEmpty(value)) {
					string = ((Long) value).toString();
				}
			} else if (value instanceof Double) {
				if (!ObjectUtils.isEmpty(value)) {
					string = ((Double) value).toString();
				}
			} else if (value instanceof Date) {
				if (!ObjectUtils.isEmpty(value)) {
					try {
						string = DateTimeUtils.format((Date) value, "dd/MM/yyyy HH:mm:ss");
					} catch (NullPointerException e) {
						throw new RuntimeException(e);
					} catch (IllegalArgumentException e) {
						throw new RuntimeException(e);
					}
				}
			}
		}
		return string;
	}
	
	public static String escapeHTML(final String s)
			throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= (s.length() - 1); i++) {

			char character = s.charAt(i);
			int codePoint = Character.codePointAt(String.valueOf(character), 0);
			String str = "";

			if (codePoint > 126) {
//				str = StringEscapeUtils.escapeHtml(String.valueOf(character));
				str = StringEscapeUtils.escapeHtml4(String.valueOf(character));
			} else {
				str = String.valueOf(character);
			}
			sb.append(str);
		}
		return sb.toString();
	}
	
	/*
	 * O m�todo verifica a combina��o da sequ�ncia de entrada completa com o
	 * padr�o.
	 */
	public static boolean hasMatch(final String regex, final String input) {
		Pattern p = Pattern.compile("\\b" + regex + "\\b");
		Matcher m = p.matcher(input);

		int count = 0;
		int start = 0;
		int end = 0;

		while (m.find()) {
			if (count == 0) {
				start = m.start();
			}
			end = m.end();
			count++;
		}
		if (count > 0 && start > 0 && end > 0) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	/*
	 * Retorna o �ndice do primeiro e �ltimo character correspondente combinado.
	 */
	public static String[] hasIndexMatch(final String regex, final String input) {
		Pattern p = Pattern.compile("\\b" + regex + "\\b");
		Matcher m = p.matcher(input);

		int count = 0;
		int start = 0;
		int end = 0;

		while (m.find()) {
			if (count == 0) {
				start = m.start();
			}
			end = m.end();
			count++;
		}
		if (count > 0 && start > 0 && end > 0) {

			String[] out = { String.valueOf(start), String.valueOf(end) };
			return out;
		}
		return null;
	}
	
	/*
	 * Retorna uma Cadeia de substitui��o literal para a String especificada.
	 * Este m�todo produz uma String que funcionar� como uma substitui��o
	 * literal no m�todo appendReplacement da classe Matcher. A String produzida
	 * ir� combinar a seq��ncia de caracteres como uma seq��ncia literal. A
	 * contra barras ('\') e sinais de d�lar ('$') n�o receber�o nenhum
	 * significado especial.
	 */
	public static String replace(String replacement, String key, String value) {
		if (ObjectUtils.isEmpty(value)) {
			value = "";
		}
		replacement = replacement.replaceAll("\\b" + Pattern.quote(key) + "\\b",
				Matcher.quoteReplacement(value));
		return replacement;
	}
}
