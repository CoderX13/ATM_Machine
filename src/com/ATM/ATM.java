package com.ATM;

import java.util.*;
import java.io.IOException;

public class ATM extends Menu {

	public static void main(String[] args) throws IOException {

		int pass = 12345;
		System.out.println("Welcome to Programme.. To Use ATM Machine Kinldy Enter Password");
		Scanner Input = new Scanner(System.in);
		pass = Input.nextInt();

		if (pass == 12345) {

			Menu menu = new Menu();
			menu.getLogin();
		} else {
			System.out.println("Sorry Wrong Password");
		}

	}

}
