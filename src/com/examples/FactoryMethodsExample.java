package com.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FactoryMethodsExample {

	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		
		LocalDate localdateOf = LocalDate.of(2022, 2, 28);
		LocalDate localdateParse = LocalDate.parse("2022-02-28");
		LocalDate localdateFrom = LocalDate.from(today);
		
		LocalDateTime localdatetimeOf = LocalDateTime.of(2022, 2, 28, 15, 35, 50);
		LocalDateTime localdatetimeParse = LocalDateTime.parse("2022-02-28T15:35:55");
		LocalDateTime localdatetimeFrom = LocalDateTime.from(today);		
		
		System.out.println("Today: " + today);
		System.out.println("");
		
		System.out.println("Localdate.of: " + localdateOf);
		System.out.println("Localdate.parse: " + localdateParse);
		System.out.println("Localdate.from: " + localdateFrom);
		System.out.println("");
		
		System.out.println("Localdatetime.of: " + localdatetimeOf);
		System.out.println("Localdatetime.parse: " + localdatetimeParse);
		System.out.println("Localdatetime.from: " + localdatetimeFrom);		

	}

}
