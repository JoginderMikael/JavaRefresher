
public class Methods {

	public static void main(String[] args) {
		// A method is a block of a reusable code that is executed when you called it. 
		
		// to call a method use ()
		
		// can be written once and be reused when needed 
		String name = "Joginder";
		int age = 25;
		
		//calling methods and passing values
		happyBirthday(name, age);
		System.out.println("The square of 3 is " + square(3));
		System.out.println("The cube of 3 is " + cube(3));
		System.out.println("Your first name is Joginder and Your last name is Mikael so your full name is  " + fullName("Joginder", "Mikael"));
		
		if(ageCheck(age)) {
			System.out.println("You are an adult.");
		}else {
			System.out.println("You are an underage.");
		}
	}
	
	// Methods
	
	static void happyBirthday(String name, int age) { //needs to be static because it is being called from another method that is static
		//methods are not aware of the variables declared in other methods
		//the only way this is possible is pass the argument from other method. When passing make sure order and data type is consistent
		System.out.println("Happy birthday to you");
		System.out.printf("Happy birthday dear %s\n", name);
		System.out.printf("You are %d years old\n", age);
		System.out.println("Happy birthday to you \n");
	}
	
	// Method to square a number
	static double square(double number) {
		return number * number;
	}
	
	// method to cube a number
	static double cube (double number) {
		return number * number * number;
	}
	
	// method to make a full name of a person
	static String fullName (String first, String last) {
		return first + " " + last;
	}
	
	//method to check age of a person
	static boolean ageCheck(int age) {
		if(age >= 18) {
			return true;
		}else {
			return false;
		}
			
	}
	

}
