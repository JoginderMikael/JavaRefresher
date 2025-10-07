package generics;

public class Box<T>{
	
	//declare attribute of type T
	T item;
	
	//setting item to the box
	public void setItem(T item) {
		this.item = item;
		
	}
	
	// method to get the attribute value
	public T getItem() {
		return this.item;
	}

}
