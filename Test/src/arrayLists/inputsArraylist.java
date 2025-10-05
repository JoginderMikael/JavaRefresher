package arrayLists;

import java.util.Scanner;
import java.util.ArrayList;

public class inputsArraylist {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> foods = new ArrayList<>();
		
		System.out.print("Enter the number of food you would like: ");
		int numOfFood = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = 1; i <= numOfFood; i++) {
			System.out.print("Enter food number " + i + ": ");
			String food = scanner.nextLine();
			foods.add(food);
		}

		System.out.println(foods);
		scanner.close();
	}

}
