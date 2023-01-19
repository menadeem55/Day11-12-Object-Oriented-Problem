package com.bridgelabz.accountmanagement;

import java.util.Scanner;

public class ManageAccount {

	Scanner scanner = new Scanner(System.in); // create object

	static String name;
	private static int balance = 10000; // to generate balance

	/*
	 * show the balance
	 */

	public void viewBalance() {
		System.out.println(balance);

	}

	public void addBalance() {
		System.out.println("Please enter the amount to add: ");
		int amount = scanner.nextInt();
		balance = balance + amount; // adding mount to current balance

		System.out.println("The updated account balance is: " + balance);
	}

	/*
	 * method to withdraw money
	 */

	public void withdrawBalance() {
		System.out.println("Enter the amount to be withdraw: ");
		int amount = scanner.nextInt();
		if (amount <= 0) {
			System.out.println("Enter valid amount for withdraw: ");

		} else if (amount <= balance) {
			System.out.println("Withdraw is under process \nWithdraw process is successfull..");
			balance = balance - amount; // deducted amount from the current balance
			System.out.println("Updated balance is = " + balance);
		} else {
			System.out.println("Insufficient balance...");
		}
	}

}
