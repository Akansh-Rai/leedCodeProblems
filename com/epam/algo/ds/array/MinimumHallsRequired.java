/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class MinimumHallsRequired {
	
	static int MAX = 100001; 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int lectures[][] = { { 0, 5 }, { 1, 2 }, { 1, 10 } };
		int n = lectures.length;

		System.out.println(minHalls(lectures, n));
	}

	private static int minHalls(int[][] lectures, int n) {
		int[] prefix_sum = new int[MAX];

		for (int i = 0; i < n; i++) {
			prefix_sum[lectures[i][0]]++;
			prefix_sum[lectures[i][1] + 1]--;
		}

		int ans = prefix_sum[0];

		for (int i = 1; i < MAX; i++) {
			prefix_sum[i] += prefix_sum[i - 1];
			ans = Math.max(ans, prefix_sum[i]);
		}
		return ans;
	}

}
