package runtimePolymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Also known as Dynamic polymorphism
		
		//Runtime polymorphism is when the method that gets executed is decided at runtime based on actual type of the object. 
		
		
		Scanner scanner = new Scanner (System.in);
		
		Animal animal; // Animal object but not instantiated. 
		
		System.out.print("Would you like a Dog or a Cat (1 = Dog, 2 = Cat): ");
		int choice = scanner.nextInt();
		
		// Here the actual method that is called is determined at runtime. 
		if(choice == 1) {
			animal = new Dog();
			animal.speak();
		} else if(choice == 2) {
			animal = new Cat();
			animal.speak();
		}
		
		
		
	scanner.close();
	}

}
