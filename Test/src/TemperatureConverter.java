import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		
		double temp;
		double newTemp;
		String unit;
		
		
		System.out.print("Enter the temperature: ");
		
		if (scanner.hasNextDouble()) { //check user entered numeric value
			temp = scanner.nextDouble();
				System.out.print("Convert to Celsius or Fahrenheit? (C or F): " );
				if (scanner.hasNext()) { //check if user entered a string value
					unit = scanner.next().toUpperCase();
					
					if (unit.equalsIgnoreCase("C")|| unit.equalsIgnoreCase("F")) { //check if the string value is F or C
						
						// (condition) ? true :  false
						newTemp = (unit.equals("C")) ? (temp - 32 ) * 5/9 : (temp*5/9) + 32;
						System.out.printf("The the converted temperature is %.2f\u00B0%s", newTemp, unit);
					} else {
						System.out.println("Must enter C or F");
					}
				} else {
					System.out.println("Must enter the Unit");
				}
		} else {
			System.out.println("Temperature must be numeric");
		}

		scanner.close();

	}

}
