import java.util.Scanner;

public class SearchThroughArray {
// searching through the elements of an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner scanner = new Scanner(System.in);
		
		int[] numbers = {1, 9, 2, 8, 3, 5, 4};
		String[] fruits = {"apple", "orange", "Bana"};
		
		int targetInt = 9;
		String targetString = "apple";
		boolean isFound = false;
		
		/*
		System.out.print("Enter the element to search for");
		targetString = scanner.nextLine();
		*/
		// searching array of int
		for (int i = 0; i < numbers.length; i++) {
			if (targetInt == numbers[i]) {
				System.out.println("Element found at index: " + i);
				isFound = true;
				break;
			}
		}
		
		if(!isFound) {
			System.out.println("Element not found in the array");
		}
		
		// searching in array of string
		
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals(targetString)) {
				System.out.println("Element found at index: " + i);
				isFound = true;
				break;
			}
		}
		
		if(!isFound) {
			System.out.println("Element not found in the array");
		}
		
		//scanner.close();
	}

}
