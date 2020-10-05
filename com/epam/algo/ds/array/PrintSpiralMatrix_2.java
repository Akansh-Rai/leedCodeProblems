package com.epam.algo.ds.array;
/**
 * 
 */

/**
 * @author Akansh_Rai
 *
 */
public class PrintSpiralMatrix_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 17 } };
		printSpiralMatrix(arr);
	}

	private static void printSpiralMatrix(int[][] arr) {
		int left = 0;
		int right = arr[0].length - 1;
		int top = 0;
		int down = arr.length - 1;

		while (left < right || top < down) {

			for (int i = left; i <= right; i++) {
				System.out.println(" " + arr[left][i]);
			}
			top++;

			for (int i = top; i <= down; i++) {
				System.out.println(" " + arr[i][right]);
			}
			right--;

			if (left < down) {
				for (int i = right; i >= left; i--) {
					System.out.println(" " + arr[down][i]);
				}
				down--;
			}

			if (top < right) {
				for (int i = down; i >= top; i--) {
					System.out.println(" " + arr[i][left]);
				}
				left++;
			}

		}
	}

}
