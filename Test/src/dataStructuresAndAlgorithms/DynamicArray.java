package dataStructuresAndAlgorithms;

// DYNAMIC ARRAY - is a data structure that can grow and shrink in size.
public class DynamicArray {
	
	int size;
	int capacity = 10;
	Object[] Array;
	
	public DynamicArray() {
        this.Array = new Object[capacity];
        size = 0;
    }
	
	//overloaded constructor
	public DynamicArray(int capacity) {
		this.capacity = capacity;
        this.Array = new Object[capacity];
        size = 0;
    }
	
	public void add(Object data) {
		if (size == capacity) {
			grow(); //expand the size of array
		}
		Array[size] = data;
		size++;
	}
	
	public void insert(int index, Object data) {
		if (size >= capacity) {
			grow();
		}
		
		//shift elements to the right
		for (int i = size; i > index; i--) {
			Array[i] = Array[i - 1];
		}
		
		//insert data at index
		Array[index] = data;
		size++;
	}
	
	public void delete(Object data) {

		for (int i = 0; i < size; i++) {
			if (Array[i].equals(data)) {
				
				// shift elements to the left
				for (int j = 0; j < (size - i - 1); j++) {
					Array[i + j] = Array[i + j + 1];
				}
				Array[size - 1] = null; // clear last element
				size--;

				if (size <= (int) capacity / 3) {
					shrink(); // reduce the size of array
				}
				break; // exit after deleting first occurrence
			}
		}
	}
	
	public int search(Object data) {
		
		for (int i = 0; i < size; i++) {
			if (Array[i].equals(data)) {
				return i;
			}
		}
		
		return -1;
	}
	
	private void grow() {
		
		int newCapacity = (int) capacity * 2;
		
		Object[] newArray = new Object[newCapacity];
		
		for(int i = 0; i < size; i++) {
			newArray[i] = Array[i];
			
		}
		
		capacity = newCapacity;
		Array = newArray;
		
	}
	
	private void shrink() {
		
		int newCapacity = (int) capacity / 2;
		
		Object[] newArray = new Object[newCapacity];
		
		for(int i = 0; i < size; i++) {
			newArray[i] = Array[i];
			
		}
		
		capacity = newCapacity;
		Array = newArray;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
@Override
public String toString() {
    String string = "";
    
    for(int i = 0; i < size; i++) {
    	string += Array[i] + ", ";
    }
	if (string != "") {
		string = "[" + string.substring(0, string.length() - 2) + "]"; // remove last comma and space
	}else {
		string = "[]";
	}
    return string;
}

}

