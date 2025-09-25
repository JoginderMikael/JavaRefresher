
public class VariableScope {
// local vs class scope
	
	static int x = 3; //CLASS SCOPE -- can be accessed by all nmethods

	public static void main(String[] args) {
		// variable declared in a method has a local scope and is only recognized in the method
	int x = 1; //LOCAL SCOPE - can only be accessed in this method
		
		System.out.println(x);
		doSomething();

	}
	
	static void doSomething() {
		int x = 2; //LOCAL SCOPE - can only be accessed in this method
	
		System.out.println(x);
	}

}
