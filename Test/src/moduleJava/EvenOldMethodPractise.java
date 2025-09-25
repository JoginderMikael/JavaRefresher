package moduleJava;

import java.util.Scanner;

public class EvenOldMethodPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int number;
		
		do {
			System.out.print("Please enter the number to check if even or odd: ");
			
		while (!scanner.hasNextInt()) {
			System.out.println("You have entered invalid input. Put an integer.");
			scanner.next();
			System.out.print("Please enter the number to check if even or odd: ");
			
		}
		
		number = scanner.nextInt();
		
		} while (false);
		
		System.out.printf("The number %d is %s%n", number, evenOdd(number));
		
		scanner.close();
	}
	
	static String evenOdd(int number) {
		return (number % 2 == 0) ? "EVEN" : "ODD";
		
	}
	
}
