package dataStructuresAndAlgorithms;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		/*
		 * A Hashtable -> A data structure that stores unique keys to values. ex. <Integer, String>
		 * Each key/value pair is known as an Entry
		 * FAST insertion, look up, deletion of key/value pairs. 
		 * Not idea for small data sets, great with larger data sets. 
		 * 
		 * Hashing-> takes a key and computes an integer (formula will vary based on key and data type)
		 * 
		 * In a Hashtable, we use the hash % capacity to calculate an index number
		 * 
		 * key.hasCode()% capacity = index
		 * 
		 * Bucket -> an indexed storage location for one or more entries. 
		 * can store multiple entries in case of a collision (Linked similarly as linkedlist)
		 * 
		 * Collision -> Hash function generates the same index for more than one key
		 * less collisions leads to more efficiency
		 * 
		 * Runtime complexity: Best case O(1)
		 * 						Worst case O(n)
		 */
		Hashtable<Integer, String> table = new Hashtable<>(10);
		
		table.put(100, "Spongebob");
		table.put(123, "MK");
		table.put(150, "Joginder");
		table.put(189, "KS");
		table.put(234, "Tilu");
		table.put(342, "Tosi");
		table.put(231, "Kivisi");
		
		for(Integer key : table.keySet())
		System.out.println( key.hashCode()%10 + "\t" + key + "\t"+ table.get(key));
	}
}
