package annonymousClasses;

public class Main {

	public static void main(String[] args) {
		// Anonymous class => a class that doesn't have a name. cannot be reused. 
		// add custom behavior without having to create a new class. 
		// often used for one time uses (TimerTask, Runnable, callbacks).
		
		Dog dog = new Dog();
		
		//anonymous class
		Dog dog1 = new Dog() {
			@Override
			void speak() {
				System.out.println("Scooby Doo says Ruh Roh");
			}
		};
		
		
		dog.speak();
		dog1.speak();
		

	}

}
