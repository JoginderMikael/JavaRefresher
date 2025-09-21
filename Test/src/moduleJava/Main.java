package moduleJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String yourName = myMethod.Name(scanner);
		int yourAge = myMethod.age(scanner);
		String yourCity = myMethod.City(scanner);
		
		
		System.out.println("Your name is " + yourName + ".");
		System.out.println("Your age is " + yourAge + ".");
		System.out.println("You live in " + yourCity + " City");
		
		scanner.close();

	}

}
