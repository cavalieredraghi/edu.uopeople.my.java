package edu.uopeople.my.week2;

import java.util.*;

public class SnakeEyes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int die1 = (int) (Math.random() * 6) + 1;
		int die2 = (int) (Math.random() * 6) + 1;
		// personally I don't like this way of generating a die number.
		// I would use ThreadLocalRandom.current().nextInt(1, 20 + 1) which I feel
		// allows for more control
		int snakeEyes = 0;
		// this is to show I can roll.
		System.out.println("I rolled a: " + die1 + " and " + die2);
		for (int i = 1; i <= 1000; i++) {
			int die3 = (int) (Math.random() * 6) + 1;
			int die4 = (int) (Math.random() * 6) + 1;
			int roll = die3 + die4;
			if (roll == 2) {
				snakeEyes++;
			}
		}
		float average = 1000 / snakeEyes;
		System.out.println("The rough average for Snake Eyes  out of a 1000 rolls is: " + average + "%");
	}
}