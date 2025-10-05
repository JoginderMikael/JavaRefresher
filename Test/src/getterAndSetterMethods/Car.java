package getterAndSetterMethods;

public class Car {
	
	// using private access modifier to limit the attributes access
	private final String model;
	private String color;
	private int price;
	
	
	Car(String model, String color, int price){
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	// GETTER METHODS
	String getModel() {
		return this.model;
	}
	
	String getColor() {
		return this.color;
	}
	
	String getPrice() {
		return "KES " + this.price;
	}
	
	
	// SETTER METHODS
	void setColor(String color) {
		this.color = color;
	}
	
	void setPrice(int price) {
		if(price<0) {
			System.out.println("Price cant be less than zero");
		}else {
			this.price = price;	
		}
		
	}
}
