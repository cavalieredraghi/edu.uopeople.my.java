package PayrollSystem;

public class Vehicle {
	private String plateNumber;
	private String color;
	
	public Vehicle (String plateNumber, String color){
		this.plateNumber=plateNumber;
		this.color=color;
	}
	//getters and setters

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
