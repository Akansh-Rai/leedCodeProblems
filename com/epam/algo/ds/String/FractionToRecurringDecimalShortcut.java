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
public class FractionToRecurringDecimalShortcut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// System.out.println("22/7 Fraction To Recurring Decimal " +
		// fractionToRecurringDecimal(22, 7));
		System.out.println("22/7 Fraction To Recurring Decimal " + fractionToRecurringDecimal(22, -7));

	}

	private static String fractionToRecurringDecimal(int numerator, int denominator) {
		if (numerator == 0)
			return "0";
		StringBuilder sb = new StringBuilder();

		// handle negative sign in output.
		if ((numerator > 0 && denominator < 0) || (numerator < 0 && denominator > 0)) {
			sb.append("-");
		}

		/* stored long value of division in remainder */
		float divisor = Math.abs((float) numerator);
		float dividend = Math.abs((float) denominator);
		// float remainder = divisor % dividend;

		/* added integer value of division */
		sb.append(divisor / dividend);
		int index = 0;
		while (sb.charAt(index) != '.') {
			index++;
		}
		sb.insert(++index, '(');
		sb.append(')');

		return sb.toString();

	}

}
