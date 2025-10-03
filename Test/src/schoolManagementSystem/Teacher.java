package schoolManagementSystem;

import java.util.Arrays;

public class Teacher extends Person{

	String [] subjectTaught;
	double salary;
	
	Teacher(String name, int age) {
		super(name, age);
		
	}
	
	Teacher(String name, int age, String[] subjectTaught) {
		super(name, age);
		this.subjectTaught = subjectTaught;
		
	}
	
	Teacher(String name, int age, String[] subjectTaught, double salary) {
		super(name, age);
		this.subjectTaught = subjectTaught;
		this.salary = salary;
	}
	
	
	public void raiseSalary(double salary) {
		if(salary <= 35000) {
			
			salary += (0.10 * salary);
			System.out.println("The Teacher salary is increased by 10 percent to " + salary);
		}else {
			salary += (0.05 * salary);
			System.out.println("The Teacher salary increased by 5 percent to " + salary);
		}
	}
	
	
	//Arrays.toString(this.subjectTaught)
	
	@Override
	public String toString() {
		return "The teacher " + this.name  +" and teaches " + String.join(" and ", this.subjectTaught)  + " subjects.";
	}

}
