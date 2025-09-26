import java.util.Arrays;


public class ArraysLearnt {

	public static void main(String[] args) {
		// INTRODUCTION TO ARRAYS

		//Array  is a collection of values of the same data type. 
		// think of a variable that can store more than 1 value 
		// arrays are reference data types
		// each value in an array is called an element
		// To access an element we have to indicate an index number, starts from 0
		
		String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};
		
		fruits [0] = "Mango"; // changing the value of an index in array
		int numOfFruits = fruits.length; // length of an array
		
		
		
		
		System.out.println("The first element of the fruits array is " + fruits[0]); // accessing one of the elements
		System.out.println("The length of the array is " + numOfFruits + " \n");  // print length of the array
		
		Arrays.sort(fruits); // sorting arrays
		
		// print all the elements of the array
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.print(fruits[i] + " ");
			
		}
		
		System.out.println();
		
		
		Arrays.sort(fruits); // sorting arrays
		Arrays.fill(fruits, "Pineapple");  /// filling the array with the new value
		// using enhanced for loop
		for (String fruit : fruits) {
			System.out.print(fruit + " ");
		}
		
		
		

		
	}

}
