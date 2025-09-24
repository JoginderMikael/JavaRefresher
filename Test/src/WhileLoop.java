import java.util.Scanner;

public class WhileLoop {
// Demonstrates the use of While Loops in java
	public static void main(String[] args) {
		
		//A while loop repeats a segment of code so long as some condition is met
		//can be used in places where if statement fails
		//Useful while accepting user input to make sure the user input is valid
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		/*
		if (name.isEmpty()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		*/
		
		while (name.isEmpty()) { // checks if name is entered, repeats until the name is entered
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);
		
		//Forcing user to enter Q
		
		String response = "";
		while(!response.equals("Q")) {
			System.out.println("You are playing a game.");
			System.out.println("Press Q to quit: ");
			
			response = scanner.next().toUpperCase();
		}
		
		System.out.println("You have Quit the game");
		
		//checking for non negative age
		
		int age = 0;
		
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		
		while (age < 0) {
			System.out.println("Your age can't be negative");
			System.out.print("Enter your age: ");
			age = scanner.nextInt();
		}
		System.out.println("Your age is " + age);
		
		//do while loop
		//checks the condition at end
		
		int number = 0;
		
		do {
			System.out.println("Enter a number between 1 and 10: ");
			number = scanner.nextInt();
			
		} while(number < 1 || number > 10);
		
		System.out.println("You have entered " + number);
		
		
		scanner.close();
		
		//CAN create an infinite loop which is dangerous as it will execute forever. Happens when the conditions cant change within the loop
		//eg while (1 == 1)
		
		
		
	}

}
