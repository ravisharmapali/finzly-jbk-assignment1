package com.finzly.simplebanking;

public class SavingAccount extends BankAccount {

	// to store the interest rate
	private double interestRate;

	public SavingAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);
		this.interestRate = interestRate;
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
	public String getAccountHolderName() {

		return accountHolderName;
	}

	@Override
	public String getAccountNumber() {

		return accountNumber;
	}

	@Override
	public double getBalance() {

		return balance;
	}

	@Override
	public void withdraw(double amount) {

		double minumumBalance = 3000;

		if (amount < balance) {
			double temp = balance - amount;
			if (temp < minumumBalance) {
				System.out.println("cant withdraw ! minimum balance " + minumumBalance + " required");
			} else {
				super.balance -= amount;
				System.out.println("withdraw success! remaining balance is "+balance);
			}
		} else {
			System.out.println("low balance cant withdraw");
		}

	}
}
