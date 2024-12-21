package com.day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateApiExample {
	public static void main(String[] args) {

		// display date
		LocalDate date = LocalDate.now(); // now is static method
		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());

		// display time
		LocalTime time = LocalTime.now();
		System.out.println(time);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
	}

}
