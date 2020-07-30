package com.epam.algo.ds.array;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array
 */

class SearchInRotatedSortedArray {
	public static int search(int[] arr, int target) {

		int pivot = findPivot(arr, 0, arr.length - 1);

		if (pivot == -1)
			return binarySearch(arr, 0, arr.length - 1, target);

		if (arr[pivot] == target)
			return pivot;
		else if (arr[0] <= target)
			return binarySearch(arr, 0, pivot - 1, target);
		else
			return binarySearch(arr, pivot + 1, arr.length - 1, target);

	}

	public static int binarySearch(int arr[], int left, int right, int target) {

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target)
				return mid;

			if (arr[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

	public static int findPivot(int arr[], int left, int right) {
		if (right < left)
			return -1;
		if (right == left)
			return left;

		int mid = (right + left) / 2;

		if (mid < right && arr[mid] > arr[mid + 1])
			return mid;
		if (mid > left && arr[mid] < arr[mid - 1])
			return mid - 1;
		
		if (arr[left] >= arr[mid])
			return findPivot(arr, left, mid - 1);
		return findPivot(arr, mid + 1, right);
	}

	public static void main(String[] ar) {
		int[] arr = { 1, 2, 3 };
		System.out.println(search(arr, 1));
	}

}