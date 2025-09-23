
public class SubStringMethod {
// To demonstrate the use of substring method in java
	public static void main(String[] args) {
		// .substring() = A method used to extract a portion of a string 
		// 					.substring(start, end)
		
		String email = "jogindermikael@gmail.com";
		
		String username = email.substring(0, 14);
		String domain = email.substring(15, 24);
		System.out.println("Your usename is " +username);
		System.out.println("Your email domain is " +domain);
		
		//Making it more flexible in case a person enters different mail
		
		String email1 = "jogindermikael123@gmail.com";
		String userName1 = email1.substring(0,email1.indexOf("@"));
		System.out.println("Your usename is " +userName1);
		String domain1 = email1.substring(email1.indexOf("@")+1);
		System.out.println("Your email domain is " +domain1);
		

	}

}
