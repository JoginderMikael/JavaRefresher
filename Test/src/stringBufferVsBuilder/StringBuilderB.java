package stringBufferVsBuilder;

import java.util.Scanner;

public class StringBuilderB {

	public static void main(String[] args) {
		/*
		 * StringBuffer is synchronized, which means it is thread-safe and can be used
		 * in multi-threaded environments without additional synchronization.
		 * StringBuilder is not synchronized, making it faster in single-threaded
		 * scenarios but not thread-safe.
		 * 
		 */
		StringBuilder stringBuilder = new StringBuilder("Hello");
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter your name: ");
			String name = scanner.nextLine();
			
			if(name != null && !name.isEmpty()) {
				stringBuilder.append(" " + name);
			}else {
				stringBuilder.append(", Guest");
			}
		}
		stringBuilder.toString();
		System.out.println(stringBuilder);
		
		/*
		 * The other string builder methods are the same as those of the string buffer
		 */

	}

}
