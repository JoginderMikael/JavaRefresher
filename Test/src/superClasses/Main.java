package superClasses;

public class Main {

	public static void main(String[] args) {
		// super => refers to the parent class (subclass <- superclass)
		// used in constructors and method overriding
		// calls the parent constructor to initialize attributes
		
		Person person = new Person("Joginder", "Mikael");
		Student student = new Student("Erick", "Timothy", 3.4);
		Employee employee = new Employee("John", "Mativo", 34000);
		
		person.showName();
		student.showName();
		employee.showName();
		
		student.showGPA();
		employee.showSalary();

	}

}
