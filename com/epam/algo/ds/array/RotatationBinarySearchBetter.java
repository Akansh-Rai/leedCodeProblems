package com.epam.algo.ds.array;
import javax.swing.text.AbstractDocument.LeafElement;

/**
 * 
 */

/**
 * @author Akansh_Rai
 *
 */
public class RotatationBinarySearchBetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 0, 1, 2, 3 };
		int x = 2;
		boolean found = false;

		if (findElemet(arr, x) >= 0)
			System.out.println("Found");
		else
			System.out.println("Not Found");

	}

	private static int findElemet(int[] arr, int x) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == x)
				return mid;
			else if (arr[left] <= arr[mid]) {
				if (x < arr[mid] && x > arr[left]) {
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
		return -1;
	}

}
