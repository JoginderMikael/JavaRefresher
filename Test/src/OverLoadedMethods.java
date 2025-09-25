
public class OverLoadedMethods {

	public static void main(String[] args) {
		// overloaded method are methods that share the same name, but different parameters. 
		// signature = name + parameters;
		
		System.out.println(add(2,4));
		System.out.println(add(2,4,5));
		
		String Pizza = bakePizza ("Flat Bread");
		System.out.println("We have baked " + Pizza);
		String Pizza1 = bakePizza ("Flat Bread", "mozzarella");
		System.out.println("We have baked " + Pizza1);
		String Pizza2 = bakePizza ("Flat Bread", "mozzarella", "pepperoni");
		System.out.println("We have baked " + Pizza2);
		

	}
	
	//example
	
	static double add (double a, double b) {
		return a + b;
	}
	static double add (double a, double b, double c) {
		return a + b + c;
	}
	
	static String bakePizza (String bread) {
		return bread + " Pizza";
	}
	static String bakePizza (String bread, String cheese) {
		return cheese + " " + bread + " Pizza";
	}
	
	static String bakePizza (String bread, String cheese, String topping) {
		return topping + " " + cheese + " " + bread + " Pizza";
	}


}
