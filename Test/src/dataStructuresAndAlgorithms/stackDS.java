package dataStructuresAndAlgorithms;

import java.util.Stack;

public class stackDS {

	public static void main(String[] args) {
		//STACK - is a LIFO data structure. Last-In First-Out
		// 			stores objects in a sort of 'vertical tower'
		//			push() to add to the top
		//			pop() to remove from the top
		
		
		//declare
		
		Stack<String> stack = new Stack();
		
		
		
		stack.push("Minecraft");
		stack.push("EuroTruck");
		stack.push("Alsphalt Nitro");
		stack.push("Need for speed");
		stack.push("Moto2"); // this is the top most item cos it was entered last. 
		/*
		 * The stack now looks like this: | Moto2 | <- top | Need for speed | | Alsphalt
		 * Nitro | | EuroTruck | | Minecraft | -----------------
		 */
		
		System.out.println("The stack is empty (True/false): " + stack.empty()); //checking if the stack is empty
		
		System.out.println("The whole stack is: " + stack);
		
		String myFavGame = stack.pop(); //removing the top most item and assigning it to string
		System.out.println(myFavGame + " is my favourite game!"); //printing the popped item)
		
		
		System.out.println(stack.peek() + " is now the top most item in the stack"); //peeking the top most item without removing it.
		System.out.println("The stack after pop is: " + stack);
		
		System.out.println(stack.search("EuroTruck")); //searching for an item in the stack. returns position from the top of the stack (1 based index)
		
		
		for(int i = 0; i < 100000000; i++) {
            //infinite loop to keep the program running to allow heap memory inspection
			stack.push("Game " + i);
        }
		
		//uses of stacks:
		//1. Undo/Redo functionality in text editors
		//2. Moving back/forward in web browsers
		//3.Backtracking algorithms (e.g., maze solving)
		//4.calling functions (function call stack)
		
	}

}
