
public class multiPlier {

	// To demonstrate the power of exponential growth by doubling a penny every day for a month.
	public static void main(String[] args) {
		double cents = 0.01;
		int days = 31;
		
		for (int i = 1; i <= days; i++) {
			cents *= 2;
			System.out.printf("Total after %d days: $%.2f%n", i, cents);
		}

	}

}
