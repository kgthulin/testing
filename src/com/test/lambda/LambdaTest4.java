package com.test.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest4 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 1, 4, 3, 5, 6 ,3);
		List<Integer> distNumbers = new ArrayList<>(numbers);
		distNumbers.removeIf(num -> numbers.indexOf(num) != numbers.lastIndexOf(num));
		System.out.println(numbers);
		System.out.println(distNumbers);
	}

}
