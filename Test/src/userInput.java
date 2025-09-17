// This class is designed to demonstrate the user input in java through the use of scanner 

import java.util.Scanner;


public class userInput {
	
		public static void main(String[] args) {
			
		//scanner object
			
			Scanner scanner = new Scanner(System.in);
			
			
			// enter your name
			
			System.out.print("Enter Your Name: ");
			
			String name = scanner.nextLine(); // to read a string
			
			System.out.print("Enter Your Age: ");
			
			int age = scanner.nextInt(); //to enter integer
			scanner.nextLine(); //used to clear the input buffer
			
			System.out.print("Enter your gpa: ");
			double gpa = scanner.nextDouble(); //To enter a double
			
			System.out.print("Are you a student? (true/false) ");
			boolean isStudent = scanner.nextBoolean(); //To enter a boolean
			
			System.out.println("Hello "+name);
			System.out.println("Your age is "+age);
			System.out.println("Your gpa is "+gpa);
			scanner.close();
			
			
			if(isStudent) {
				
				System.out.println("You are a student");
			}
			else {
				System.out.println("You are not a student");
			}
			
		}
	}

