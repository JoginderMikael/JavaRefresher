import java.util.Scanner;

public class WeightConverter {

	public static void main(String[] args) {
		// Weight converter program, implementation of if statement.
		
		Scanner scanner = new Scanner(System.in);
		
		double weight;
		double newWeight;
		int choice;
		
		
		System.out.print("Weight Conversion Program\n");
		System.out.print("1: Convert lbs to kgs\n");
		System.out.print("2: Convert kgs to lbs\n");
		
		System.out.print("Choose an option: ");
		
		if (scanner.hasNextInt()) {
			choice = scanner.nextInt();  //checking if an integer has been entered
	
				if (choice==1) {
					
					System.out.print("Enter the weight in lbs: " );
					
					if (scanner.hasNextDouble()) { // checking whether a double/numeric value has been entered 
						weight = scanner.nextDouble();
						newWeight = weight * 0.453592;
						System.out.printf("Weight in kgs is : %.2f", newWeight);
					
				} else {
						System.out.println("Invalid input. Please enter a numeric value.");
					}
				
				}
				
				else if (choice==2) {
					
					System.out.print("Enter the weight in kgs: " );
					if (scanner.hasNextDouble()) { //checking for a numeric value
						weight = scanner.nextDouble();
						newWeight = weight * 2.20462;
						System.out.printf("Weight in lbs is : %.2f", newWeight);
					
				} else {
					 	System.out.println("Invalid input. Please enter a numeric value.");
				}
				} else {
					System.out.println("Invalid choice");
				}
		} else {
			   System.out.println("Invalid input. Please enter 1 or 2.");
		}
		
		scanner.close();
	}

}
