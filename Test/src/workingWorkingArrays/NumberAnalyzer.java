package workingWorkingArrays;
import java.util.Arrays;
import java.util.Scanner;

public class NumberAnalyzer {
// DEMONSTRATES WORKING OF ARRAYS BY ANALYZING INTEGER ELEMENTS OF ARRAYS
	public static void main(String[] args) {
		
		int[] numbers; // = {10, 15, 24, 33, 5, 100, 16, 50, 63, 72, 81, 44, 42, 34, 11};
		
		Scanner scanner = new Scanner(System.in);
		int lengthOfNumbers; //= numbers.length;
		
		
		System.out.println(" =========NUMBERS ANALYZER====== ");
		System.out.print("How many numbers do you want to Analyze: ");
		
		while(!scanner.hasNextInt()) {
			System.out.println("YOU MUST ENTER AN INTEGER VALUE");
			scanner.nextLine();
			
			System.out.print("How many numbers do you want to Analyze: ");
		}
		
		lengthOfNumbers = scanner.nextInt();
		
		numbers = new int[lengthOfNumbers];
		scanner.nextLine();
		
		//int count = 1;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter the number " + (i+1) + " : ");
			
			if(!scanner.hasNextInt()) {
				System.out.println("YOU MUST ENTER INTEGER VALUES");
				scanner.nextLine();
				i--;
			} else {
			
			numbers[i] = scanner.nextInt();
			scanner.nextLine(); //to clear input buffer
			//count++;
			}
			
			
		}
		
		
		
		System.out.println("The even numbers in the array are " );
		EvenNumbers(numbers);
		System.out.println("\nThe odd numbers in the array are " );
		OddNumbers(numbers);
		reverse(numbers);
		max(numbers, lengthOfNumbers);
		min(numbers);
		
		if (numbers.length == 0) {
			System.out.println("The array is empty");
		} else {
			System.out.println("The SUM of the elements of the array is " + sum(numbers));
		}
		
		if (numbers.length == 0) {
			System.out.println("The array is empty");
		} else {
			System.out.println("The Average of the elements of the array is " + Average(numbers));
		}
		
		scanner.close();
	}
	
	static void max(int[] numbers, int lengthOfNumbers) {
		
		int max = numbers [0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		
		System.out.println("The maximum value is " + max);
		
	}
	
	static void min(int[] numbers) {
	
		int min = numbers [0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		
		System.out.println("The minimum value is " + min);
		
	}
	
	static double sum(int[] numbers) {
		
		int sum = 0;
		
		for (int number : numbers)  {
			
			sum += number;
		}
		
		return sum;
	}
	
	static double Average(int[] numbers) {
		
		int sum = 0;
		
		for (int number : numbers) {
			sum += number;
		}
		
		return sum / numbers.length;
	}
	
	static void EvenNumbers(int[] numbers) {
		int countEven = 0;
		for (int number : numbers) {
			if (number%2 == 0) {
				System.out.print( number + " ");
				countEven++;
			} 
		}
		System.out.println("\nThe count of even numbers in the array is " + countEven);
	}
	
	static void OddNumbers(int[] numbers) {
		int countODD = 0;
		for (int number : numbers) {
			if (number%2 != 0) {
				System.out.print( number + " ");
				countODD++;
			} 
		}
		System.out.println("\nThe count of ODD numbers in the array is " + countODD);
	}
	
	static void reverse(int[] numbers) {
		
		
		for (int i = 0; i < numbers.length/2; i++) {
			int rev = numbers[i];
			numbers[i] = numbers[numbers.length -1 - i];
			numbers[numbers.length - 1 -i ] = rev;
		}
		
		
		System.out.println("\nThe reversed array is " + Arrays.toString(numbers));
		
		
	}

}
