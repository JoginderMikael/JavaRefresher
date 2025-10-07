package hashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// HashMap => a Data structure that stores key-value pairs
		// 			Keys are unique, but values can be duplicated. 
		//			Does not maintain any order, but is memory efficient. 
		//			HashMap<key, value>
		
		 HashMap<String, Double> map = new HashMap<>();
		 
		 map.put("Apple", 8.67); //putting in hashmap
		 map.put("Orange", 9.67);
		 map.put("Banana", 7.67);
		 map.put("Coconut", 8.60);
		 
		 
		 System.out.println(map);
		 
		 map.remove("Apple"); //removing item
		 
		 System.out.println(map);
		 
		 System.out.println(map.get("Coconut")); //Getting value by key
		 System.out.println(map.containsKey("Banana")); // checking if contains a value in some key

		 if(map.containsKey("Coconut")) {
			 System.out.println(map.get("Coconut"));
		 }else {
			 System.out.println("Key Not found");
		 }
		 
		 System.out.println(map.containsValue(8.60)); //contains value method
		 
		 System.out.println(map.size()); //size of a man
		 
		 //printing a man in better way
		 
		 for (String key : map.keySet()) {
			 System.out.println(key + " : $" + map.get(key));
		 }
	}

}
