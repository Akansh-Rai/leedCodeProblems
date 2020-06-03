/**
 * 
 */
package com.epam.algo.ds.dynprog;

/**
 * @author Akansh_Rai Given a m x n grid filled with non-negative numbers, find
 *         a path from top left to bottom right which minimizes the sum of all
 *         numbers along its path.
 * 
 *         Note: You can only move either down or right at any point in time.
 *         Example:
 * 
 *         Input: [ [1,3,1], [1,5,1], [4,2,1]]
 * 
 *         Output: 7
 */
public class MinimumPathSumDp {

	public static void main(String[] args) {
		//int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		//System.out.println(minPathSum(grid));
		int[][] grid1 = {{1,2,5},{3,2,1}};
		System.out.println(minPathSum(grid1));
	}

	public static int minPathSum(int[][] grid) {
		int rows = grid.length;
		if (rows == 0)
			return 0;

		int cols = grid[0].length;
		int dp[][] = new int[rows][cols];

		dp[0][0] = grid[0][0];

		// fill values in first row
		for (int i = 1; i < cols; i++) {
			dp[0][i] = dp[0][i - 1] + grid[0][i];
		}

		// fill values in first column
		for (int i = 1; i < rows; i++) {
			dp[i][0] = dp[i - 1][0] + grid[i][0];
		}
		
		//now fill rest of the column
		for(int i=1; i < rows; i++) {
			for(int j = 1; j < cols; j++) {
				dp[i][j] = Math.min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
			}
		}

		return dp[rows - 1][cols - 1];
	}

}
