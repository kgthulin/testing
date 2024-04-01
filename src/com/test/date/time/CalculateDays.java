package com.test.date.time;

import java.util.Scanner;

public class CalculateDays {
	
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		System.out.println("Enter first year:");
		int fy = scanner.nextInt();
		System.out.println("Enter end year:");
		int ey = scanner.nextInt();
		scanner.close();
		if (ey > fy) {
			System.out.println("\nYear & Number of Days " );
			for (int i = fy; i < ey; i++) {
				System.out.println(i + " = " + numOfDays(i));
			}
			
		} else {
			System.out.println("End Year must be Greater than First Year...");
		}
	}
	
	static int numOfDays(int year) {
		if (isLeapYear(year)) {
			return 366;
		}
		return 365;
	}
	
	static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 400 !=0) || (year % 400 == 0);
	}

}
