package edu.uopeople.my.week3;

import java.io.*;
import java.sql.Array;
import java.util.*;

public class Week_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating an object from ReacIcecream
		ReadIcecream readIcecream = new ReadIcecream();
		// reading the file and putting it into an arraylist
		final Collection<Items> flavors = readIcecream.loadIcecream("icecream.dat");
		// creating a variable to track total number of lines in file
		int i = 0;
		int s = 0;
		for (Items flavor : flavors) {
			i++;
			if (flavor.equals("Strawberry")) {
				s++;
			}
		}
		System.out.println("The total number of items sold is: " + i + "  the amount that was Strawberry is: " + s);
	}
}
