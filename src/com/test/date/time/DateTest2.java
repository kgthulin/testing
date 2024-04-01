package com.test.date.time;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class DateTest2 {

	public static void main(String[] args) {
		var cal1 = Calendar.getInstance();
		cal1.set(1996, 1, 22);
		var cal2 = Calendar.getInstance();
		cal2.set(2024, 3, 30);
		long ms = Math.abs(cal1.getTimeInMillis() - cal2.getTimeInMillis());
		long days = TimeUnit.DAYS.convert(ms, TimeUnit.MILLISECONDS);
		System.out.println(days);
	}

}
