/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 *         https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/
 */
public class MinimumLengthSubarraySumGreaterGivenValue {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 45, 6, 10, 19 };
		int x = 51;
		System.out.println(smallestSubWithSum(arr1, x));
	}

	private static int smallestSubWithSum(int[] arr, int x) {
		int minLen = arr.length + 1;
		int sum = 0;
		int left = 0;
		int right = 0;
		while (right < arr.length) {
			while (sum <= x && right < arr.length) {
				sum += arr[right++];
			}

			while (sum > x && left < arr.length) {
				if (right - left < minLen)
					minLen = right - left;
				sum -= arr[left++];
			}
		}
		return minLen;
	}

}
