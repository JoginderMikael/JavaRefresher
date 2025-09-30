package constructors;

public class main {

	public static void main(String[] args) {
		// Constructor = A special method to initialize objects. 
		// You can pass arguments to a constructor
		// and set up initial values
		
		Student student1 = new Student("Joginder Mikael", 30, 3.4); // Constructing an object - passing values to the constructor
		Student student2 = new Student("Patrick", 30, 1.4);
		Student student3 = new Student("Sandy", 27, 4.0);
		
		// same constructor, different attributes passed to the object
		System.out.println(student1.name);
		System.out.println(student1.age);
		System.out.println(student1.gpa);
		System.out.println(student1.isEnrolled);
		
		System.out.println(student2.name);
		System.out.println(student2.age);
		System.out.println(student2.gpa);
		System.out.println(student2.isEnrolled);
		
		System.out.println(student3.name);
		System.out.println(student3.age);
		System.out.println(student3.gpa);
		System.out.println(student3.isEnrolled);
		
		//calling the method 
		student1.study();
		student2.study();
		student3.study();
		

	}

}
