package edu.uopeople.my.week1;

import java.io.*;

public class testing_for_tests {
	public static void main(String[] arguments) {
		String x = stringFunction("mississippi");
		String stringFunction(String str){
			String test;
			int i;
			test = "";
			for (i = str.length() - 1; i >= 0; i--) {
				test = test + str.charAt(i);
			}
			return test;
		}
	}
}
