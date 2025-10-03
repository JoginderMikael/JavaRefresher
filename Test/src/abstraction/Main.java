package abstraction;


public class Main {

	public static void main(String[] args) {
		// abstract = is used to define abstract classes and methods. 
		//				Abstraction is the process of hiding implementation details and showing only the essential features,
		//				Abstract classes CAN'T be instantiated directly. 
		//				Can contain 'abstract' methods which must be implemented by the child class.
		//				can contain 'concrete' methods which are Inherited by the child class.
		
		//Shape shape = new Shape(); => You cannot instantiate abstract class.
		Circle circle = new Circle(5.9);
		Triangle triangle = new Triangle(4.5, 6);
		Rectangle rectangle = new Rectangle(7, 8);
		
		
		circle.display();
		triangle.display();
		rectangle.display();
		
		System.out.println("The area of the circle is " + circle.area());
		System.out.println("The area of the triangle is " + triangle.area());
		System.out.println("The area of the rectangle is " + rectangle.area());

	}

}
