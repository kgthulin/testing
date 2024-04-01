package com.test.date.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest1 {
	
	public static void main(String[] args) {
		var date = LocalDate.now();
		System.out.println(date);
		var time = LocalTime.now();
		System.out.println(time);
		var dateTime = LocalDateTime.of(date, time);
		System.out.println(dateTime);
		var zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		var offsetTime = OffsetTime.now();
		System.out.println(offsetTime);
		var formatter = DateTimeFormatter.ofPattern("E MMM, yyyy HH:mm:ss.SSSZ");
		var formattedDate = formatter.format(zonedDateTime);
		System.out.println(formattedDate);
	}

}
