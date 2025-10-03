package interfaces;

public class Main {

	public static void main(String[] args) {
		//Interface => it is a blueprint for a class that specifies a set of abstract methods that implementing classes MUST define.
		//			They support multiple inheritance-like behavior
		// EG, by using inheritance a class can have single parent, but by use of interface a class can have multiple parents. 
		
		Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();
		Fish fish = new Fish();
		
		
		rabbit.flee();
		hawk.hunt();
		fish.flee();
		fish.hunt();
		
		

	}

}
