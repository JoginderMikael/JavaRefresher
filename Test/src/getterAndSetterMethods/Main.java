package getterAndSetterMethods;

public class Main {
	
	public static void main(String[] args) {
		
		//Getter and Setter methods help protect object data and add rules for accessing or modifying the data. 
		// GETTERS => These methods make a field READABLE.
		// SETTERS=> These methods make a field WRITTEABLE.
		
		Car car = new Car("Axio", "Silver" ,2000000);
		
		// The attributes of the car object are publicly accessible meaning they can be accessed and changed easily (IF NOT SET AS PRIVATE).  
		
		//System.out.println(car.color + " " + car.model + " KES " + car.price);
		
		// calling setters to change private attributes
		car.setColor("Blue");
		car.setPrice(22000000);
		
		//calling getters to read the private attributes
		System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
	}

}
