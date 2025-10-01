package workingWorkingArrays;

import java.util.Scanner;

public class MultiplicationTableGenerator {
	// Multiplication table generator, arrays
	public static void main(String[] args) {
		
		// Declare variables
		int num;
		int[] table;
		Scanner scanner = new Scanner(System.in);
		
		// user input
		System.out.print("Please enter the number you want to create a multiplication table for: ");
		num = scanner.nextInt();
		
		//array to store the results
		table = new int[10];
		
		//generate the multiplication table
		for (int i = 0; i < 10; i++) {
			table [i] = num * (i+1);
	
		}
		
		
		//output
		System.out.println("Multiplication Table of " + num + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " x " + (i+1) + " = " + table[i]);
        }
		

	scanner.close();
	}

}
