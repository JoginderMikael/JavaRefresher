
public class printF {
//A demonstration of printf method
	public static void main(String[] args) {
		// printf() = is a method used to format output
		//%[flags] [width][.precision][specifier-character]
		
		
		
		String name = "Spongebob";
		char firstLetter = 'S';
		int age = 30;
		double height = 60.5;
		boolean isEmployed = true;
		
		// + to output a plus
		//, for grouping separator
		// c for negative numbers encloses in ()
		// space to display minus if negative, space if positive
		double price1 = 90000.90;
		double price2 = -100.15;
		double price3 = 56.76;
		
		
		// 0 = Zero padding
		//number = right justified padding
		//negative number = left justified padding
		
		int id1 = 1;
		int id2 = 24;
		int id3 = 456;
		int id4 = 7890;
		
		
		
		System.out.println("=========FLAGS==============");
		System.out.printf("Hello %s\n", name); //s means a string variable. \n means new line
		System.out.printf("Your name starts with a %c\n", firstLetter); // c means a char variable
		System.out.printf("You are %d years old\n", age); //d for integer variable
		System.out.printf("You are %f cm tall\n", height); // f for floating point, or double
		System.out.printf("Empployed: %b\n", isEmployed); //b for boolean variable
		System.out.printf("%s is %d years old\n", name, age); //inserting more than one variable
		
		System.out.println("=========FLAGS END===========\n");
		
		System.out.println("=========PRECISION===============");
		System.out.printf("The first real number is %.1f\n", price1); //.1f to display one digit
		System.out.printf("The second real number is %.2f\n", price2); //.2f to display 2 digits
		System.out.printf("The third real number is %.3f\n", price3); //.3f for three digits
		System.out.println("=========PRECISION END===========\n");
		
		
		System.out.println("=========DIDPLAYING===============");
		System.out.printf("The first real number is %,.1f\n", price1); //.1f to display one round off digit, with a , to add comma to a thousand
		System.out.printf("The second real number is %(.2f\n", price2); //.2f to display 2 digits. ( to enclose negative numbers in parenthesis
		System.out.printf("The third real number is %+.3f\n", price3); //.3f for three digits with + to output a plus
		System.out.printf("The third real number is % .3f\n", price3); //space
		System.out.println("=========DISPLAYING END===========\n");
		
		System.out.println("=========ALIGNING===============");
		System.out.printf("%04d\n", id1); //04 padding.
		System.out.printf("%4d\n", id2);  //right justified
		System.out.printf("%-4d\n", id3); //left justified
		System.out.printf("%04d\n", id4); //padding
		System.out.println("=========ALIGNING END===========");
		
		
		
		
		

	}

}
