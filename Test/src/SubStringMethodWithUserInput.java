import java.util.Scanner;

//The useful way of substring method
public class SubStringMethodWithUserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String email;
		String username;
		String domain;
		
		System.out.print("Enter your email: ");
		email = scanner.nextLine();
		//check if email is valid
		
		if(email.contains("@")) {
			
			username = email.substring(0, email.indexOf("@"));
			domain = email.substring(email.indexOf("@")+1);
			
			
			System.out.println("Your email is " + email);
			System.out.println("Your username is " + username);
			System.out.println("Your domain is " + domain);
		}
		else {
			System.out.println("Your email is invalid. It must contain @");
		}
		

		scanner.close();
		

	}

}
