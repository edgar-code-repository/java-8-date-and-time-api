NEW DATE AND TIME API
-------------------------------------------------------------------------------------------------------

A few examples to show the use of the new Date and Time API,
that was introduces in Java 8.

The classes that are part of this API reside in the java.time package.

-------------------------------------------------------------------------------------------------------

Getting a LocalDate and a LocalDateTime with method "now":

		LocalDate todayWithoutTime = LocalDate.now();
		System.out.println("Today: " + todayWithoutTime);
	
		LocalDateTime todayWithTime = LocalDateTime.now();
		System.out.println("Today with time: " + todayWithTime);


```

		Today: 2022-02-12
		Today with time: 2022-02-12T23:44:49.907

```

-------------------------------------------------------------------------------------------------------

LocalDate has methods that allows to add or substract days, months, weeks and years to a given date.
For example:

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
		
		
```

		Today: 2022-02-15
		Tomorrow: 2022-02-16
		Plus 1 month: 2022-03-15
		Minus one year: 2021-02-15
		Minus three weeks: 2022-01-25

```

-------------------------------------------------------------------------------------------------------

When using LocalDateTime, there are also available methods that allow to add or substract hours, minutes,
seconds and nanoseconds:


		LocalDateTime todayWithTime = LocalDateTime.now();
		System.out.println("Today with time: " + todayWithTime);
		
		LocalDateTime plusFiveHours = todayWithTime.plusHours(5);
		System.out.println("Plus five hours: " + plusFiveHours);

		LocalDateTime minusNinetySeconds = todayWithTime.minusSeconds(90);
		System.out.println("Minus ninety seconds: " + minusNinetySeconds);		


```

		Today with time: 2022-02-15T22:05:24.745
		Plus five hours: 2022-02-16T03:05:24.745
		Minus ninety seconds: 2022-02-15T22:03:54.745


```

-------------------------------------------------------------------------------------------------------




