/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * https://www.geeksforgeeks.org/largest-sum-subarray-least-k-numbers/
 */
public class LargestSumSubarrayLeastKNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -10, -3, 8, -9, 2 };
		int k = 4;
		System.out.println(maxSumWithK(arr, arr.length, k));

	}

	private static int maxSumWithK(int[] arr, int n, int k) {
		// maxSum[i] is going to store maximum sum
		// till index i such that a[i] is part of the
		// sum.
		int maxSum[] = new int[n];
		maxSum[0] = arr[0];

		// We use Kadane's algorithm to fill maxSum[]
		// Below code is taken from method 3 of
		// https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
		int curr_max = arr[0];
		for (int i = 1; i < n; i++) {
			curr_max = Math.max(arr[i], curr_max + arr[i]);
			maxSum[i] = curr_max;
		}

		// Sum of first k elements
		int sum = 0;
		for (int i = 0; i < k; i++)
			sum += arr[i];

		// Use the concept of sliding window
		int result = sum;
		for (int i = k; i < n; i++) {
			// Compute sum of k elements ending
			// with a[i].
			sum = sum + arr[i] - arr[i - k];

			// Update result if required
			result = Math.max(result, sum);

			// Include maximum sum till [i-k] also
			// if it increases overall max.
			result = Math.max(result, sum + maxSum[i - k]);
		}
		return result;
	}

}
