package workingWorkingArrays;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// 	ROCK PAPER SCISSORS GAME
		
		// 	DECLARA VARIABLES
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		//	GET CHOICE FROM THE USER
		String[] choices = {"Rock","paper", "scissors"};
		String playerChoice;
		String computerChoice;
		String playAgain = "Yes";
		
		do {
			System.out.print("Enter your move (rock, paper, scissors): ");
			playerChoice = scanner.nextLine().toLowerCase();
			
			if(!playerChoice.equals("rock") && 
					!playerChoice.equals("paper") && 
					!playerChoice.equals("scissors")) {
				System.out.println("INVALID CHOICE");
				continue;
			}
			
			//	GET RANDOM CHOICE FOR THE COMPUTER
			computerChoice = choices[random.nextInt(3)];
			System.out.println("Computer choice: " + computerChoice);
			
			// 	CHECK WIN CONDITIONS
			if(playerChoice.equals(computerChoice)) {
				System.out.println("It is a tie");
			}else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) || 
					(playerChoice.equals("paper") && computerChoice.equals("rock")) ||
					(playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
				System.out.println("You win!");
			}else {
				System.out.println("You Lose");
			}
			
			// 	ASK TO PLAY AGAIN
			
			System.out.print("Play Again (yes/no): ");
			playAgain = scanner.nextLine().toLowerCase();
		
		}while(playAgain.equals("yes"));
		
		System.out.println("Thanks for playing");
		
		// 	GOODBYE MESSAGE
		
		scanner.close();
	}

}
