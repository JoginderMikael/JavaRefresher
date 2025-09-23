import java.util.Scanner;

public class TernaryOperator {
//The demonstration of the use of the ternary operator
	public static void main(String[] args) {
		// Ternary operator ? = returns 1 of 2 values if a condition is true. It is a simpler of if statement
		
		// variable = (condition) ? ifTrue : ifFalse;
		
		int score = 60;
		/*
		if (score >= 70) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		*/
		
		String passOrFail = (score >= 70) ? "Pass" : "Fail";
		
		System.out.println("The score is a " + passOrFail);
		
		//checking even or odd
		
		int number = 3;
		String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
		System.out.println("The number is " + evenOrOdd);
		
		//Checking the time of the day
		int hours = 13;
		String timeOfDay = (hours > 12) ? "PM" : "AM";
		System.out.println("The time of the day is " + timeOfDay);
		
		
		

	}

}
