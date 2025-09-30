package overloadedConstructors;

public class User {
	String username;
	String email;
	int age;
	
	// a constructor with no arguments
	User(){
		this.username = "Guest";
		this.email = "Not Provided";
		this.age = 0;
	}
	
	User(String username){
		this.username = username;
		this.email = "Not provided";
		this.age = 0;
	}
	
	// overloading means we give different parameters
	User(String username, String email){
		this.username = username;
		this.email = email;
		this.age = 0;
	}
	
	User(String username, String email, int age){
		this.username = username;
		this.email = email;
		this.age = age;
	}
}
