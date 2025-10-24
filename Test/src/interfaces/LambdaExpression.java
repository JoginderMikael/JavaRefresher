package interfaces;

/*
 * Introduced in java 8.
 * It is used with functional interfaces. 
 * A functional interface is an interface with only one abstract method. 
 * Intead of creating an implementation class this is used to implement the inner class 
 */

@FunctionalInterface
interface A{
	
	void show();
	}


/*
class B implements A{

	@Override
	public void show() {
		System.out.println("Hi Lambda!");
		
	}
	
}
*/

public class LambdaExpression {

	public static void main(String[] args) {
		
		/* Anonymous Inner class - used this method up to java 7
		A obj = new A() {
			public void show() {
				System.out.println("Hi Lambda!");
				
			}
		};
		
		obj.show();
		*/
		
		/*
		 * Developed a lambda expression by java 8 and is implemented as below. 
		 */
		
		A obj = () -> System.out.println("Hi Lambda!");
		obj.show();

	}

}
