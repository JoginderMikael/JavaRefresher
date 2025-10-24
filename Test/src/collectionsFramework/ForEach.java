package collectionsFramework;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		List<Integer> nums =  Arrays.asList(4, 5, 7, 8, 9);
		
		nums.forEach(n -> System.out.println(n));
		

	}

}
