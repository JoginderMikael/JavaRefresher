
public class TwoD_Arrays {
// demonstrates the 2D arrays in Java
	public static void main(String[] args) {
	// Also known as 2 dimensional array
		// 2D array is an array where each element is an array 
		// They are useful for storing matrix of data
		
		String[] fruits = {"Apple", "orange", "Banana"}; 
		String[] vegetables = {"Potato", "onion", "Carrot"};
		String[] meats = {"chicken", "pork", "beef", "fish"};
		
		String[][] groceries = {fruits, vegetables, meats}; // 2D array
		String[][] groceries1 = {{"Apple", "orange", "Banana"},
								{"Potato", "onion", "Carrot"},
								{"chicken", "pork", "beef", "fish"}};
		
		//display
		for(String[] foods : groceries) {
			for(String food : foods) {
				System.out.print(food + " ");
			}
			// add a line after each single array is printed
			System.out.println();
		}
		System.out.println("\n");
		
		// changing an element in the 2darray
				groceries1[0][0] = "Pineapple"; // change element in row 0, column 0
						
		for(String[] foods : groceries1) {
			for(String food : foods) {
				System.out.print(food + " ");
			}
			// add a line after each single array is printed
			System.out.println();
		}
		
		
	}

}
