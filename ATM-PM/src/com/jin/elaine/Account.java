package com.jin.elaine;


public class Account implements ATM {

	private double balance;

	public Account(double d) {
		// TODO Auto-generated constructor stub
		balance = d;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double d) {
		this.balance = d;
	}

	@Override
	public void cashOut(int v) {
		// BankNotes notes = new BankNotes();
		int n = 0;
		if (balance >= v) {
			// for (int i : notes.notesAvailable) {
			for (int i : BankNotes.getNotesAvailable()) {
				n = v / i;
				if (n > 0) {
					// System.out.println(String.valueOf(n) + " $" + i +
					// " bill ");
					System.out.println(n + " $" + i + " bill ");
					v = v % i;
				}
			}
			this.balance -= v;
		} else {
			System.out.println("Balance not enough");
		}

	}
}
