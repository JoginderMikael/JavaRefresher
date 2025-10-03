package abstraction;

//an abstract class by adding the abstract keyword

public abstract class Shape {

	// abstract method
	abstract double area();
	
	//concrete method
	void display() {
		System.out.println("This is a shape.");
	}
}
