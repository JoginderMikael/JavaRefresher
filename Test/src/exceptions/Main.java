package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//exception => an event that interrupts the normal flow of a program. 
		// Dividing by zero, file not found, mismatch input type.
		//surround any dangerous code with try{}  block try{}, catch{}, finally{}
		
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();
			
			System.out.println(number);
		}
		catch (InputMismatchException e) { // catching specific exception - input mismatch
			System.out.println("That wasn't a number");
		
		}catch(ArithmeticException e) { // catching specific exception - arithmetic
			System.out.println("You can't divide by zero");
		} catch (Exception e) { //catching all exceptions
			
			//safety net
			System.out.println("Something went wrong");
		}
		
		//finally will always execute no matter what
		finally {
			scanner.close()	;
			System.out.println("This will always execute");
		}
	
	
	}
}
