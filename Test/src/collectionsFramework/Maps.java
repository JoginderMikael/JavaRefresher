package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		//DATA STRUCTURE, A collection of KEY and VALUE PAIR.
		// Map is not implementation/doesn't extend the collection interface. 
		//But it's part of collection API. 
		//Gives an opportunity not to have index values but rather a name. (KEY, VALUE PAIR)
		//Map itself is an interface and is implemented by HashMap class.
		//can still be used with HashTable class, HashTable is more synchronized and works the same way, and Is best with multiple threads.
		Map<String, Integer> students = new HashMap<>();
		
		//keys are sets and values are lists. 
		students.put("Joginder", 30);
		students.put("Mikael", 28);
		students.put("Raila", 80);
		students.put("Uhuru", 70);
		students.put("Joy", 20);
		
		//keys cannot be repeated. EG, adding Joy for 30 will only print one Joy
		students.put("Joy", 30);
		
		System.out.println(students);
		System.out.println(students.keySet()); //print all keys
		System.out.println(students.values()); //print all the values
		
		System.out.println();
		//use for-lopp for get all the values one by one
		for(String key : students.keySet()) {
			System.out.println(key + " : " + students.get(key));
		}
	}

}
