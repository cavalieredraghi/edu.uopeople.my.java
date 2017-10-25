package edu.uopeople.my.week7;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int n = 5;
		int a[][] = new int[n][n];
		int sum = 0, sum1 = 0;
		int rows = a.length;
		int columns = a[0].length;
		String str = "|\t";

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// fills the cells in the matrix with random numbers between 1 and 10
				a[i][j] = rand.nextInt(10) + 1;
				// primary diagonal
				if (i == j) {
					sum += a[i][j];
				}

				// secondary diagonal
				if (i == n - j - 1) {
					sum1 += a[i][j];
				}
			}
		}
		// this loop is to display the matrix for double checking of work.
		try {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					str += a[i][j] + "\t";
				}

				System.out.println(str + "|");
				str = "|\t";
			}
		} catch (Exception e) {
			System.out.println("Matrix is empty or not even!!");
		}

		System.out.println(Math.abs(sum - sum1));

	}
}
