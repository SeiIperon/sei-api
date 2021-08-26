package br.gov.ro.pge.sei.api.util;

import org.apache.commons.lang3.ObjectUtils;

public abstract class HexUtils {

	private static final char	PADDING_CHAR	= '0';

	private static final int	BIT_COMPARATOR	= 0xFF;

	private HexUtils() {
		//
	}

	public static byte[] toHex(final byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		String str = HexUtils.toHexString(bytes);
		return str.getBytes();
	}

	public static byte[] fromHex(final byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		byte[] b = HexUtils.fromHexString(new String(bytes));
		return b;
	}

	public static String toHexString(final byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		StringBuilder builder = new StringBuilder();
		for (byte b : bytes) {
			String s = Integer.toHexString(HexUtils.BIT_COMPARATOR & b);
			if (s.length() == 1) {
				builder.append(HexUtils.PADDING_CHAR);
			}
			builder.append(s);
		}
		return builder.toString();
	}

	public static byte[] fromHexString(final String str) {
		if (ObjectUtils.isEmpty(str)) {
			return null;
		}
		byte[] bytes = new byte[str.length() / 2];
		char[] chars = str.toCharArray();

		int byteIndex = 0;
		int charIndex = 0;

		while (charIndex < chars.length) {
			String hex = new String(new char[] { chars[charIndex], chars[charIndex + 1] });
			Integer value = Integer.valueOf(hex, 16);

			bytes[byteIndex] = value.byteValue();

			byteIndex += 1;
			charIndex += 2;
		}

		return bytes;
	}

}
