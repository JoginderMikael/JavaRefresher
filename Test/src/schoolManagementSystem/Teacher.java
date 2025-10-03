package schoolManagementSystem;


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
	
	
	public String raiseSalary(double salary) {
		if(this.salary <= 35000) {
			
			this.salary += (0.10 * this.salary);
			return "The Teacher salary is increased by 10 percent to " + this.salary;
		}else {
			this.salary += (0.05 * this.salary);
			return "The Teacher salary increased by 5 percent to " + this.salary;
		}
	}
	
	
	//Arrays.toString(this.subjectTaught)
	
	@Override
	public String toString() {
		return "The teacher " + this.name  +" and teaches " + String.join(" and ", this.subjectTaught)  + " subjects. " + this.raiseSalary(this.salary);
	}

}
