package com.epam.algo.ds.array;
/**
 * 
 */

/**
 * @author Akansh_Rai
 *
 */
public class FindElementInRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 4, 5, 7, 8, 1, 2 };

		if (find(arr, 2)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}

	private static boolean find(int[] arr, int x) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == x) {
				return true;
			} else if (arr[left] <= arr[mid]) {
				if (x > arr[left] && arr[mid] < x) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (arr[mid] <= x && x <= arr[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}

		return false;
	}

}
