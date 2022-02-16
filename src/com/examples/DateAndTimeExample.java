package com.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTimeExample {

	public static void main(String[] args) {
		
		LocalDate todayWithoutTime = LocalDate.now();
		System.out.println("Today: " + todayWithoutTime);

		LocalDateTime todayWithTime = LocalDateTime.now();
		System.out.println("Today with time: " + todayWithTime);

		
		
	}

}
