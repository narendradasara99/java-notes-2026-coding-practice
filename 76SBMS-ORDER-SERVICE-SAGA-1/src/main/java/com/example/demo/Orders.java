package com.example.demo;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private String product;

    private Double amount;
    

	public Orders(String product, Double amount) {
		super();
		this.product = product;
		this.amount = amount;
	}

	public Orders(Integer orderId, String product, Double amount) {
		super();
		this.orderId = orderId;
		this.product = product;
		this.amount = amount;
	}

	public Orders() {
		super();
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	

    
}