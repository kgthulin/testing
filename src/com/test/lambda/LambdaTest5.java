package com.test.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaTest5 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Mango", "Banana", "Grape", "Lettuce", "Apple");
		list.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		System.out.println(list);
	}
}
