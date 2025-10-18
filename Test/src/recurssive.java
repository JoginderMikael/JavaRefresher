
public class recurssive {
	
	//recursive method - Slower O(n) for both space and time complexity.
	static long sum(long number) {
		if(number > 0) {
			number += (sum(number-1));
			return number;
		}else {
		return 0;
		}
		//return number;
	}
	
	//non recursive method - Faster O(1) for both space and time complexity
	static long sum2(long number) {
		if(number > 0) {
			return (number*(number+1))/2;
			
		} else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println(sum2(1000000L));
		//System.out.println(sum(10009L));
		long endTime = System.nanoTime();
		System.out.println("Execution time: " + (endTime - startTime) / 1_000_000.0 + " ms");

	}

}
