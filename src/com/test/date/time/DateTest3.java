package com.test.date.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTest3 {

	public static void main(String[] args) {
		var date = LocalDate.now();
		var nextFriday = date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("Next Friday: " + nextFriday);
		var previousFriday = date.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
		System.out.println("Previous Friday: " + previousFriday);
	}

}
