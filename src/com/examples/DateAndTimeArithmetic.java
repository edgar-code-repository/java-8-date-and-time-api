package com.examples;

import java.time.LocalDateTime;

public class DateAndTimeArithmetic {

	public static void main(String[] args) {

		LocalDateTime todayWithTime = LocalDateTime.now();
		System.out.println("Today with time: " + todayWithTime);
		
		LocalDateTime plusFiveHours = todayWithTime.plusHours(5);
		System.out.println("Plus five hours: " + plusFiveHours);

		LocalDateTime minusNinetySeconds = todayWithTime.minusSeconds(90);
		System.out.println("Minus ninety seconds: " + minusNinetySeconds);		
		

	}

}
