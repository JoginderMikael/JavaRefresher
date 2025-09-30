package staticKeyWord;

public class Main {

	public static void main(String[] args) {
		// static keyword is used to make a variable or method to blong to the class
		// rather than to any specific object.
		// it is commonly used for utility methods or shared resources. 
		
		Friend friend1 = new Friend("Kaitho");
		Friend friend2 = new Friend("Katitu");
		Friend friend3 = new Friend("Nzombo");
		Friend friend4 = new Friend("Katombi");
		Friend friend5 = new Friend("Kaewa");
		
		// to display a statistic attribute we do that by class name not by object
		System.out.println(Friend.numOfFriends);
		
		// calling a static method
		Friend.showFriends();
		
		// accessing utility method
		Math.round(3.5);

	}

}
