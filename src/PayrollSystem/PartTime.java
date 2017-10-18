package PayrollSystem;

public class PartTime extends Employee{
	private double rate;
	private double hoursWorked;

	public PartTime (int id, String name, double rate, double hoursWorked2, Vehicle v1){
		super (id,name,v1);
		this.rate= rate;
		this.hoursWorked = hoursWorked2;
	}
	public double calculatePay() {
		// TODO Auto-generated method stub
		System.out.println("Part time employee");
		
		return (this.hoursWorked + this.rate);
	}

	//getters and setters
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
