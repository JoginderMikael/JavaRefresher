package polymorphismInJava;

public class Main {

	public static void main(String[] args) {
		// Polymorphism  ="POLY" is a Greek word meaning "Many"
		//				= "MORPH" means "SHAPE"
		// together gives the idea of many shapes
			// Objects can identify as other objects. 
		// objects can be treated as objects of a common superclass. 
		//eg, a dog can be identified as an animal, an organism, or object
		
		Car car = new Car();
		Bike bike = new Bike();
		Boat boat = new Boat();
		
		/*
		car.go();
		bike.go();
		boat.go();
		 */
		
		// creating an array of objects
		// Car [] cars = {car, bike, boat}; This can't work because Bikes and Boats do not identify as cars
		
		
		// therefore solve it this way - POLYMORPHISM
		Vehicle[] vehicles = {car, bike, boat}; // All the objects identify as vehicles since they extend from the vehicle superclass. 
		
		for (Vehicle vehicle : vehicles ) {
			vehicle.go();
		}
		
		//	Polymorphism can also be used with interfaces.
		
		
	}

}
