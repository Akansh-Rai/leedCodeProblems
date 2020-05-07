/**
 * 
 */
package com.epam.algo.ds.dynprog;

/**
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/maximum-length-of-repeated-subarray/
 *
 */
public class MaxLengthOfRepeatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 2, 1 };
		int arr2[] = { 3, 2, 1, 4, 7 };
		System.out.println(findLength(arr1, arr2));
	}

	public static int findLength(int[] A, int[] B) {
		int ans = 0;
		int[][] memo = new int[A.length + 1][B.length + 1];
		for (int i = A.length - 1; i >= 0; --i) {
			for (int j = B.length - 1; j >= 0; --j) {
				if (A[i] == B[j]) {
					memo[i][j] = memo[i + 1][j + 1] + 1;
					if (ans < memo[i][j])
						ans = memo[i][j];
				}
			}
		}
		return ans;
	}

}
