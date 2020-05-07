/**
 * 
 */
package com.epam.algo.ds.String;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Akansh_Rai
 *
 */
public class FractionToRecurringDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("22/7 Fraction To Recurring Decimal " + fractionToRecurringDecimal(22, 7));
		System.out.println("22/7 Fraction To Recurring Decimal " + fractionToRecurringDecimal(22, -7));

	}

	private static String fractionToRecurringDecimal(int numerator, int denominator) {
		if (numerator == 0)
			return "0";
		StringBuilder sb = new StringBuilder();

		/*
		 * handle negative sign in output. if ((numerator > 0 && denominator < 0) ||
		 * (numerator < 0 && denominator > 0)) { sb.append("-"); }
		 */

		/* stored long value of division in remainder */
		long divisor = Math.abs((long) numerator);
		long dividend = Math.abs((long) denominator);
		long remainder = divisor % dividend;

		/* added integer value of division */
		sb.append(numerator / denominator);

		Map<Long, Integer> myMap = new HashMap<Long, Integer>();

		/*
		 * if remainder is zero then return result else add "." in stringbuilder to
		 * continue with floating part
		 */
		if (remainder == 0) {
			return sb.toString();
		} else {
			sb.append(".");
		}

		Map<Long, Integer> map = new HashMap<>();

		while (remainder != 0) {
			if (map.containsKey(remainder)) {
				/* if key exist in map Insert and append () and return. */
				sb.insert(map.get(remainder), "(");
				sb.append(")");
				break;
			}
			/* continue counting remainder and sb length. */
			map.put(remainder, sb.length());
			remainder *= 10;
			sb.append(remainder / dividend);
			remainder %= dividend;
		}

		return sb.toString();

	}

}
