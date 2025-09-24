
public class LogicalOperators {
// This class is designed to demonstrate the use of logical operators
	public static void main(String[] args) {
		// && = AND
		// || = OR
		// ! = NOT
		
		double temp = -20;
		boolean isSunny = false;
		
		if (temp <= 30 && temp >= 0 && isSunny) { // All conditions MUST be true
			System.out.println("The weahter is good.");
			System.out.println("It is sunny outside.");
		}else if (temp <= 30 && temp >= 0 && !isSunny) {
			
			System.out.println("The weahter is good.");
			System.out.println("It is cloudy outside.");
		}else if(temp > 30 || temp < 0) { //At least one condition must be true
			System.out.println("The weather is very bad.");
			
		}

	}

}
