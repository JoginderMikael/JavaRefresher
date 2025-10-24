package collectionsFramework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		/*
		 * Stream API provides a functional and declarative way to process collections of objects
		 * Provides a powerful alternative to the traditional loops for performing operations such as filtering, mapping and reducing the data. 
		 * Stream can only be used only once, once used the stream is closed. 
		 */
	
		List<Integer> nums = Arrays.asList(11, 9, 7, 5, 8, 4, 10);
		
		//Stream<Integer> data = nums.stream();
		
		//data.count();
		
		//using the stream to double the values before printing them
		
		/* doing the same with external for loop
		for(int n : nums) {
			System.out.println(n*2);
		}
		*/
		
	//	Stream<Integer> mappedData= data.map(n -> n*2); //doubling, Map gives a new stream
		
	//	mappedData.forEach(n -> System.out.println(n)); //fetch the data from the stream and print. 
		
		//All can be done on one line
		
		nums.stream()
				.filter(n -> n%2 == 1)
				.sorted()
				.map(n->n*2)
				.forEach(n -> System.out.println(n)); //DESIGN PATTERNS, Builder pattern. Instead of creating a variable for every stream created. 

	}

}
