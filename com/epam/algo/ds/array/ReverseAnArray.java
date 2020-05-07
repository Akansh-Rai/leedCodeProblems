/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class ReverseAnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}

		for (int k : arr) {
			System.out.print(" " + k);
		}
	}

}
