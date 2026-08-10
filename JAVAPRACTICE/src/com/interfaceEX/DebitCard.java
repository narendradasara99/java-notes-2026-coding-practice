package com.interfaceEX;

public class DebitCard implements Payment{

	@Override
	public void pay(Double am) {
		// TODO Auto-generated method stub
		System.out.println("debitcard")	;
		
	}
	@Override
	public void view() {
		System.out.println("view payment");
	}

}
