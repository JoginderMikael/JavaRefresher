package wrapperClasses;

public class Main {

	public static void main(String[] args) {
		// Wrapper classes => Allow primitive values (int, char, double, boolean)
		// to be used as objects. "Wrap them in an object"
		//Generally, don't wrap primitives unless you need an object. 
		// allows use of collections framework and static utility methods. 
		
		
		//AUTOBOXING
		Integer a = 123;
		Double b = 3.14;
		Character c = '$';
		Boolean d = true;
	//	String e = "Pizza";
		
		//UNBOXING
		int x = a;
		double y = b;
		char xy = c;
		boolean z = d;
		
		//use cases. Converting primitive data types to string
		String aa = Integer.toString(a);
		String bb = Double.toString(b);
		String cc = Character.toString(c);
		String dd = Boolean.toString(d);
		
		String ee = aa + bb + cc + dd;
		
		System.out.println(ee);
		
		// converting string to primitives
		
		int aaa = Integer.parseInt("123");
		double bbb = Double.parseDouble("3.45");
		char ccc = "Pizza".charAt(0);
		boolean ddd = Boolean.parseBoolean("true");
		
		//Utility methods within wrapper methods. -This can be great for verifying user input.
		char letter = 'b';
		System.out.println(Character.isLetter(letter));
		System.out.println(Character.isUpperCase(letter));
		
		
		
		
		
		

	}

}
