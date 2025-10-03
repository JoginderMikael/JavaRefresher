package superClasses;

public class Student extends Person{
	
	double gpa;

	Student(String first, String last, double gpa) {
		super(first, last); // super means that we have to pass the first and last arguments to the parent first. 
		this.gpa = gpa;
		
	}
	
	void showGPA() {
		System.out.println(this.first + " " + this.last + " has " + this.gpa + " gpa");
	}

}
