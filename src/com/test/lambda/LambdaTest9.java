package com.test.lambda;

public class LambdaTest9 {

	public static void main(String[] args) {
		StringChecker palindrome = str -> {
			String cleanedStr = str.replaceAll("\\s", "").toLowerCase();
			return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
		};
		System.out.println(palindrome.check("Rotator"));
		System.out.println(palindrome.check("World"));
	}

}

interface StringChecker {
	boolean check(String str);
}
