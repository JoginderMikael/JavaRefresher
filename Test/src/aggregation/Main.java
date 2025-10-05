package aggregation;

public class Main {

	public static void main(String[] args) {
		// Aggregation => represents a "has-a" relationship between objects. 
		// One object contains another object as part of its structure. 
		// but contained object/s can exists independently. 
		
		Book book1 = new Book("The Fellow of the Ring", 423);
		Book book2 = new Book("The two towers", 152);
		Book book3 = new Book("The return of the king", 416);
		
		
		Book[] books = {book1, book2, book3};
		
		
		
		//aggregation in passing the array of Books
		Library library = new Library("The NYC Public Library", 1897, books);
		
		library.displayInfo();
		
		
	}

}
