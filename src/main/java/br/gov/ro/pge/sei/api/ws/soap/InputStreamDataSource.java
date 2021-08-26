package br.gov.ro.pge.sei.api.ws.soap;

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
	public String getContentType() {
		return this.contentType;
	}

	@Override
	public InputStream getInputStream() throws IOException {
		return is;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public OutputStream getOutputStream() throws IOException {
		throw new IOException("Can't do this");
	}

}
