
public class varargs {
// demonstrates the use of varargs in java
	public static void main(String[] args) {
		// varargs -> variable arguments
		// Varargs = allows a method to accept a varying number of arguments. Arguments are parked into array
		// makes a method more flexible, no need for overloaded methods. 
		// java packs the arguments into array.
		//...(ellipsis)
		
		System.out.println(add(1, 2, 4, 5,5,6,7,4,3,2,3,4,5));
		System.out.println(average(1, 2, 4, 5,5,6,7,4,3,2,3,4,5));

	}
	
	static int add(int... numbers) {
		
		int sum = 0;
		
		for (int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
	
	static double average(double... numbers) {
		double sum = 0;
		
		if (numbers.length == 0) {
			return 0;
		}
		
		for (double number : numbers ) {
			sum +=number;
		}
		return sum / numbers.length;
	}

}
