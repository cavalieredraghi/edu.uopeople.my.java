package edu.uopeople.my.week4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
		System.out.println("Please enter a palindrome: " );
		String pal = str.nextLine();//.replaceAll("\\s+", "").toLowerCase();
		FirstSubroutines first = new FirstSubroutines(pal);
		first.subroutines();
	}

}
