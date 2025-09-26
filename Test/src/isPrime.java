import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number to check whether it is prime: ");
		
		while(!scanner.hasNextInt()) {
			System.out.println("Invalid input. You must enter an integer value.");
			scanner.next();
			System.out.print("Please enter the number to check whether it is prime: ");
		}
		
		number = scanner.nextInt();
		
		if(isPrime(number)) {
			System.out.printf("The number %d is Prime", number);
		} else {
			System.out.printf("The number %d is not Prime", number);
		}
		//System.out.println(isPrime(number));
		scanner.close();
	}
	
	static boolean isPrime(int number){
		if( number <= 1 ) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt (number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
