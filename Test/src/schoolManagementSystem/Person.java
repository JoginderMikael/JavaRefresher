package schoolManagementSystem;

public class Person {
	
	String name;
	int age;
	int id;
	
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "The persond details are: the name is " + this.name  + " age is " + this.age;
	}
}
