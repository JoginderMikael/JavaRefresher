
public class VARIABLES {
	// This class is to demonstrate the use of variables in Java
	
	/* 
	 A variable in Java is a container that holds data that can be used and manipulated in a program. Every variable has:

	A name (identifier).

	A type (what kind of data it can store).

	A value (the actual data stored).

	 * */
	
	
	/*
	 * 
	 * Primitive vs reference variables
	 * Primitive Variables

	Store actual values (numbers, characters, booleans, etc.).

	Java has 8 primitives: byte, short, int, long, float, double, char, boolean.

	Stored in stack memory (fast access).

	Default values (if instance variable):
	
	
	Reference Variables

	Store the address (reference) of an object, not the actual object.

	Used for objects, arrays, Strings, and custom classes.

	Stored in heap memory, but the variable (reference) itself lives on the stack.

	Default value (if instance variable) is null.
	 */
	public static void main(String[] args) {
		
		int year = 2025; //int are whole numbers. Some example of variables that can be int are year.
	
		double age = 28.5; // double are decimal numbers. Some example of double variables could be temperature, gpa or price. 
		
		char grade = 'A'; //Char is a character data type and its a simple or character. Examples are grades, or currency. 
		char symbol = '!';
		char currency = '$';
		
		boolean isStudent = false; //this variables are often using under code, eg in if statements. They are called boolean variables
		boolean forSale = false;
		boolean isOnline = true;
		
		
		String name = "Michael"; //A string variable is just a combination of characters
		
		
				System.out.println(" Today is year " +year+ " and my age is " +age);
				System.out.println("My name is " +name+ " I got an " +grade+ " in school"+symbol+ " and I received " +currency+ "100");
				
				
				
		if(isStudent) {
				
				System.out.println("You are student");
				
				}
				else {
					
					System.out.println("You are not a student");
				}
	}
}
