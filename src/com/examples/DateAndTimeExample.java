package com.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTimeExample {

	public static void main(String[] args) {
		
		LocalDate todayWithoutTime = LocalDate.now();
		System.out.println("Today: " + todayWithoutTime);

		LocalDateTime todayWithTime = LocalDateTime.now();
		System.out.println("Today with time: " + todayWithTime);
		
		
		LocalDate tomorrow = todayWithoutTime.plusDays(1);
		System.out.println("Tomorrow: " + tomorrow);
		
		LocalDate yesterday = todayWithoutTime.minusDays(1);
		System.out.println("Yesterday: " + yesterday);
		
		
	}

}
