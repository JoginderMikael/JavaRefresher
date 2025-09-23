
public class NestedIfs {
// class to demonstrate nested if statements in java
	// You can always check another condition after checking a condition already.
	public static void main(String[] args) {
		
		boolean isStudent = true;
		boolean isSenior = false;
		double price = 9.99;
		
		if(isStudent) {
			if(isSenior) {
				System.out.println("You get a sernior discount of 20%");
				System.out.println("You get a student discount of 10%");
				price *=0.7;
			}
			else {
				System.out.println("You get a student discount of 10%.");
				price *=0.9;
			}
			
		}
		else {
			
			if(isSenior) {
				System.out.println("You get a sernior discount of 20%");
				price *=0.8;
			}
			else {
				price *=1;
			}
		}
		
		System.out.printf("The price of the ticket is : $%.2f", price);
	}

}
