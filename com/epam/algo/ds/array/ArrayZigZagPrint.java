/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai https://www.youtube.com/watch?v=bgx1eAgBgaQ
 *
 */
public class ArrayZigZagPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 3, 4, 6, 2, 1, 8, 9 };
		arr = getZigZag(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

	private static int[] getZigZag(int[] arr) {
		boolean flag = false;
		int i = 0;
		while (i < arr.length - 1) {
			if (flag) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			} else {
				if (arr[i] < arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
			flag = !flag;
			i++;
		} // end while
		return arr;
	}

	private static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

}
