package br.gov.ro.pge.sei.api.util;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class Utils {

	public static String readFile(String realPath) throws IOException {
		File file = new File(realPath);
//		FileInputStream inputStream = new FileInputStream(file);
		try (FileInputStream inputStream = new FileInputStream(file)) {
			String str = IOUtils.toString(inputStream, "UTF-8");
//			inputStream.close();
			return str;
		}
	}
}
