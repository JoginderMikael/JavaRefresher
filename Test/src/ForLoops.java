import java.util.Scanner;

public class ForLoops {
// The uses of for loops
	public static void main(String[] args) {
		// for loop == execute some code a CERTAIN amount of times
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter how many times you want to loop: ");
		
		int max = scanner.nextInt();
		/*
		for (int i = 1; i <= 10; i++) { //first element is a counter, ie i COUNTS FROM 0, the second is a condition to be met, ie execute until i is 10, and third is the step (update counter), ie, i++ means increment by 1 
			System.out.println(i);
		}
		*/
		
		for (int i = 1; i <= max; i++) {
			System.out.println(i);
		}
		
		scanner.close();

	}

}
