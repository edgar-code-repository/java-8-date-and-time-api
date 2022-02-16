package com.examples;

import java.time.LocalDate;

public class DateArithmeticExample {

	public static void main(String[] args) {
		
		LocalDate todayWithoutTime = LocalDate.now();
		System.out.println("Today: " + todayWithoutTime);		
		
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("Tomorrow: " + tomorrow);
		
		LocalDate plusOneMonth = LocalDate.now().plusMonths(1);
		System.out.println("Plus 1 month: " + plusOneMonth);		
		
		LocalDate minusOneYear = LocalDate.now().minusYears(1);
		System.out.println("Minus one year: " + minusOneYear);

		LocalDate minusThreeWeeks = LocalDate.now().minusWeeks(3);
		System.out.println("Minus three weeks: " + minusThreeWeeks);		

	}

}
