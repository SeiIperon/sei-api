package br.gov.ro.pge.sei.api.util;

import javax.activation.DataSource;
import javax.activation.MimetypesFileTypeMap;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamDataSource implements DataSource {

	private final String name;
	private final String contentType;
	private InputStream is;

	public InputStreamDataSource(String filename, byte[] data) {
		this.name = filename;
		this.contentType = new MimetypesFileTypeMap().getContentType(this.name);
		this.is = new ByteArrayInputStream(data);
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return this.is;
	}

	@Override
	public OutputStream getOutputStream() throws IOException {
		return null;
	}

	@Override
	public String getContentType() {
		return this.contentType;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
