package com.test.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaTest8 {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 22, 55, 78, 100);
		Integer[] intArr = new Integer[list.size()];
		Integer[] resArr = list.toArray(intArr);
		for (int a : resArr) {
			System.out.println(a);
		}
		System.out.println("*********");
		Optional<Integer> maxNum = list.stream().reduce((a, b) -> a > b ? a : b);
		if (maxNum.isPresent()) {
			System.out.println(maxNum.get());
		} else {
			System.out.println("Number not found");
		}
		
		int minNum = list.stream().min(Integer::compare).orElse(0);
		System.out.println(minNum);
		
		int mul = list.stream().reduce(1, (a, b) -> a * b);
		int sum = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Multiply " + mul);
		System.out.println("Sum " + sum);
	}

}
