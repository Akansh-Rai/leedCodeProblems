/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * 
 *         https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
 */

public class ArraySpiral {

	public static void main(String[] args) {
		int rows = 3;
		int cols = 6;
		int arr[][] = { { 1,  2,  3,  4,  5,  6 }, 
				        { 7,  8,  9, 10, 11, 12 },
				        { 13,14, 15, 16, 17, 18 }
				       };
		spiralPrint(arr, rows, cols);
	}

	static void spiralPrint(int arr[][], int rows, int cols) {
		int i, curRow = 0, curCol = 0;

		while (curRow < rows && curCol < cols) {
			for (i = curCol; i < cols; ++i) {
				System.out.print(arr[curRow][i] + " ");
			}
			curRow++;

			for (i = curRow; i < rows; ++i) {
				System.out.print(arr[i][cols - 1] + " ");
			}
			cols--;

			if (curRow < rows) {
				for (i = cols - 1; i >= curCol; --i) {
					System.out.print(arr[rows - 1][i] + " ");
				}
				rows--;
			}

			if (curCol < cols) {
				for (i = rows - 1; i >= curRow; --i) {
					System.out.print(arr[i][curCol] + " ");
				}
				curCol++;
			}

		}
	}

}
