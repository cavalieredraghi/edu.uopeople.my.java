package PayrollSystem;

public abstract class Employee {
	//following first weeks instructions
	//class variables
	private int empId;
	private String name;
	private Vehicle vehicle;
	//class constructor
	public Employee(){
		//default constructor is a constructor
		System.out.println(".. inside default constructor");
		empId = 0;
		name = "";
	}
	public Employee (int pEmpId, String pName, Vehicle pV){
		//a non default constructor is a constructor with at least 1 parameter
		System.out.println(".. inside Employee non-default constructor");
		empId= pEmpId;
		name = pName;
		this.vehicle = pV; // pV must have been previously created in the calling env.
	}
	public Employee (int pEmpId, String pName, String pPlate, String pColor){
		//a non default constructor is a constructor with at least 1 parameter
		System.out.println(".. inside Employee non-default constructor");
		empId=pEmpId;
		name=pName;
		this.vehicle = new Vehicle (pPlate,pColor);
	}
	//abstract
	public abstract double calculatePay();
	//class getters and setters
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
}
