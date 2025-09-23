import java.util.Scanner;

public class EnhancedSwitch {

	public static void main(String[] args) {
		// Enhanced Switch = A replacement to many else if statements 
		
		//Helps reduce redundancies in code
		
		String day;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a day to check if weekday or weekend: ");
		
		day = scanner.nextLine();
		
		switch(day) {
		
		case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
		System.out.println("It is a weekday");
		
		case "Saturday", "Sunday" -> System.out.println("It is a weeked");
		default -> System.out.println(day + " is not a day.");
		}
		
		scanner.close();

	}

}
