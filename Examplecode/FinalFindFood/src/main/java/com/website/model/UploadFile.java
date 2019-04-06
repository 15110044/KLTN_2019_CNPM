package com.website.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fileupload", catalog = "findfood")
public class UploadFile implements Serializable {
	private static final long serialVersionID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "FILE_ID")
	private long id;
	@Column(name = "FILE_NAME")
	private String filename;
	@Column(name = "FILE_DATA", length = 16777215 )
	private byte[] data;
	
	@Column(name = "FILE_DATA64", length = 16777215 )
	private String base64Data;

	public UploadFile() {
	}

	public UploadFile(long id, String filename, byte[] data, String base64Data) {
		this.id = id;
		this.filename = filename;
		this.data = data;
		this.base64Data = base64Data;
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getBase64Data() {
		return base64Data;
	}

	public void setBase64Data(String base64Data) {
		this.base64Data = base64Data;
	}
	

}
