/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/single-element-in-a-sorted-array
 */
public class SingleElementInASortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		System.out.println("Result : " + singleNonDuplicate(arr));
		int arr1[] = { 3, 3, 7, 7, 10, 11, 11 };
		System.out.println("Result : " + singleNonDuplicate(arr1));
	}

	public static int singleNonDuplicate(int[] arr) {
		if (arr.length == 0)
			return -1;
		if (arr.length == 1)
			return arr[0];

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			if (arr[left] != arr[left + 1])
				return arr[left];
			if (arr[right] != arr[right - 1])
				return arr[right];

			int mid = (right + left) / 2;
			if (mid % 2 == 0) {// if mid is even
				if (arr[mid] == arr[mid + 1]) {
					left = mid + 2;
				} else {
					right = mid;
				}
			} else {// if odd
				if (arr[mid] == arr[mid - 1]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return arr[left];
	}
}
