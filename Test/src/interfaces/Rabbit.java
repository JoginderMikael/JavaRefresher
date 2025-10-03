package interfaces;

public class Rabbit implements Prey {
	
	//implementing the abstract method
	@Override
	public void flee() {
		System.out.println("*The rabbit is running away*");
	}
}
