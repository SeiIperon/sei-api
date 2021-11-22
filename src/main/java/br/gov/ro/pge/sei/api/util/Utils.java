package br.gov.ro.pge.sei.api.util;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public final class Utils {

    private Utils() {
        // Utility classes should not have public constructors
    }

    public static String getRealPath() {
        ClassLoader classLoader = Utils.class.getClassLoader();
        File file = new File(classLoader.getResource("operation").getFile());
        return file.getAbsolutePath();
    }

    public static String readFile(String realPath) throws IOException {
        File file = new File(realPath);
        try (FileInputStream inputStream = new FileInputStream(file)) {
            return IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        }
    }
}
