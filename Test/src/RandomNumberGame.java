import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

	public static void main(String[] args) {
		// This is designed to demonstrate the use of random number generator and implementation of do while loop
		
		Random random = new Random(); //random object
		Scanner scanner = new Scanner(System.in);
		
		
		int guess;
		int attempts = 0;
		int min = 1;
		int max = 100;
		int randomNumber = random.nextInt(min, max+1); //pass range to the method first number is inclusive and second is exclusive
		
		System.out.println("Number Guessing Game");
		System.out.printf("Guess a number between %d-%d", min, max);
		
		do {
			System.out.print("Enter a guess: ");
			guess = scanner.nextInt();
			attempts++;
			
			if(guess < randomNumber) {
				System.out.println("Too LOW, try higher");
			}else if(guess > randomNumber) {
				System.out.println("Too HIGH, Try again");
			}else {
				System.out.println("CORRECT. The number was " + randomNumber);
				System.out.println("Number of Attempts: " + attempts);
			}
			
		}while(guess != randomNumber);
		
		//System.out.println("You have won");
		
		scanner.close();
	}

}
