package com.synchronize;

public class BankAccount {

	private int balance = 1000;

	public  synchronized void  withdraw(int am) {
		if (balance >= am) {

			System.out.println(Thread.currentThread().getName() + " withdrawing...");
			balance -= am;
			System.out.println("Remaining balance: " + balance);

		} else {
			System.out.println("insuffieceint balance");
		}
	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount();

	    Thread t1 = new Thread(() -> account.withdraw(700), "T1");
	    Thread t2 = new Thread(() -> account.withdraw(700), "T2");

	    t1.start();
	    t2.start();
	}
}
