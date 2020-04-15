package java8.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateFunctions {

	public static void main(String[] args) {
		//Months 1 - 12 are allowed
		
		LocalDate date = LocalDate.now();
		System.out.println("Today: " + date);
		
		LocalDate yesterday = date.minusDays(1);
		System.out.println("Yesterday: "+ yesterday);
		
		LocalDate tomorrow = date.plusDays(1);
		System.out.println("Tomorrow: " + tomorrow);
		
		date = LocalDate.of(1696, 12, 1);
		System.out.println("LocalDate.of(yyyy, mm, dd): " + date);
		System.out.println("isLeapYear(): " + date.isLeapYear());
		System.out.println("Diff between 1696 and 2017: " + ChronoUnit.YEARS.between(date, yesterday));
		
		System.out.println("\nMaximum Supportedd LocalDate is " + LocalDate.MAX);
		System.out.println("Minimum Supportedd LocalDate is " + LocalDate.MIN);
		
		System.out.println("atTime(hour, minute, second, nano): " + date.atTime(12, 15, 18, 200));
		

	}

}
