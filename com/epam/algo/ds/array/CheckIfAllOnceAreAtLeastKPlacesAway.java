/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *         https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
 *         Given an array nums of 0s and 1s and an integer k, return True if all
 *         1's are at least k places away from each other, otherwise return
 *         False.
 * 
 *         Input: nums = [1,0,0,0,1,0,0,1], k = 2 Output: true Explanation: Each
 *         of the 1s are at least 2 places away from each other.
 *
 */
public class CheckIfAllOnceAreAtLeastKPlacesAway {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 0, 1, 0, 0, 1 };
		int k = 2;
		if (kLengthApart(arr, k)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	public static boolean kLengthApart(int[] arr, int k) {
		if (k == 0)
			return true;
		int len = arr.length;

		int i = 0;
		while (i < len) {
			if (arr[i] != 1) {
				i++;
				continue;
			}
			// if 1 exist in array
			i++;// increment the index
			int j = i + k;
			while (i < j && i < len) {
				if (arr[i] == 1)
					return false;
				i++;
			}
		}

		return true;
	}
}
