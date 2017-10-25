package PayrollSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> arrEmp = new ArrayList<Employee>();
		String VarCont = "N";
		byte menuOption = 0;
		do {
			menuOption = showMenu();
			switch (menuOption) {
			case 1:
				FullTime ft;
				ft = readNewFullTime();
				addEmployee(arrEmp, ft); // add full time employee to arraylist
				break;
			case 2:
				PartTime pt;
				pt = readNewPartTime();
				addEmployee(arrEmp, pt); // add part time employee to arraylist
				break;
			case 3:
				calcPayroll(arrEmp);
				break;
			default:
				break;
			}
		} while (menuOption != 4);
	}

	public static FullTime readNewFullTime() {
		/* this methods CREATES and POPULATES Employee Objects */
		/* Parameters: none */
		/* Return Values: new Fulltime */
		int id = 0;
		String name = null;
		double sal = 0.0;
		double hourAndHalf = 0.0; // overtime
		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter Id: ");
		id = kbd.nextInt();
		System.out.println("\nEnter Name: ");
		name = kbd.next();
		System.out.println("\nEnter Salary: ");
		sal = kbd.nextDouble();
		System.out.println("\nEnter Bonus: ");
		hourAndHalf = kbd.nextDouble();

		FullTime ftl = null;
		ftl = new FullTime(id, name, sal, hourAndHalf, getVehicle());
		return ftl;
	}

	public static PartTime readNewPartTime() {
		/* this methods CREATES and POPULATES Employee Objects */
		/* Parameters: none */
		/* Return Values: new PartTime */
		int id = 0;
		String name = null;
		double rate = 0.0;
		double hoursWorked = 0.0; // overtime

		Scanner kbd = new Scanner(System.in);
		System.out.println("Enter Id: ");
		id = kbd.nextInt();
		System.out.println("\nEnter Name: ");
		name = kbd.next();
		System.out.println("\nEnter Hourly Rate: ");
		rate = kbd.nextDouble();
		System.out.println("\nEnter Number of Hours Worked: ");
		hoursWorked = kbd.nextDouble();

		Vehicle v1 = getVehicle();
		PartTime pt1 = null;
		pt1 = new PartTime(id, name, rate, hoursWorked, v1);

		return pt1;
	}

	public static byte showMenu() {
		byte menuOption = 0;
		Scanner kbd = new Scanner(System.in);

		System.out.println("" + "/* ************************************/" + "\n/* 1. Add FullTime                  */"
				+ "\n/* 2. Add PartTime                  */" + "\n/* 3. Calculate Payroll             */"
				+ "\n/* 4. Exit                          */" + "\n/* **********************************/");
		System.out.println("Input: ");
		menuOption = kbd.nextByte();

		return menuOption;
	}

	public static void calcPayroll(ArrayList<Employee> pArrEmp) {
		double totalCompanyPay = 0.0;
		double individualPay;

		// calculate salary - manipulating array only
		for (int i = 0; i < pArrEmp.size(); i++) {
			System.out.println("\n******************************\n");
			individualPay = (pArrEmp.get(i)).calculatePay();
			Vehicle v = (pArrEmp.get(i)).getVehicle();
			String hasVehicle;

			// check employee has a vehicle or not
			if (v == null)
				hasVehicle = "No";
			else
				hasVehicle = "Yes";

			System.out.println("Employee Name: " + (pArrEmp.get(i)).getName());
			System.out.println("Has Vehicle: " + hasVehicle);

			if (v != null) {
				System.out.println("Plate Number: " + v.getPlateNumber());
				System.out.println("Color: " + v.getColor());
			}

			System.out.println("Take Home Pay: " + individualPay);

			totalCompanyPay = totalCompanyPay + individualPay;

		}
		System.out.println("--------------\nTotal payroll of the company: " + totalCompanyPay + "\n-----------------");
	}

	public static Vehicle getVehicle() {
		// creates and returns a vehicle object if "Y" Else returns null
		Scanner kbd = new Scanner(System.in);
		String hasVehicle = "N";

		System.out.println("\n Does this employee have a vehicle? Y/N : \nInput : ");
		hasVehicle = kbd.next();

		if (hasVehicle.equalsIgnoreCase("Y")) {
			// create and populate object Vehicle
			System.out.println("\nEnter plate number: ");
			String auxPlate = kbd.next();
			System.out.println("\nEnter vehicle Color: ");
			String auxColor = kbd.next();
			return (new Vehicle(auxPlate, auxColor));
		} else {
			// employee does not have a vehicle
			return (null);
		}
	}
	
	public static void addEmployee(ArrayList<Employee> pArrEmp, Employee pEmp) {
		// this method add one employee e, to the arraylist arrEmp
		pArrEmp.add(pEmp);
	}
}
