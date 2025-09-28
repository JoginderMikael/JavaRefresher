package workingWorkingArrays;

public class DaysOfWeekScheduler {
	
	//scheduling tasks for days of the week
	
	static void schedule(String[] daysOfWeek) {
		for (String day : daysOfWeek) {
			
			System.out.printf("%-10s -> ", day );
			switch (day) {
			case "Monday" -> System.out.println("Cybersecurity.");
			case "Tuesday" -> System.out.println("Software development.");
			case "Wednesday" -> System.out.println("Photography");
			case "Thursday" -> System.out.println("Book chapter.");
			case "Friday" -> System.out.println("Riding motorcycle.");
			case "Saturday" -> System.out.println("Drinking Beer.");
			case "Sunday" -> System.out.println("Motogp.");
			default -> System.out.println("Not day of week.");
			}
			

		}
	}

	
	public static void main(String[] args) {
		
		String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		System.out.println("\n==========DAYS OF WEEK SCHEDULER ======== ");
		schedule(daysOfWeek);
		System.out.println("==========    END   ======== ");
		

	}

}
