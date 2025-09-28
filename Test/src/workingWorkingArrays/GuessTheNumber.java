package workingWorkingArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	// guessing a number
	
	static Scanner scanner = new Scanner(System.in);
	
	static void guessMeter(int random) {
		
		int guesses = 5;
		int[] numbersGuessed = new int[guesses];
		
		System.out.println("Guess Numbers between 1 and 10. You have 5 guesses.\n");
		for (int i = 0; i < guesses; i++) {
			System.out.print("Enter gues for guess number " + (i+1) + ": ");
			
			if(!scanner.hasNextInt()) {
				System.out.println("YOU MUST ENTER AN INTEGER VALUE");
				scanner.nextLine();
				i--;
			} else {
				
				int gInput = scanner.nextInt();
				scanner.nextLine();
				
				if(gInput < 0 || gInput > 10) {
					System.out.println("VALUE MUST BE BETWEEN 0 AND 10.");
	                i--; 
				} else {
					numbersGuessed[i] = gInput;
				}
				
				
			}
		}
		
		System.out.println("\nYou guessed: " + Arrays.toString(numbersGuessed));
		
		/*
		System.out.print("\nAll the values you guessed are: ");
		for (int guessed : numbersGuessed) {
			System.out.print(guessed + " ");
		}
		*/
		
		
		boolean found = false;
		
		for (int guess : numbersGuessed) {
			if (guess == random) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println("\nYou guessed correctly! The number was " + random);
        } else {
            System.out.println("\nSorry, none of your guesses were correct. The number was " + random);
        }
		}

	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int number = random.nextInt(1)+1;
		
		
		
		System.out.println("WELCOME TO THE number GUESS METER.");
		guessMeter(number);
		
		scanner.close();
	}

}
