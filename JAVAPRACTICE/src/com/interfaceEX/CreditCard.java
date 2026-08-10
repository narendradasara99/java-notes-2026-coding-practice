package com.interfaceEX;

public class CreditCard implements Payment, PaymentDebit {

	@Override
	public void pay(Double am) {

		// TODO Auto-generated method stub
		System.out.println("Creditcard");

	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void view() {
		System.out.println("view payment");
	}
}
