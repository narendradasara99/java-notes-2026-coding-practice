package com.immutableclass;

public class Address {

	private String ad;

	public Address() {

	}

	public Address(String a) {
		super();
		this.ad = a;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Address [ad=" + ad + "]";
	}

}
