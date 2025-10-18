package collectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		// Collection API - Collections Framework (concept).. Useful in data structures.
		//Collection -> Interface. (List, Set, Queue, Deque, Map)
		//Collections -> Class. This has multiple methods to work with. 
		
		//# ArrayList is the class implementing the collection interface as demonstrated below. 
		
		Collection<Integer> nums = new ArrayList<>();
		nums.add(5);
		nums.add(6);
		nums.add(9);
		nums.add(2);
		
		System.out.println(nums);
		
		//Using List instead to work with index values
		
		//List is an interface that extends collections sequence. It has extra method as compared to collections. 
		List<Integer> nums1 = new ArrayList<>(); 
		nums1.add(5);
		nums1.add(6);
		nums1.add(9);
		nums1.add(2);
		
		System.out.println("The value in index 2 is " + nums1.get(2));

	}

}
