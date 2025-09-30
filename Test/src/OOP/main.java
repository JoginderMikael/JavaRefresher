package OOP;

public class main {
				// Introduction to OOP
	public static void main(String[] args) {
				// OBJECT - An entity that holds data (attributes) 
				// and can perform actions(Methods)
				// it is a reference data type
		
		// create a car object object
		Car car = new Car();
		
		//printing the car object attributes
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.year);
		System.out.println(car.price);
		System.out.println(car.isRunning);
		
		// Modifying attributes
		
		car.isRunning = true;
		System.out.println(car.isRunning);
		
		
		//calling an object method
		System.out.println(car.isRunning);
		car.start();
		System.out.println(car.isRunning);
		car.stop();
		System.out.println(car.isRunning);
		
		car.drive();
		car.brake();
		
		// new car object
		Car car2 = new Car();
		
		System.out.println(car.make + " " + car.model);
		System.out.println(car2.make + " " + car2.model);
		

	}

}
