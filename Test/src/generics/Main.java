package generics;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Generics => a concept where you can write a class, interface, or method that is compatible with different data types. 
		// <T> type parameter (placeholder that gets replaced with a real type)
		// <String> type argument (specifies the type)
		
		
		/*
		ArrayList<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		
		*/
		
		Box<String> box = new Box<>(); // the class can store all the data types. ie can change string to Integer, double, etc
		
		box.setItem("Banana");
		
		System.out.println(box.getItem());
		
		
		Product<String, Double> product = new Product<>("Apple", 0.50);
		Product<String, Integer> product1 = new Product<>("Tickets", 15);

		System.out.println(product.getItem() + " " + product.getPrice());
		System.out.println(product1.getItem() + " " + product1.getPrice());
	}

}
