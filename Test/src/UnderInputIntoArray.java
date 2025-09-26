import java.util.Scanner;

public class UnderInputIntoArray {
// how to enter the user input into an array
	public static void main(String[] args) {
		
		//String[] foods = {"Pizza", "Taco", "Hamburger"};
		
		//String[] foods = new String[3]; // setting an empty array of 3 values
	
		String[] foods; // declare a string array to be instantiated later when setting the size
		
		/*
		 * 
		foods[0] = "Pizza";
		foods[1] = "Taco";
		foods[2] = "Hamburger";
		*/
		
		Scanner scanner = new Scanner(System.in);
		int size;
		
		System.out.print("What number of food items do you want?: ");
		size = scanner.nextInt();
		
		foods  = new String[size]; //Instantiating the size of the array
		scanner.nextLine();
		
		for (int i = 0; i < foods.length; i++) {
			System.out.print("Enter a food: ");
			foods[i] = scanner.nextLine();
		}
		
		System.out.print("The foods you have entered are ");
		
		for(String food : foods) {
			System.out.print(food + " ");
		}
		
		scanner.close();

	}

}
