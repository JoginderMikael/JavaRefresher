
import java.util.Scanner;

public class userInputTestCalArea {
	
	public static void main(String[] args) {
		
	
		// This is designed to calculate the area of rectangle by accepting the user input
		
		double width = 0;
		double height = 0;
		double area = 0;
		
		Scanner scanner = new Scanner (System.in); //creating a scanner object
		
		System.out.print("Enter width: ");
		width = scanner.nextDouble();
		
		System.out.print("Enter height: ");
		height = scanner.nextDouble();
		
		area = width*height;
		
		System.out.println("The area is: "+ area + "CM\u00B2"); //SUPERSCRIPT OF 2
		
		scanner.close(); //closing scanner object to avoid errors
	}

}
