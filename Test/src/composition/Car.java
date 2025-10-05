package composition;

public class Car {

	String model;
	int year;
	Engine engine;
	
	Car(String model, int year, String engineType){
		this.model = model;
		this.year = year;
		this.engine = new Engine(engineType); // calling a constructor for engine
	}
	
	void start() {
		this.engine.start();
		
			System.out.println("The " + this.model + " is running");
		
	}
}
