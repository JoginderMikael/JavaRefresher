package methodOverriding;

public class Fish extends Animal {
	
	// overriding the move method because it is already defined in the parent class, Animal. 
	
	@Override
	void move() {
		System.out.println("This animal is swimming");
	}
}
