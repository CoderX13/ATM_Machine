package com.ATM;

import java.util.*;
import java.util.Map.Entry;
import java.io.IOException;
import java.security.*;
import java.text.*;

public class Menu extends Account {

	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Integer> data = new HashMap<>();

	/**
	 * @throws IOException
	 */
	public void getLogin() throws IOException {

		int x = 1;

		do {
			try {
				data.put(2000, 00);
				data.put(2001, 00);
				System.out.println("Welcome To ATM Machine");
				System.out.println("Kindly Enter The CustomerID");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("Enter Your Pin ");
				setPinNumber(menuInput.nextInt());

			} catch (Exception e) {

				System.out.println("Invalid Entry Kindly Try Again");
				x = 2;
			}
			for (Entry<Integer, Integer> entry : data.entrySet()) {
				if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("Wrong Customer Number");

		} while (x == 1);

	}

	int selection;

	public void getAccountType() {
		System.out.println("Select The Account You Want To Access");
		System.out.println("Type 1 : Checking Account");
		System.out.println("Type 2 : Saving Account");
		System.out.println("Type 3 : For Exit");
		System.out.println("Choose : ");
		selection = menuInput.nextInt();
		switch (selection) {
		case 1:
			getcheckingBalance();
			break;

		case 2:
			getsavingBalance();
			break;

		case 3:
			System.out.println("Thank You For Your Visit");
			break;

		default:
			System.out.println("Invalid Choice");
			getAccountType();
		}

	}

	public void getChecking() {
		System.out.println("Checking Account");
		System.out.println("Type 1 : Check Balance");
		System.out.println("Type 2 : Withdrawl Fund");
		System.out.println("Type 3 : Deposit Fund");
		System.out.println("Type 4 : Exit");
		System.out.println("Choose : ");
		selection = menuInput.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance" + moneyFormat.format(getcheckingBalance()));
			getAccountType();
			break;

		case 2:
			getCheckingWithdrawalInput();
			getAccountType();
			break;

		case 3:
			getCheckingdepositInput();
			getAccountType();
			break;

		case 4:
		default:
			System.out.println("Invalid Entry");
			getChecking();

		}
	}

	public void getSaving() {
		System.out.println("Saving Account");
		System.out.println("Type 1 : Check Balance");
		System.out.println("Type 2 : Withdrawl Fund");
		System.out.println("Type 3 : Deposit Fund");
		System.out.println("Type 4 : Exit");
		System.out.println("Choose : ");
		selection = menuInput.nextInt();
		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance" + moneyFormat.format(getsavingBalance()));
			getAccountType();
			break;

		case 2:
			getSavingdepositInput();
			getAccountType();
			break;

		case 3:
			getSavingdepositInput();
			getAccountType();
			break;

		case 4:
		default:
			System.out.println("Invalid Entry");
			getSaving();
		}

	}

}
