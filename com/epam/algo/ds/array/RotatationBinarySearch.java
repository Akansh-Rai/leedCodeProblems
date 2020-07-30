package com.epam.algo.ds.array;
import javax.swing.text.AbstractDocument.LeafElement;

/**
 * 
 */

/**
 * @author Akansh_Rai
 *
 */
public class RotatationBinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 0, 1, 2, 3 };
		int x = 2;
		boolean found = false;
		if (arr[0] > arr[arr.length - 1]) {
			int index = findStartIndex(arr);
			System.out.println("index : " + index);
			if (x == arr[index])
				found = true;

			if (arr[0] < x && x < arr[index]) {
				found = binarySearch(arr, x, 0, index);
			} else {
				found = binarySearch(arr, x, index + 1, arr.length - 1);
			}
		} else {
			found = binarySearch(arr, x, 0, arr.length - 1);
		}

		if (found)
			System.out.println("Found");
		else
			System.out.println("Not Found");

	}

	private static boolean binarySearch(int[] arr, int x, int i, int j) {
		if (arr[i] == x || arr[j] == x)
			return true;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (arr[mid] == x)
				return true;
			if (arr[mid] < x)
				i = mid + 1;
			else
				j = mid - 1;
		}
		return false;
	}

	private static int findStartIndex(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid + 1]) {
				return mid;
			} else if (arr[left] < arr[mid]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return -1;
	}

}
