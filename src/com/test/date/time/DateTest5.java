package com.test.date.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateTest5 {

	public static void main(String[] args) {
		var strDate = "March 30, 2024";
		var formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
		var date = LocalDate.parse(strDate, formatter);
		System.out.println(date);
		
		var year = Year.now();
		System.out.println(year);
		boolean isLeapYear = year.isLeap();
		System.out.println(isLeapYear);
		int days = year.length();
		System.out.println(days);
		
		var t = LocalDate.now();
		var lastDayOfYear = t.with(TemporalAdjusters.lastDayOfYear());
		System.out.println(lastDayOfYear);
		Period p = t.until(lastDayOfYear);
		System.out.println("Months remaining in the year: " + p.getMonths());
		
		var instant = Instant.now();
		System.out.println(instant);
		
		var ym = YearMonth.of(2024, 3);
		var fday = ym.atDay(1).getDayOfWeek().name();
		var lday = ym.atEndOfMonth().getDayOfWeek().name();
		System.out.println(fday);
		System.out.println(lday);
		
		Date d = new Date();
		System.out.println(d.getTime());
		System.out.println(System.currentTimeMillis());
		
		java.sql.Date sqlDate = new java.sql.Date(d.getTime());
		System.out.println(sqlDate);
	}

}
