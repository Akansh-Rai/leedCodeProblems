/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 *         Given an integer “N”, create an array such that each value is
 *         repeated twice (For example, 4 = 1, 1, 2, 2, 3, 3, 4, 4)
 * 
 */
public class CreateArray {

	public static void main(String[] args) {
		int n = 4;
		int count = 1;

		int arr[] = new int[n * 2];
		int i = 0;
		while (n-- > 0) {
			arr[i++] = count;
			arr[i++] = count++;
		}

		for (int val : arr) {
			System.out.print(" " + val);
		}
	}

}
