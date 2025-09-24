
public class NestedLoops {
// nested loops in java
	public static void main(String[] args) {
		// nested loop is a loop inside another loop
		// often used in matrices and in data structure and algorithms
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 10; j++) {
				
				System.out.print(j + " ");
				
			}
			
			System.out.println();
		}
		
		
		/* instead of repeating the code this way
		System.out.println();
		for (int i =1; i <= 10; i++) {
			
			System.out.print(i + " ");
			
		}
		System.out.println();
		for (int i =1; i <= 10; i++) {
			
			System.out.print(i + " ");
			
		}
		*/

	}

}
