/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 *         https://leetcode.com/problems/rotate-array/
 *
 */
public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		printArray("input : ", arr);
		rotate(arr, 3);
		printArray("Output : ", arr);
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(arr1, 6);
		printArray("Output : ", arr1);
	}

	public static void rotate(int[] arr, int k) {
		if (k == 0 || arr.length <= 1)
			return;

		k = k % arr.length;
		int len = arr.length;

		reverse(arr, 0, len - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, len - 1);

	}

	public static void reverse(int[] arr, int left, int right) {
		while (left <= right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	private static void printArray(String string, int[] arr) {
		System.out.println("\n" + string);
		for (int val : arr) {
			System.out.print(" " + val);
		}

	}
}
