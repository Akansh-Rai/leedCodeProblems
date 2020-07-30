/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class PrintSpiralMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		printSpiral(arr);
	}

	private static void printSpiral(int[][] arr) {
		int rows = arr.length;
		if (rows <= 0)
			return;

		int cols = arr[0].length;
		System.out.println("Row " + rows);
		System.out.println("Col " + cols);

		int startRow = 0;
		int startCol = 0;

		while (startCol < cols && startRow < rows) {
			// Print the first row from the remaining rows
			for (int i = startCol; i < cols; ++i) {
				System.out.print(arr[startRow][i] + " ");
			}
			startRow++;
			System.out.println("");
			// Print the last column from the remaining columns
			for (int i = startRow; i < rows; ++i) {
				System.out.print(arr[i][cols - 1] + " ");
			}
			cols--;
			System.out.println("");
			// Print the last row from the remaining rows */
			if (startRow < rows) {
				for (int i = cols - 1; i >= startCol; --i) {
					System.out.print(arr[rows - 1][i] + " ");
				}
				rows--;
			}
			System.out.println("");
			// Print the first column from the remaining columns */
			if (startCol < cols) {
				for (int i = rows - 1; i >= startRow; --i) {
					System.out.print(arr[i][startCol] + " ");
				}
				startCol++;
			}
			System.out.println("");
		}

	}

}
