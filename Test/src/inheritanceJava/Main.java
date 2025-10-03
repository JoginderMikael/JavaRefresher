package inheritanceJava;
// this is the main class
public class Main {

	public static void main(String[] args) {
		// inheritance => one class inherits the attributes and methods from another class
		// child <- parents <- Grandparent
		//use the extends keyword to inherit
		
		Dog dog = new Dog(); // object for dog class
		Cat cat = new Cat(); // object for cat class
		Plant plant = new Plant();
		
		System.out.println("The dog is alive ? " + dog.isAlive);
		System.out.println("The cat is alive ? " + cat.isAlive);
		System.out.println("The plant is alive ? +" + plant.isAlive);
		
		dog.eat();
		cat.eat();
		plant.photosynthesize();
		
		System.out.println("Our dog has " + dog.lives + " Lives");
		System.out.println("Our cat has " + cat.lives + " Lives");
		
		dog.speak();
		cat.speak();

	}

}
