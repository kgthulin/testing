package com.test.date.time;

import java.time.LocalDate;
import java.time.Period;

public class DateTest4 {

	public static void main(String[] args) {
		var birthday = LocalDate.of(1996, 1, 22);
		var today = LocalDate.now();
		var period = Period.between(birthday, today);
		System.out.println(period);
		System.out.println("Age: " + period.getYears());
		System.out.println("Years: " + period.getYears());
		System.out.println("Months: " + period.getMonths());
		System.out.println("Days: " + period.getDays());
	}

}
