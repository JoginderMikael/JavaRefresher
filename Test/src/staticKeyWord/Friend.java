package staticKeyWord;

public class Friend {
	// try to keep the total number of friends
	static int numOfFriends; // All the objects share this variable
	String name;
	
	Friend(String name){
		this.name = name;
		numOfFriends++;
	}
	
	// methods can also be modified by the static keyword
	
	static void showFriends() {
		System.out.println("You have " + numOfFriends + " total friends");
	}

}
