package toStringMethod;

public class Main {

	public static void main(String[] args) {
		// toString() => Method inherited from Object Class.
		// 				it is used to return a string representation of an Object. 
		//				By default, it returns a hash code as unique identifier
		//				it can be overridden to provide meaningful details
		
		
		Car car1 = new Car("Ford", "Mustang", 2025, "Red" );
		Car car2 = new Car("Toyota", "Axio", 2020, "silver" );
		
		System.out.println(car1);
		System.out.println(car2);
		
	}

}
