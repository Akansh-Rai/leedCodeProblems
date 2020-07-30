/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class NumberOfIslands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[][] grid = { { '1', '1', '1', '1', '0' },
				          { '1', '1', '0', '1', '0' },
				          { '1', '1', '0', '0', '0' },
				          { '0', '0', '0', '0', '0' } };
		System.out.println(numIslands(grid));
	}

	public static int numIslands(char[][] grid) {
		int rows = grid.length;
		if (rows == 0)
			return 0;
		int cols = grid[0].length;
		int result = 0;
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				if (grid[i][j] == '1') {
					markCurrentIsland(grid, i, j, rows, cols);
					result++;
				}
			}
		}
		return result;
	}

	public static void markCurrentIsland(char[][] grid, int i, int j, int rows, int cols) {
		if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != '1')
			return;
		grid[i][j] = '2';
		markCurrentIsland(grid, i + 1, j, rows, cols);// down
		markCurrentIsland(grid, i - 1, j, rows, cols);
		markCurrentIsland(grid, i, j + 1, rows, cols);
		markCurrentIsland(grid, i, j - 1, rows, cols);
	}

}
