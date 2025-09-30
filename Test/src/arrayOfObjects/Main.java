package arrayOfObjects;

public class Main {

	public static void main(String[] args) {
		
		/*
		Car car1 = new Car("Blue", "Mustang");
		Car car2 = new Car("Green", "Axio");
		Car car3 = new Car("Yellow", "MarkX");
		
		Car[] cars = {car1, car2, car3};
		*/
		
		//passing anonymous objects
		Car[] cars = 	{new Car("Blue", "Mustang"), 
						new Car("Green", "Axio"), 
						new Car("Yellow", "MarkX")};
		
		
		// normal for loop
		for(int i = 0; i < cars.length; i++) {
			cars[i].drive();
		}
		
		//enhanced for loop
		for(Car car : cars) {
			car.drive();
		}
		
		// trying changing color of cars
		for(Car car : cars) {
			car.color = "black";
		}
		
		for(Car car : cars) {
			car.drive();
		}

	}

}
