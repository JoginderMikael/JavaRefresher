
public class StringMethods {
//To demonstrate very useful string methods in Java
	
	public static void main(String[] args) {
		String name = "   Joginder Mikael   ";
		int length = name.length(); //LENGTH method for checking the length of a string. 
		char letter = name.charAt(0); //the charAt method needs an index passed to it. here we passed zero
		int index = name.indexOf("g"); // checking the index of some letter in a string, you have to pass the letter
		int LastIndex = name.lastIndexOf("e"); // shows the last index of the number passed
		
		String nameUp = name.toUpperCase(); // Making all letters (string) upper case
		String nameLower = name.toLowerCase(); // Making all letters (string) Lower case
		String nameTrimed = name.trim(); //trimming all the white space before and after a string
		String nameChaReplaced = name.replace("e", "a"); //Replacing character in string
		
				
		System.out.println("The length of your name is " +length);
		System.out.println("The first letter of your name is " +letter);
		System.out.println("letter g in your name appears in number " +index);
		System.out.println("The last index of letter e in your name is " +LastIndex);
		System.out.println("Your name in uppercase is " +nameUp);
		System.out.println("Your name in lowercase is " +nameLower);
		System.out.println("Your name without the white spaces " +nameTrimed);
		System.out.println("Your name with replaced e with a " +nameChaReplaced);
		
		//BOOLEAN STRING METHODS
		if (name.isEmpty()) { // checking if a string is empty. returns boolean
			System.out.println("Your Name is Empty"); 
		}
		else {
			System.out.println("Your Name is " +name);
		}
		
		
		if(name.contains(" ")) { //checking if string has some specific characters
			System.out.println("Your name contains spaces"); 
		}
		else {
			System.out.println("Your name does not contain spaces"); 
		}
		
		if (name.equals("Password")) { //checking if string is equal to another one
			System.out.println("Your name cant be Password"); 
		}
		else {
			System.out.println("Your name is " +name); 
		}
		
	}

}
