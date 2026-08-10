package com.example.demo;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class PersonInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fileName;

	private String contentType;

	@Lob
	@Column(columnDefinition = "BLOB")
	private byte[] data;

	@Override
	public String toString() {
		return "Images [id=" + id + ", fileName=" + fileName + ", contentType=" + contentType + ", data="
				+ Arrays.toString(data) + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public PersonInfo(Long id, String fileName, String contentType, byte[] data) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.contentType = contentType;
		this.data = data;
	}

	public PersonInfo() {
		super();
	}

	
}
