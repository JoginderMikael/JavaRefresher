import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
        
		int num1, num2, num3;
		
		try (Scanner x = new Scanner(System.in)) {
			System.out.println("Enter Number 1");
			num1 = x.nextInt();
			
			
			System.out.println("Enter Number 2");
			num2 = x.nextInt();
			
			
			System.out.println("Enter Number 3");
			num3 = x.nextInt();
			
			x.close(); //closing the scanner object. 
		}
		
		
		
        // Calculate the sum
		
        int sum = num1 + num2 + num3;

        // Print the result
        System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum);
        
   
	}

}
