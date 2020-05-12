/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 *
 */
public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(findMin(arr));
	}

	public static int findMin(int[] arr) {
		if (arr.length == 1)
			return arr[0];

		int left = 0, right = arr.length - 1;

		if (arr[right] > arr[0]) return arr[0];
		

		while (right >= left) {
			int mid = left + (right - left) / 2;

			if (arr[mid] > arr[mid + 1]) {
				return arr[mid + 1];
			}
			if (arr[mid - 1] > arr[mid]) {
				return arr[mid];
			}

			if (arr[mid] > arr[0]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;

	}

}
