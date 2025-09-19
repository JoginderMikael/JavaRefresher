
public class mathClass {
	// using the built in math class in java
	public static void main(String[] args) {
		
		double pi = Math.PI; // Can be used to initialize variables
		
		System.out.println("The value of PI is " + Math.PI); /// To get the value of PI
		System.out.println("The Eulers number is " + Math.E); //eulers number
		
		
		double result;
		
		result = Math.pow(2,3); // 2 to the power of 3, You raise a base to the power
		double absolute = Math.abs(-5); //absolute value
		double squareRoot = Math.sqrt(20); //Getting a square root of a number
		double rounding = Math.round(4.15);//rounding a number to the nearest whole integer
		double roundingUP = Math.ceil(4.15); //Rounding a number up to the ceiling
		double roundingDOWN = Math.floor(4.56); ///rounding down
		double maxValue = Math.max(10,20); //get the max value
		double minValue = Math.min(10,20); //get the min value
		
		
		System.out.println("Power is " + result);
		System.out.println("The absolute value " + absolute);
		System.out.println("Square root of the number is " + squareRoot);
		System.out.println("The rounded off value of the given number is " + rounding);
		System.out.println("The rounded UP value of the given number is " + roundingUP);
		System.out.println("The rounded DOWN value of the given number is " + roundingDOWN);
		System.out.println("The max value is " + maxValue);
		System.out.println("The min value is " + minValue);
		

	}

}
