import java.util.Scanner;

public class CountDown {
// for loop
	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("How many seconds do you want the contdown from?: ");
		int start = scanner.nextInt();
		
		for (int i = start; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000); // sleep for 1000 milliseconds (1 second)
		}
		
		System.out.println("HAPPY NEW YEAR");

	}

}
