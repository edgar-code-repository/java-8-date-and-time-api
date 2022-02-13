package com.examples;

import java.time.LocalDate;

public class DateExample {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println("Tomorrow: " + tomorrow);
		
		LocalDate yesterday = LocalDate.now().minusDays(1);
		System.out.println("Yesterday: " + yesterday);
		
		
	}

}
