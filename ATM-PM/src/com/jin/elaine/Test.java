package com.jin.elaine;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account cus001 = new Account(100000000.0);
		Scanner scan = new Scanner(System.in);
		int cashout = 0;
		try {
			cashout = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter an integer number.");
			System.exit(0);
		} finally {
			if (cashout == 0) {
				System.out.println("See you.");
				// } else if (cashout % 10 == 0) {
			} else if (cashout
					% BankNotes.getNotesAvailable().get(
							BankNotes.getNotesAvailable().size() - 1) == 0) {
				cus001.cashOut(cashout);
			} else {
				System.out
						.println("Sorry, we cannot provide banknote less than $10.");
			}
		}

	}

}
