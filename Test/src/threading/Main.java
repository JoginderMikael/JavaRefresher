package threading;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Threading => allows a program to run multiple tasks simultaneously. 
		//				Helps improve performance with time consuming operations. 
		// 				(File I/O, Network Communications, or any background tasks)
		
		
		//How to create a thread 
		//option 1. extend the thread class (simpler) - limited to single inheritance.
		// option 2. implement the runnable interface (better)
		

		//OPTION 2
		
		Scanner scanner = new Scanner(System.in);
		
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		
		thread.setDaemon(true); //thread will end when main thread it over
		
		thread.start();
		
		System.out.println("You have 5 seconds to enter your name.");
		
		
		
		System.out.print("Enter your Name: ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		scanner.close();
	}

}
