package com.example.demo;

public class ProductRequest {
	private String name;
	private Double price;

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

	@Override
	public String toString() {
		return "ProductRequest [name=" + name + ", price=" + price + "]";
	}

	public ProductRequest(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public ProductRequest() {
		super();
	}

}
