package schoolManagementSystem;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person("John Mativo", 30);
		Student student = new Student("Joginder Mikael", 25, 1782, "Form 1", new double[] {50,60,50,76,90});
		Teacher teacher = new Teacher("Makali Mulu", 65, new String[] {"English", "Literature"});
		
		
		System.out.println(person);
		System.out.println(student);
		System.out.println(teacher);
		teacher.raiseSalary(75000);;
		


	}

}
