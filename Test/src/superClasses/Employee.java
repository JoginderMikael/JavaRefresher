package superClasses;

public class Employee extends Person {
	
	int salary;
	Employee(String first, String last, int salary) {
		super(first, last); // call the constructor of the parent class with super keyword
		this.salary = salary;
		
	}
	
	void showSalary() {
		System.out.println(this.first + "'s salary is $" + this.salary);
	}
}
