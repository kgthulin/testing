package com.test.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest10 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 7 ,23, 107, 15, 57);
		List<Integer> resList = LambdaTest10.filterPrimeNumbers(list);
		System.out.println(resList);
	}
	
	static List<Integer> filterPrimeNumbers(List<Integer> numbers) {
		Predicate<Integer> isPrime = number -> {
			if (number < 2) {
				return false;
			}
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		};
		
		List<Integer> primeList = new ArrayList<>();
		for (int num : numbers) {
			if (isPrime.test(num)) {
				primeList.add(num);
			}
		}
		return primeList;
	}
}
