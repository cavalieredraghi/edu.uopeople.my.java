package edu.uopeople.my.week6;

public class MatchBox extends Box {
	private double weight = ((width * depth * height) * .03611);

	MatchBox(double width, double height, double depth) {
		super(width, height, depth);
	}

	// creating the polymorphed getvolume
	// for you that are interested \n in a string creates a new line
	void getVolume() {
		System.out.println(
				" width of MatchBox is: " + width + "\n height of MatchBox is: " + height + "\n depth of MatchBox is: "
						+ depth + "\n Weight is: " + weight + "\n Volume is : " + width * height * depth);

	}

	void calculateWeight() {
		System.out.println("weight of MatchBox is: " + weight);
	}
}
