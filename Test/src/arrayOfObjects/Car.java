package arrayOfObjects;

public class Car {
	String model;
	String color;
	
	Car(String color, String model){
		this.model = model;
		this.color = color;
		
	}
	
	void drive() {
		System.out.println("You drive the " + this.color + " " + this.model);
	}

}
