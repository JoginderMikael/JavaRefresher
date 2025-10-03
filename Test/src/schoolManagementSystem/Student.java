package schoolManagementSystem;

public class Student extends Person{
	
	String gradeLevel;
	double[] marks;
	
	Student(String name, int age, String gradeLevel, double[] marks) {
		super(name, age);
		this.gradeLevel = gradeLevel;
		this.marks = marks;
		
	}
	Student(String name, int age, int id, String gradeLevel, double[] marks) {
		super(name, age, id);
		this.gradeLevel = gradeLevel;
		this.marks = marks;
		
	}
	
	public String studentStatus(double [] marks) {
		
		int count = 0;
		double total_marks = 0;
		for (double mark :  marks) {
			total_marks += mark;
			count++;
		}
		
		
		if (total_marks/count >= 50) {
			return "PASS";
		} else {
			return "FAIL";
		}
	
	}
	
	
	
	@Override
	public String toString() {
		return "The grade level of " + this.name + " A " + this.gradeLevel + " student " + "is " + this.studentStatus(this.marks);
	}

}
