package com.finzly.simplebanking;

public class Main {
	public static void main(String[] args) {

		BankAccount ba = new SavingAccount("SBU123445", "ravi", 15000, 3);
		ba.deposite(5000);
		ba.withdraw(18000);
		ba.withdraw(8000);
		System.out.println(ba.getBalance());

		System.out.println("------------------");

		BankAccount ba2 = new CheckingAccount("SBU123446", "Parth", 25000, 50000);
		ba2.deposite(8000);
		ba2.withdraw(5000);
		ba2.withdraw(40000);
		System.out.println(ba2.getBalance());
		
	}
}
