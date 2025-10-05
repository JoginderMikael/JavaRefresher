package arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// ArrayList => is a reasizeable array that stores objects (autoboxing).
		// arrays are fixes in size, but arraylists can change.
		
		ArrayList<Integer> list = new ArrayList<>(); //storing integers
		
		list.add(3); //adding elements to the array
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		
		
		ArrayList<Double> list2 = new ArrayList<>(); //storing Double
		
		list2.add(3.2);
		list2.add(1.4);
		list2.add(2.7);
		
		System.out.println(list2);
		
		
		ArrayList<String> fruits = new ArrayList<>(); //storing strings
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Pineapple");
		
		
		fruits.remove(0); //removing elements
		fruits.set(0, "Passion"); // set method to replace item in the array
		
		System.out.println(fruits);
		System.out.println(fruits.get(2)); //using get method to get an element in some index
		System.out.println(fruits.size()); //get the size of the arraylist
		
		Collections.sort(fruits); // sorting the arraylist
		System.out.println(fruits);
		
		//iterate the elements of the arraylist
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		

	}

}
