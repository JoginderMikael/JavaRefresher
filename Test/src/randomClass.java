import java.util.Random; // important random class


public class randomClass {
	// To demonstrate the use of random class and how to work with random numbers in java. 
	
	public static void main(String[] args) {
		
		Random random = new Random(); //create the random object
		
	
	
		int number1;
		double number;
		boolean isHeads;
		
		
		number1 = random.nextInt(1, 101); // GENERATING INTEGER. specify the the range of the random number. The second number is exclusive. eg, to generate a number between 1 and 10, make the second number 11. (1,11)
		System.out.println("The random integer is " + number1 + ".");
		
		number = random.nextDouble(); //GENERATING A DOUBLE
		System.out.println("The random double is " + number + ".");
		
		isHeads = random.nextBoolean(); //GENERATING A BOOLEAN
		
		if (isHeads) {
			
		System.out.println("The random boolean shows HEADS, meaning " + isHeads);
		
		}
		else {
		System.out.println("The random boolean shows TAILS, meaning " + isHeads);
		}
		
	
		
	}

}
