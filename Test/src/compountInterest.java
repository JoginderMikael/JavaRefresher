import java.util.Scanner;

public class compountInterest {
// This is designed to demonstrate the use of Math tools and the printf() method
	// compound interest calculator
	public static void main(String[] args) {
		
		
		double principle;
		double Amount;
		int timesCompounded;
		int years;
		double rate;
		char currency = '$';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the principle amount: ");
		principle = scanner.nextDouble();
		System.out.print("Enter the interest rate (in %): ");
		rate = scanner.nextDouble()/100;
		System.out.print("Enter the times coumpounded per year: ");
		timesCompounded = scanner.nextInt();
		System.out.print("Enter the number of years: ");
		years = scanner.nextInt();
	
				
		scanner.close();
		
		Amount = principle * Math.pow(1 + rate/timesCompounded, timesCompounded * years);
		
		System.out.printf("The amount after %d years is %c%,.2f", years, currency, Amount);
	 
		
		
		
	}

}
