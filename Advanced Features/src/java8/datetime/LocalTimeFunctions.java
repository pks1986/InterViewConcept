package java8.datetime;

import java.time.LocalTime;

public class LocalTimeFunctions {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("now(): " + time);
		System.out.println("of()" + LocalTime.of(17, 12, 12));

	}

}
