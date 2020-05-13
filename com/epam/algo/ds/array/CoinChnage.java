/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.Arrays;

/**
 * @author Akansh_Rai
 *
 */
public class CoinChnage {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int[] coins = { 3, 2, 5 };
		int sum = 9;
		System.out.println(getCoins(coins, sum));
	}

	public static int getCoins(int coins[], int sum) {
		int right = coins.length - 1;
		int count = 0;
		Arrays.sort(coins);
		while (right >= 0) {
			int remaining = sum - coins[right];
			if (remaining > 0) {
				sum = remaining;
				count++;
			} else if (remaining < 0) {
				right--;
			} else {
				sum = remaining;
				count++;
				break;
			}
		} // while
		return sum == 0 ? count : -1;
	}
}
