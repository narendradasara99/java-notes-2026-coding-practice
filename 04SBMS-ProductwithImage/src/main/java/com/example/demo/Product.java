package com.example.demo;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	private String name;

	private Double price;

	private String imageName;

	private String imageType;

	@Lob
	@Column(columnDefinition = "BLOB")
	private byte[] imageData;

	public Product() {
		super();
	}

	public Product(Integer id, String name, Double price, String imageName, String imageType, byte[] imageData) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
		this.imageName = imageName;
		this.imageType = imageType;
		this.imageData = imageData;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", price=" + price + ", imageName=" + imageName + ", imageType="
				+ imageType + ", imageData=" + Arrays.toString(imageData) + "]";
	}

}
