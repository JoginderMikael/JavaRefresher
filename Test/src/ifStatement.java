import java.util.Scanner;

public class ifStatement {

	// This is to demonstrate the use of if statements in java. 
	// if statement = performs a block of code if its condition is true
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		boolean isStudent;
		
		System.out.print("Enter Your Name: ");
		name = scanner.nextLine();
		
		System.out.print("Enter Your AGE: ");
		
		age = scanner.nextInt();
		
		System.out.print("Are you a student (true/false): ");
		isStudent = scanner.nextBoolean();
		
		scanner.close();
		
		
		//GROUP 1 OF IF STATMENTS
		// CHECKING IF THE NAME IS EMPTY USING A STRING METHOD
		
		if (name.isEmpty()) {
			System.out.println("You didnt enter your name!");
			
		}else {
			System.out.println("Hello " + name + "!");
		}
		
		//GROUP 2 OF IF STATEMENTS
		if (age >= 65) {
			
			System.out.println("You are a senior");
			
		}
		else if( age < 0) { //else if clause. You can add as many else if clauses as possible
			System.out.println("The age is invalid");
		}
		else if (age == 0) { //"==" is the comparison operator, "=" is assignment operator.
			System.out.println("You have just been born");
		}
		else if (age >= 18) {
			System.out.println("You are an adult");
		} //The positioning of if else statement is important since the code is executed from top to bottom. 
		else { //else clause
			System.out.println("You are an child");
		}
		
		//GROUP 3 OF IF STATEMENT
		
		if (isStudent) { // instead of isStudent === true
			System.out.println("You are a student");
		}else {
			System.out.println("You are not a student");
		}

	}

}
