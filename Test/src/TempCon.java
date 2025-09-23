import java.util.Scanner;

public class TempCon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp = 0;
        String unit = "";
        boolean validInput = false;

        // Get temperature input with validation
        while (!validInput) {
            System.out.print("Enter the temperature: ");
            try {
                temp = scanner.nextDouble();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid number for temperature.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        // Get unit input with validation
        validInput = false;
        while (!validInput) {
            System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
            unit = scanner.next().toUpperCase();
            if (unit.equals("C") || unit.equals("F")) {
                validInput = true;
            } else {
                System.out.println("Error: Please enter 'C' or 'F' for unit.");
            }
            scanner.nextLine(); // Clear input buffer
        }

        // Perform conversion
        double newTemp = (unit.equals("C")) ? (temp - 32) * 5.0/9 : (temp * 9.0/5) + 32;

        // Output result
        System.out.printf("The converted temperature is %.2f\u00B0%s%n", newTemp, unit);

        scanner.close();
    }
}