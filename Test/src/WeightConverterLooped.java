import java.util.Scanner;

public class WeightConverterLooped {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;
        double weight = -1;
        double newWeight;

        // Loop until valid choice
        while (choice != 1 && choice != 2) {
            System.out.print("\nWeight Conversion Program\n");
            System.out.print("1: Convert lbs to kgs\n");
            System.out.print("2: Convert kgs to lbs\n");
            System.out.print("Choose an option: ");
            
            choice = scanner.hasNextInt() ? scanner.nextInt() : -1;
            if (choice == -1) {
                System.out.println("Invalid input. Please enter 1 or 2.");
                scanner.nextLine(); // clear invalid input
            }
        }

        if (choice == 1) {
            // Loop until valid weight input
            while (weight < 0) {
                System.out.print("Enter the weight in lbs: ");
                weight = scanner.hasNextDouble() ? scanner.nextDouble() : -1;
                if (weight < 0) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.nextLine(); // clear invalid input
                }
            }
            newWeight = weight * 0.453592;
            System.out.printf("Weight in kgs is : %.2f\n", newWeight);

        } else {
            // Loop until valid weight input
            while (weight < 0) {
                System.out.print("Enter the weight in kgs: ");
                weight = scanner.hasNextDouble() ? scanner.nextDouble() : -1;
                if (weight < 0) {
                    System.out.println("Invalid input. Please enter a numeric value.");
                    scanner.nextLine(); // clear invalid input
                }
            }
            newWeight = weight * 2.20462;
            System.out.printf("Weight in lbs is : %.2f\n", newWeight);
        }

        scanner.close();
    }
}
