package com.finzly.simplebanking;

public class CheckingAccount extends BankAccount {

	private double overdraftLimit; // to store overdraft limit

	public CheckingAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overdraftLimit = overdraftLimit;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return accountNumber;
	}

	@Override
	public String getAccountHolderName() {
		// TODO Auto-generated method stub
		return accountHolderName;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void deposite(double amount) {
		if (amount >= 500) {
			super.balance = getBalance() + amount;
			System.out.println("deposite success new balance " + super.balance);
		} else {
			System.out.println("min bal to deposite is 500");
		}
	}

	@Override
	public void withdraw(double amount) {
//  to consider overdraft limit
		if (amount < balance) {
			super.balance -= amount;
			System.out.println("withdraw success! remaining balance is " + balance);

		} else if (amount < balance+overdraftLimit) {
			super.balance -= amount;
			System.out.println("Overdraft success! remaining balance is " + balance);
		} else {
			System.out.println("low balance cant withdraw");
		}
	}

}