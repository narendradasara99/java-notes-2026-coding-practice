package com.example.demo;

import org.springframework.hateoas.RepresentationModel;

public class Book extends RepresentationModel<Book> {

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
		return "Book [name=" + name + ", price=" + price + "]";
	}

	public Book(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Book() {
		super();
	}

}
