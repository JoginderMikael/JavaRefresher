package constructors;

public class Student {
	
	String name;
	int age;
	double gpa;
	boolean isEnrolled;
	
	// constructor, a special method within a class to help initialize objects. 
	
	// the student constructor
	Student(String name, int age, double gpa){
		this.name = name; // this -> the object we are currently working on. 
		this.age = age; //eg, when passing student1.name, this.name is replaced with student1.name
		this.gpa = gpa;
		this.isEnrolled = true;
	}
	
	// method for the class
	// using the assigned values in the constructor within a method
	void study() {
		System.out.println(this.name + " is studying.");
	}
	

}
