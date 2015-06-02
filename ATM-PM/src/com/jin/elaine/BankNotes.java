package com.jin.elaine;

import java.util.ArrayList;
import java.util.Collections;

public class BankNotes {

	// public ArrayList<Integer> notesAvailable;

	private static final ArrayList<Integer> notesAvailable = new ArrayList<Integer>() {
		{
			add(100);
			add(50);
			add(20);
			add(10);
			Collections.sort(this, Collections.reverseOrder());
		}
	};

	// public BankNotes() {
	// //notesAvailable = new ArrayList<>();
	// notesAvailable.add(100);
	// notesAvailable.add(50);
	// notesAvailable.add(20);
	// notesAvailable.add(10);
	// }

	public static ArrayList<Integer> getNotesAvailable() {
		return notesAvailable;
	}

}
