/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class MergeSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 0, 0, 0 };
		int n = 3;
		int[] arr2 = { 2, 5, 6 };
		int m = 3;
		MergeSortedArray(arr1, n, arr2, m);
		print(arr1);
		int input1[] = { 0 };
		n = 0;
		int input2[] = { 1 };
		m = 1;
		MergeSortedArray(input1, n, input2, m);
		print(input1);
	}

	public static void MergeSortedArray(int[] arr1, int n, int[] arr2, int m) {
		int lastIndex = n + m - 1;
		while (lastIndex >= 0 && n > 0 && m > 0) {
			if (arr1[n - 1] >= arr2[m - 1]) {
				arr1[lastIndex--] = arr1[n - 1];
				n--;
			} else {
				arr1[lastIndex--] = arr2[m - 1];
				m--;
			}
		} // end
		if (n== 0 && m == 0) return;
		if(n==0) {
			while(m>0) {
				arr1[lastIndex--] = arr2[m - 1];
				m--;
			}
		} else {
			arr1[lastIndex--] = arr1[n - 1];
			n--;
		}
	}

	private static void print(int[] arr1) {
		for (int val : arr1) {
			System.out.print(" " + val);
		}
	}

}
