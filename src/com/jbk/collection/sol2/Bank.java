package com.jbk.collection.sol2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		AccountMasters acMasters = new AccountMasters();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit Funds");
			System.out.println("3. Withdraw Funds");
			System.out.println("4. Check Balance");
			System.out.println("5. List All Accounts");
			System.out.println("6. Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("enter ac num");
				int accountnumber = sc.nextInt();
				System.out.println("enter ac name");
				String name = sc.next();
				System.out.println("opening balance");
				double balance = sc.nextDouble();
				Account account = new Account(accountnumber, name, balance);
				acMasters.createAccount(account);
				break;
			case 2:
				System.out.println("Please enter account number");
				int accountNumber = sc.nextInt();
				System.out.println("Enter amount ");
				double amount = sc.nextDouble();

				String response = acMasters.deposite(accountNumber, amount);
				System.out.println(response);
				break;
			case 3:
				System.out.println("enter account number");
				int accountNumber1 = sc.nextInt();
				System.out.println("enter amount to withdraw");
				double amount1 = sc.nextDouble();

				acMasters.withdraw(accountNumber1, amount1);
				break;
			case 4:
				int accountnumber3 = sc.nextInt();
				acMasters.checkAccountBalance(accountnumber3);
				break;
			case 5:
				acMasters.listAllAccounts();

				break;
			case 6:

				System.exit(0);
			default:
				System.out.println("Invalid number");
			}
		}

	}

}