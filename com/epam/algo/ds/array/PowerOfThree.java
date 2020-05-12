/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class PowerOfThree {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(5));
	}

	public static boolean isPowerOfThree(int n) {
		if (n < 1) return false;

		while (n % 3 == 0) {
			n = n / 3;
		}

		return n == 1;

	}
}
