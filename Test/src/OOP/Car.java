package OOP;
// car is an object
public class Car {
	// this are the attributes of car object - things that object has
		String make = "Ford";
		String model = "Mustang";
		int year = 2025;
		double price = 58000.99;
		boolean isRunning = false;
		
		//methods for car object
		
		void start() { // you do not need the static key word for now, only return type
			isRunning = true;
			System.out.println("You start the engine");
		}
		void stop() {
			isRunning = false;
			System.out.println("You stop the engine");
		}
		
		void drive() {
			System.out.println("You drive the " + model);
		}
		void brake() {
			System.out.println("You brake a " + model);
		}
}
