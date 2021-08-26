package br.gov.ro.pge.sei.api.ws.soap;

import org.apache.commons.lang3.ObjectUtils;

import java.util.UUID;

public class Attachment {

	private String filename;
	private String contentId;
	private byte[] data;
	private boolean isMTOM = false;

	public Attachment() {
	}

	/**
	 * @param filename
	 * @param contentId
	 * @param data
	 */
	public Attachment(String filename, String contentId, byte[] data) {
		this.filename = filename;
		this.contentId = contentId;
		this.data = data;
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param filename
	 *            the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * @return the contentId
	 */
	public String getContentId() {
		if (ObjectUtils.isEmpty(this.contentId)) {
			this.contentId = UUID.randomUUID().toString();
		}
		return contentId;
	}

	/**
	 * @param contentId
	 *            the contentId to set
	 */
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	/**
	 * @return the data
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(byte[] data) {
		this.data = data;
	}

	/**
	 * @return the isMTOM
	 */
	public boolean isMTOM() {
		return isMTOM;
	}

	/**
	 * @param isMTOM
	 *            the isMTOM to set
	 */
	public void setMTOM(boolean isMTOM) {
		this.isMTOM = isMTOM;
	}

}
