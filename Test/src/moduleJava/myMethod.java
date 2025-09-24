package moduleJava;

import java.util.Scanner;

public class myMethod {
	
	
	
	public static String Name(Scanner scanner) {
		
		String Name;
		
		//Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		
		Name = scanner.nextLine();
		
		return Name;
	}
	
	public static int age(Scanner scanner) {
		
		int age;
		
		//Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your Age: ");
		age = scanner.nextInt();
		scanner.nextLine(); //This is done to avoid scanner from misbehaving
		
		return age;
	}
	
	public static String City(Scanner scanner) {
	
		String city;
	
		//Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your city: ");
		city = scanner.nextLine();
	
		return city;
}

}
