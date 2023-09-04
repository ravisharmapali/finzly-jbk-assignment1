package com.jbk.collection.sol2;

import java.util.ArrayList;

public class AccountMasters {
	private ArrayList<Account> accounts = new ArrayList<>();

	public void createAccount(Account account) {
		if (account != null) {
			accounts.add(account);
		} else {
			System.out.println("Unable to create account!");
		}

	}

	public String deposite(int accountNumber, double amount) {

		String message = "";
		for (Account account : accounts) {
			if (account.getAcNo() == accountNumber) {
				account.setAcBal(account.getAcBal() + amount);
				message = "Successfully deposite";
				break;
			}

		}
		if (message.equals("")) {
			message = " Unable to deposite";
		}
		return message;

	}

	public String withdraw(int accountNumber, double amount) {
		String message = "";

		for (Account account : accounts) {
			if (account.getAcNo() == accountNumber) {

				if (account.getAcBal() < amount) {
					return "Cant withdraw due to low ac balance";
				} else {
					account.setAcBal(account.getAcBal() - amount);
					return "Withdraw success ! remaining balance is " + account.getAcBal();
				}

			}
		}
		return null;

	}

	public void checkAccountBalance(int accountnumber3) {
		for (Account account1 : accounts) {
			if (account1.getAcNo() == accountnumber3) {
				double acBal = account1.getAcBal();
				System.out.println("Account balance is " + acBal);
				break;
			}
		}

	}

	public void listAllAccounts() {
		System.out.println("AcNo"+"\t"+"Ac Name"+"\t"+"Ac Bal");
		for (Account account : accounts) {
			System.out.print(account.getAcNo() + "\t" + account.getAcName() + "\t" + account.getAcBal());

		}
	}

}
