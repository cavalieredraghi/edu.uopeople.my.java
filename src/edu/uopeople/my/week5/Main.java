package edu.uopeople.my.week5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatCalc mystatcalc = new StatCalc();
		// numbers needing to be entered: 5, 7, 12, 23, 3, 2, 8, 14, 10, 5, 9, 13
		//entering in all the numbers to mystatcalc
		mystatcalc.enter(5);
		mystatcalc.enter(7);
		mystatcalc.enter(12);
		mystatcalc.enter(23);
		mystatcalc.enter(3);
		mystatcalc.enter(2);
		mystatcalc.enter(8);
		mystatcalc.enter(14);
		mystatcalc.enter(10);
		mystatcalc.enter(5);
		mystatcalc.enter(9);
		mystatcalc.enter(13);
		//giving out the output
		System.out.println("Our set of numbers is:  5, 7, 12, 23, 3, 2, 8, 14, 10, 5, 9, 13");
		System.out.println("Our count of the set is: "+ mystatcalc.getCount());
		System.out.println("Our Mean is: " + mystatcalc.getMean());
		System.out.println("Our Standard Deviation is: " + mystatcalc.getStandardDeviation());
	}

}
