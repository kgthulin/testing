package com.test.lambda;

import java.util.function.IntUnaryOperator;

public class LambdaTest6 {
	
	public static void main(String[] args) {
		int number = 6;
		IntUnaryOperator factorial = n -> {
			int result = 1;
			for (int i = 1; i <= n; i++) {
				result *= i;
			}
			return result;
		};
		int result = factorial.applyAsInt(number);
		System.out.println("Factorial of " + number + " is " + result);
	}

}
