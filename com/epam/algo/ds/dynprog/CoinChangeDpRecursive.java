
package com.epam.algo.ds.dynprog;

/**
 * @author Akansh_Rai https://leetcode.com/problems/coin-change/solution/
 */
public class CoinChangeDpRecursive {

	public static void main(String[] args) {
		int[] coins = { 1, 2, 5 };
		int sum = 11;
		System.out.println("Number of coins needed : " + getNumberOfCoins(coins, sum));
		int coins1[] = { 186, 419, 83, 408 };
		int sum1 = 6249; // output : 20
		System.out.println("Number of coins needed : " + getNumberOfCoins(coins1, sum1));
	}

	public static int getNumberOfCoins(int[] coins, int amount) {
		if (amount < 1)
			return 0;
		return coinChange(coins, amount, new int[amount]);
	}

	private static int coinChange(int[] coins, int rem, int[] count) {
		if (rem < 0)
			return -1;
		if (rem == 0)
			return 0;
		if (count[rem - 1] != 0)
			return count[rem - 1];
		int min = Integer.MAX_VALUE;
		for (int coin : coins) {
			int res = coinChange(coins, rem - coin, count);
			if (res >= 0 && res < min)
				min = 1 + res;
		}
		count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
		return count[rem - 1];
	}
}
