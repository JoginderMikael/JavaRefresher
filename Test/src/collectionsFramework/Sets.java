package collectionsFramework;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
	
	public static void main(String[] args) {
		//Set is a collection with unique values. 
		// set extends collection
		// It is implemented by HashSet class
		
		Set <Integer> nums = new HashSet<>();
		
		nums.add(56);
		nums.add(66);
		nums.add(93);
		nums.add(23);
		nums.add(22); 
		
		System.out.println(nums); //Will not print repeated values. 
		
		// to get sorted values we will use TreeSet instead of HashSet
		//TreeSet extends AbstractSet, which extends SortedSet
		Set <Integer> nums1 = new TreeSet<>();
		
		nums1.add(56);
		nums1.add(46);
		nums1.add(93);
		nums1.add(23);
		nums1.add(22); 
		
		System.out.println("The shorted values " + nums1); //Will not print sorted values
		
		//Using collection and Treeset
		
		Collection <Integer> nums2 = new TreeSet<>();
		
		nums2.add(56);
		nums2.add(46);
		nums2.add(93);
		nums2.add(23);
		nums2.add(22); 
		
		//Instead of using a for-loop to iterate use iterator to guarantee the order of elements
		Iterator<Integer> values = nums2.iterator();
		while(values.hasNext()) {
			System.out.print(values.next() + " ");
		}
		
	}

}
