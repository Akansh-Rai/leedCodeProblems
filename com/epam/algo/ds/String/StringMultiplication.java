package com.epam.algo.ds.String;

public class StringMultiplication {
	public static void main(String[] args) {
		String num1 = "3754";// 421415454545454545454544";
		String tempnum1 = num1;
		String num2 = "558";// 6546546545454544548544544545";
		String tempnum2 = num2;
		boolean appendNegation = false;

		// Check condition if one string is negative
		if (num1.charAt(0) == '-' && num2.charAt(0) != '-') {
			appendNegation = true;
			num1 = num1.substring(1);
		} else if (num1.charAt(0) != '-' && num2.charAt(0) == '-') {
			num2 = num2.substring(1);
			appendNegation = true;
		} else if (num1.charAt(0) == '-' && num2.charAt(0) == '-') {
			num1 = num1.substring(1);
			num2 = num2.substring(1);
		}

		String s1 = new StringBuffer(num1).reverse().toString();
		String s2 = new StringBuffer(num2).reverse().toString();

		int[] m = new int[s1.length() + s2.length()];

		// Go from right to left in num1
		for (int i = 0; i < s1.length(); i++) {
			// Go from right to left in num2
			for (int j = 0; j < s2.length(); j++) {
				m[i + j] = m[i + j] + (s1.charAt(i) - '0') * (s2.charAt(j) - '0');

			}
		}

		String product = new String();
		// Multiply with current digit of first number
		// and add result to previously stored product
		// at current position.
		for (int i = 0; i < m.length; i++) {
			int digit = m[i] % 10;
			int carry = m[i] / 10;
			if (i + 1 < m.length) {
				m[i + 1] = m[i + 1] + carry;
			}
			product = digit + product;

		}

		// ignore '0's from the right
		while (product.length() > 1 && product.charAt(0) == '0') {
			product = product.substring(1);
		}

		if (appendNegation) {
			product = new StringBuffer(product).insert(0, '-').toString();
		}
		System.out.println("Product of the two numbers is :" + "\n" + product);
	}
}