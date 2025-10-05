package composition;

public class Main {

	public static void main(String[] args) {
		// Composition => represents a "part of" relationship between objects.
		// for example, an Engine is 'part of' a car. 
		// allows complex objects to be constructed from smaller objects. 
		
		

		Car car = new Car ("Axio", 2018, "NZE");
		
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.engine.type); // accessing the engine object. 
		
		car.start();
	}

}
