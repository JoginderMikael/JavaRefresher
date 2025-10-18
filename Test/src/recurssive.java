import java.math.BigInteger;

public class recurssive {
	
	//recursive method - Slower O(n) for both space and time complexity.
	//This is good for small numbers - integers
	static int sum(int number) {
		if(number > 0) {
			number += (sum(number-1));
			return number;
		}else {
		return 0;
		}
		//return number;
	}
	
	//non recursive method - Faster O(1) for both space and time complexity
	//Good for larnge numbers
	static long sum2(long number) {
		if(number > 0) {
			return (number*(number+1))/2;
			
		} else {
			return 0;
		}
		
	}
	
	//handling exceptionally large numbers
	static BigInteger sum3(BigInteger number) {
		
		if(number.compareTo(BigInteger.ZERO) > 0) {
			return number.multiply(number.add(BigInteger.ONE)).divide(BigInteger.TWO);
		}else {
			return BigInteger.ZERO;
		}
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		BigInteger number = new BigInteger("100000000000000000");
		System.out.println(sum3(number));
		//System.out.println(sum(10009L));
		long endTime = System.nanoTime();
		System.out.println("Execution time: " + (endTime - startTime) / 1_000_000.0 + " ms");

	}

}
