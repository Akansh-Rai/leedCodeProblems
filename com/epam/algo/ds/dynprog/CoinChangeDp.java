
package com.epam.algo.ds.dynprog;

import java.util.Arrays;

/**
 * @author Akansh_Rai https://leetcode.com/problems/coin-change/solution/
 */
public class CoinChangeDp {

	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int sum = 11;
		System.out.println("Number of coins needed : " + getNumberOfCoins(coins, sum));
		int coins1[] = { 186, 419, 83, 408 };
		int sum1 = 6249; // output : 20
		System.out.println("Number of coins needed : " + getNumberOfCoins(coins1, sum1));
	}

	public static int getNumberOfCoins(int[] coins, int amount) {
		int max = amount + 1;
		int[] numbers = new int[amount + 1];
		Arrays.fill(numbers, max);
		numbers[0] = 0;
		for (int i = 1; i <= amount; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i) {
					numbers[i] = Math.min(numbers[i], numbers[i - coins[j]] + 1);
				}
			}
		}
		return numbers[amount] > amount ? -1 : numbers[amount];
	}
}
