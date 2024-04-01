package com.test.lambda;

import java.util.function.Predicate;

public class LambdaTest2 {
	
	public static void main(String[] args) {
		var str = "";
		Predicate<String> isEmpty = s -> s.isEmpty();
		if (isEmpty.test(str)) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}
	}

}
