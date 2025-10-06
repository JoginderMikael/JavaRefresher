import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {

	public static void main(String[] args) {
		// How to work with DATES & TIMES using Java
		// (LocalDate, LocalTime, LocalDateTime, UTC, timestamp)
		
		LocalDate date = LocalDate.now();  //date
		LocalTime time = LocalTime.now(); //time
		LocalDateTime dateTime = LocalDateTime.now(); //Retrieve both date and time
		Instant instant = Instant.now(); //UTC TIME
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		System.out.println(instant);
		
		//custom format for date time
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
		String newDateTime = dateTime.format(formatter);
		System.out.println("This is the formatted date time: " + newDateTime);
		
		//custom date time object
		
		LocalDate date1 = LocalDate.of(2024, 12, 25);
		System.out.println(date1);
		
		//comparing dates
		
		LocalDateTime date2 = LocalDateTime.of(2025, 12, 25, 12, 0, 0);
		LocalDateTime date3 = LocalDateTime.of(2026, 1, 1, 0, 0, 0);
		
		if(date2.isBefore(date3)) {
			System.out.println(date2 + " is earlier than " + date3);
		}else if (date2.isAfter(date3)) {
			System.out.println(date2 + " is later than " + date3);
		} else if (date2.isEqual(date3)) {
			System.out.println(date2 + " is equal to " + date3);
		}
		
		
		
		

	}

}
