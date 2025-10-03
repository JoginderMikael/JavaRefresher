package abstraction;

public class Circle extends Shape{
	
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	// implementing abstract area method
	@Override
	double area(){
		
		return Math.PI * radius * radius;
		
	}

}
