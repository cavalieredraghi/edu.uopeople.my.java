package edu.uopeople.my.week4;

import java.util.Scanner;

public class FirstSubroutines {

	String str;

	String reverse = "";

	int i;

	// this subroutine is just linking the object I create to the string
	public FirstSubroutines(String str) {
		this.str = str;
	}

	// this subroutine is making the string lower case and have no other characters
	// aside from letters
	public void subroutines() {
		str = str.replaceAll("[^A-Za-z]", "");
		str = str.toLowerCase();
		System.out.println(str);

		// this subroutine half is testing the palindrome
		System.out.println("Stripped: " + str);
		for (i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reversed: " + reverse);

		if (str.equals(reverse)) {
			System.out.println("this IS a palindrome.");

		} else {
			System.out.println("this is NOT a palindrome");
		}
	}
}
