package com.examples;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class PeriodAndDurationExample {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		Period oneYearPeriod = Period.ofYears(1);
		Period oneMonthPeriod = Period.ofMonths(1);
		
		System.out.println("Today plus one year: " + today.plus(oneYearPeriod));
		System.out.println("Today plus one month: " + today.plus(oneMonthPeriod));
		
		LocalDate dateOfBirth = LocalDate.of(1980, 2, 19);
		Period periodAlive = Period.between(dateOfBirth, today);
		
		System.out.println("Alive for: " + periodAlive.getYears() + " years, " + periodAlive.getMonths() + " months and " + periodAlive.getDays() + " days.");
		
		Duration oneDay = Duration.ofDays(1);
		//Duration  = Duration.ofDays(1);
		

	}

}
