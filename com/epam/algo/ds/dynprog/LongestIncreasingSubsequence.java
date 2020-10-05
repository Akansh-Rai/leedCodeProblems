/**
 * 
 */
package com.epam.algo.ds.dynprog;

import java.util.Arrays;

/**
 * @author Akansh_Rai
 * 
 *         https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/
 *
 */
public class LongestIncreasingSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 3, 4, -1, 0, 6, 2, 3 };

		System.out.println(" Longest Increasing Subsequence : " + longestIncreasingSubsequence(arr));

	}

	public static int longestIncreasingSubsequence(int[] arr) {
		int len = arr.length;

		if (len == 0)
			return 0;

		int buffer[] = new int[len];
		Arrays.fill(buffer, 1);
		int right = 1;

		while (right < arr.length) {
			int left = 0;
			while (left < right) {
				if (arr[left] < arr[right]) {
					buffer[right] = Math.max(buffer[right], buffer[left] + 1);
				}
				left++;
			}
			right++;
		}

		int result = buffer[0];
		right = 1;
		while (right < len) {
			result = Math.max(result, buffer[right++]);
		}
		return result;
	}

}
