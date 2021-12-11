package com.ATM;

import java.util.*;
import java.text.*;

public class Account {

	Scanner Input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##.00");
	private int customerNumber;
	private int pinNumber;
	private double savingBalance;
	private double checkingBalance;

	public int getPinNumber() {
		return pinNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public double getsavingBalance() {
		return savingBalance;
	}

	public double getcheckingBalance() {
		return checkingBalance;
	}

	public double calcheckingwithdrawal(double amount) {
		checkingBalance = checkingBalance - amount;
		return checkingBalance;
	}

	public double calsavingwithdrawal(double amount) {
		savingBalance = savingBalance + amount;
		return savingBalance;
	}

	public double calcheckingdeposit(double amount) {
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
	}

	public double calsavingdeposit(double amount) {
		savingBalance = savingBalance + amount;
		return savingBalance;
	}

	public void getCheckingWithdrawalInput() {

		System.out.println("Checking Account Balance" + moneyFormat.format(checkingBalance));
		System.out.println("Amount You Want to Withdrawal From Checking Account");
		double amount = Input.nextInt();
		if ((checkingBalance - amount) >= 0) {
			calcheckingwithdrawal(amount);
			System.out.println("New Checking Account Balance " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Insufficant Balance Please Check");
		}

	}

	public void getSavingWithdrawalInput() {

		System.out.println("Saving Account Balance" + moneyFormat.format(savingBalance));
		System.out.println("Amount You Want to Withdrawal From Checking Account");
		double amount = Input.nextInt();
		if ((savingBalance - amount) >= 0) {
			calsavingwithdrawal(amount);
			System.out.println("New Saving Account Balance " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Insufficant Balance Please Check");
		}

	}

	public void getCheckingdepositInput() {

		System.out.println("Checking Account Balance" + moneyFormat.format(checkingBalance));
		System.out.println("Amount You Want to Deposit From Checking Account");
		double amount = Input.nextInt();
		if ((checkingBalance - amount) >= 0) {
			calcheckingdeposit(amount);
			System.out.println("New Checking Account Balance " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Insufficant Balance Please Check");
		}

	}

	public void getSavingdepositInput() {

		System.out.println("Saving Account Balance" + moneyFormat.format(savingBalance));
		System.out.println("Amount You Want to Deposit From Checking Account");
		double amount = Input.nextInt();
		if ((savingBalance - amount) >= 0) {
			calsavingdeposit(amount);
			System.out.println("New Saving Account Balance " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Insufficant Balance Please Check");
		}

	}

}
