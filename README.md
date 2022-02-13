NEW DATE AND TIME API
-----------------------------------------------------------------------------

A few examples to show the use of the new Date and Time API,
that was introduces in Java 8.

The classes that are part of this API reside in the java.time package.

-----------------------------------------------------------------------------

Getting a LocalDate and a LocalDateTime with method "now":

```

	LocalDate todayWithoutTime = LocalDate.now();
	System.out.println("Today: " + todayWithoutTime);

	LocalDateTime todayWithTime = LocalDateTime.now();
	System.out.println("Today with time: " + todayWithTime);

```

```

	Today: 2022-02-12
	Today with time: 2022-02-12T23:44:49.907

```

-----------------------------------------------------------------------------




