package stringBufferVsBuilder;

import java.util.Scanner;

public class StringBufferA {

	public static void main(String[] args) {
		/*
		 * StringBuffer is synchronized, which means it is thread-safe and can be used in 
		 * multi-threaded environments without additional synchronization.
		 * StringBuilder is not synchronized, making it faster in single-threaded scenarios
		 * but not thread-safe.
		 * 
		 */
		StringBuffer stringBuffer = new StringBuffer("Hello");
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("What is your Name:");
			String name = scanner.nextLine();
			
			if(name != null && !name.isEmpty()) {
			    stringBuffer.append(", ").append(name);
			} else {
			    stringBuffer.append(", Guest");
			}
		}
		
		System.out.println(stringBuffer.toString());
		//stringBuffer.reverse(); // Reverses the string
		//System.out.println(stringBuffer.toString());
		
		stringBuffer.delete(0, 7); // Deletes from index 0 to 6
		System.out.println(stringBuffer.toString());
		stringBuffer.replace(0, 5, "Welcome"); // Replaces from index 0 to 4
		System.out.println(stringBuffer.toString());
		
	}
	
	/*
	 * OTHER USEFUL METHODS IN STRING BUFFER
	 * - insert(int offset, String str): Inserts the specified string at the specified position.
	 * 
	 * - capacity(): Returns the current capacity of the StringBuffer.
	 * - ensureCapacity(int minimumCapacity): Ensures that the capacity is at least equal to the specified minimum.
	 * - setLength(int newLength): Sets the length of the character sequence.
	 * - charAt(int index): Returns the character at the specified index.
	 * - indexOf(String str): Returns the index within this string of the first occurrence of the specified substring.
	 * - lastIndexOf(String str): Returns the index within this string of the last occurrence of the specified substring.
	 * - substring(int start, int end): Returns a new string that is a substring of this sequence.
	 * - toString(): Converts the StringBuffer to a regular String.
	 * 
	 */
	
	

}
