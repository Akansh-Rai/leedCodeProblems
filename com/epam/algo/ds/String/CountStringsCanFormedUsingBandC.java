/**
 * 
 */
package com.epam.algo.ds.String;

/**
 * @author Akansh_Rai
 *
 */
public class CountStringsCanFormedUsingBandC {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(countStr(n, 1, 2));
	}

	private static int countStr(int n, int bCount, int cCount) {
		if (bCount < 0 || cCount < 0) return 0;
		if (n == 0) return 1;
		if (bCount == 0 && cCount == 0) return 1;

		int res = countStr(n - 1, bCount, cCount);
		res += countStr(n - 1, bCount - 1, cCount);
		res += countStr(n - 1, bCount, cCount - 1);

		return res;
	}

}
