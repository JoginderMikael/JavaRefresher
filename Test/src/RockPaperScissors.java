import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
    	Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userScore = 0, computerScore = 0;
        String playAgain;

        do {
            // Generate computer's random choice
            int computerChoice = random.nextInt(3) + 1; // 1=rock, 2=paper, 3=scissors
            
            // Get user input
            System.out.print("Enter 1 for rock, 2 for paper, 3 for scissors: ");
            int userChoice = scanner.nextInt();
            
            // Determine winner and update scores
            if (userChoice == computerChoice) {
                System.out.println("Tie!");
            } else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win this round!");
                userScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }
            
            // Display scores
            System.out.println("Scores: You " + userScore + " - Computer " + computerScore);
            
            // Ask to play again
            System.out.print("Play again? (y/n): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("y") && userScore < 3 && computerScore < 3); // Continue until quit or best of 3
        
        System.out.println("Game over!");
        
        scanner.close();
    }
}