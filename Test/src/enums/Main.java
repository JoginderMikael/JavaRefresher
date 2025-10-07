package enums;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Enums => (Enumerations) A special kind of class that represents a fixed set of constants. 
		// they improve code readability and are easy to maintain. 
		// More efficient with switches when comparing strings. 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter day of the week: ");
		String response = scanner.nextLine().toUpperCase();
		
		
		
		
		/*
		System.out.println(day);
		System.out.println(day.getDayNumber());
		*/
		
		//working with switches
	try {
		Day day = Day.valueOf(response);
		switch(day) {
		case MONDAY, 
			TUESDAY, 
			WEDNESDAY, 
			THURSDAY, 
			FRIDAY -> System.out.println("It is a weekday");
		case SATURDAY, SUNDAY -> System.out.println("It is a weekend");
		
		
		}
	} catch(IllegalArgumentException e){
		System.out.println("Please enter a valid day");
	}
	scanner.close();
	}

}
