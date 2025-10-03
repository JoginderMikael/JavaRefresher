package toStringMethod;

public class Car {
	
	String make;
	String model;
	int year;
	String color;
	
	Car (String make, String model, int year, String color){
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		
	}
	
	//Overriding the string method to get meaningful details
	@Override
	public String toString() {
		return this.color + " " + this.year + " " + this.make + " " + this.model;
	}

}
