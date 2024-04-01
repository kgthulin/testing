package com.test.lambda;

import java.util.function.BiFunction;

public class LambdaTest7 {

	public static void main(String[] args) {
		var str1 = "Hello World!";
		var str2 = "It's amazing";
		BiFunction<String, String, String> con = (s1, s2) -> s1 + " " + s2;
		var str = con.apply(str1, str2);
		System.out.println(str);
	}
}
