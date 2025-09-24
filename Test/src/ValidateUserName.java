import java.util.Scanner;

public class ValidateUserName {
// demonstrates the use of logical operators
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// conditions for a user name
		
		// Username must be between 4 - 12 characters
		// Username must not contain spaces or underscores
		
		String username;
		
		System.out.print("Enter your new username: ");
		username = scanner.nextLine();
		
		if(username.length() < 4 || username.length() > 12) {
			System.out.println("Username must be between 4 to 12 characters long.");
		}else if (username.contains(" ") || username.contains("_")) {
			System.out.println("Username must NOT contain spaces or underscores.");
		}
		
		else {
			System.out.println("Welcome to the club " + username);
		}
		
		scanner.close();
	}

}
