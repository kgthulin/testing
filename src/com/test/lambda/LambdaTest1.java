package com.test.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaTest1 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Tutor", "Joe", "Computer", "Education");
		List<String> uppList = strList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		List<String> lowList = strList.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());
		System.out.println(uppList);
		System.out.println(lowList);
	}

}
