package edu.uopeople.my.week1;

import java.io.*;

public class GravityCalculator {
	public static void main(String[] arguments) {

		double gravity = -9.81; // Earth's gravity in m/s^2

		double initialVelocity = 0.0; // starting velocity of the object

		double fallingTime = 10.0; // time in seconds that the object falls

		double initialPosition = 1000.0; // Starting position in meters, the calculation will determine the ending
											// position in meters

	//	double finalPosition = 0.0;  Commenting out the initial Final Position
		//Associating the variables above to of the assignment
		double a = gravity;
		double t = fallingTime;
		double vi = initialVelocity;
		double xi = initialPosition;
		double xt = .5*a*(t*t)+vi*t+xi;
		
		System.out.println(
				"The object's position after " + fallingTime + " seconds is 			" + xt  + " m."); //removed the Final Position from the println

	}
}
