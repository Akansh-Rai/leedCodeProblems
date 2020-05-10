/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 *         https://leetcode.com/problems/previous-permutation-with-one-swap/
 *
 */
public class PreviousPermutationWithOneSwap {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 1, 3 };
		arr = prevPermOpt1(arr);
		printArray(arr);
	}

	public static int[] prevPermOpt1(int[] arr) {
		// left pointer will move in <= direction
		for (int left = arr.length - 2; left >= 0; left--) {
			int maxVal = -1, maxInd = -1;
			for (int right = left + 1; right < arr.length; right++) {
				// find the largest digit that is smaller than current digit
				if (arr[left] > arr[right] && arr[right] > maxVal) {
					maxVal = arr[right];
					// save the index of the largest digit
					maxInd = right;
				}
			}
			if (maxVal != -1) { // if found - swap between the current and the largest digit to its right
				swap(arr, left, maxInd);
				break; // stop after the first swap
			} // if not - keep moving to the next digit in <= direction
		}
		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(int[] arr) {
		System.out.print("[ ");
		for (int val : arr) {
			System.out.print(val + "  ");
		}
		System.out.print("]");
	}

}
