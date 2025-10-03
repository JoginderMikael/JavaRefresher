package interfaces;

public class Fish implements Prey, Predator{

	//implementing abstract method from two parent classes (interfaces)
	@Override
	public void flee() {
		System.out.println("The Fish is swimming away");
	}
	
	@Override
	public void hunt() {
		System.out.println("The Fish is Hunting.");
	}
}
