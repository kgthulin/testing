package com.test.lambda;

import java.util.List;

public class LambdaTest3 {

	public static void main(String[] args) {
		List<Double> dblList = List.of(1.1, 2.2, 3.3, 4.4, 5.5);
		double sum = dblList.stream().mapToDouble(Double::doubleValue).sum();
		double avg = sum / dblList.size();
		System.out.println(sum);
		System.out.println(avg);
	}
}
