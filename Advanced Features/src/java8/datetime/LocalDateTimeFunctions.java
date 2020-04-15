package java8.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeFunctions {

	public static void main(String[] args) {
		System.out.println("Different date and time formats");
		LocalDateTime ldt = LocalDateTime.now();
	    LocalDateTime now = LocalDateTime.now();
		System.out.println(ldt);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatted = ldt.format(formatter);
		System.out.println(formatted);

		formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		formatted = ldt.format(formatter);
		System.out.println(formatted);

		formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		formatted = ldt.format(formatter);
		System.out.println(formatted);

		formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		formatted = ldt.format(formatter);
		System.out.println(formatted);

		formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		formatted = ldt.format(formatter);
		System.out.println(formatted);
		
		LocalDateTime a = ldt;
		System.out.println("\nget() with diferent Parameters");
		System.out.println("Day of week: " + a.get(ChronoField.DAY_OF_WEEK));  
	    System.out.println("Day of year: " + a.get(ChronoField.DAY_OF_YEAR));  
	    System.out.println("Day of month: " + a.get(ChronoField.DAY_OF_MONTH));  
	    System.out.println("Hour of day: " + a.get(ChronoField.HOUR_OF_DAY));    
	    System.out.println("Hour of day AM/PM: " + a.get(ChronoField.HOUR_OF_AMPM));  
	    System.out.println("Minute of day: " + a.get(ChronoField.MINUTE_OF_DAY));  
	    
	    LocalDateTime otherDate = LocalDateTime.of(2012, 11, 24, 15, 24);
	    System.out.println("\nComparisions returns difference in years");
	    System.out.println("Previous with current: " + otherDate.compareTo(ldt));
	    System.out.println("Current with previous: " + ldt.compareTo(otherDate));
	    System.out.println("Current with current: " + now.compareTo(ldt));

	}

}
