import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double num1;
		double num2;
		char operator;
		double result = 0;
		boolean validOperator = true;
		
		System.out.print("Enter the first number: ");
		num1 = scanner.nextDouble();
		
		System.out.print("Enter an operator (+, -, *, /, ^): ");
		operator =scanner.next().charAt(0);
		
		System.out.print("Enter the second number: ");
		num2 = scanner.nextDouble();
		
		switch(operator) {
			case '+' -> {
				result = num1 + num2;
			//	System.out.printf("The result of addition is %.2f", result);
			}
			case '-' -> {
				result = num1 / num2;
			//	System.out.printf("The result of division is %.2f", result);
			}
			case '*' -> {
				result = num1 * num2;
			//	System.out.printf("The result of multiplication is %.2f", result);
			}
			case '/' -> {
				if (num2 == 0) {
					System.out.println("You cannot devide by 0");
					validOperator = false;
				}else {
					result = num1 / num2;
				//	System.out.printf("The result of division is %.2f", result);
				}
			}
			case '^' -> {
				result = Math.pow(num1, num2);
				//System.out.printf("The result of power operation is %.2f", result);
			}
			default -> {
				System.out.println("Invalid Operator");
				validOperator = false;
			}
		
		}
		
		//added this to demonstrate the use of boolean
		
		if(validOperator) {
			System.out.printf("\nThe result is : %.2f", result);
		}
		
		scanner.close();
		
		
	}

}
