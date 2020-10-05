/**
 * 
 */
package com.epam.algo.ds.dynprog;

/**
 * @author Akansh_Rai
 *
 */
public class LongestCommonSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Longest Common Substring Length : " + findLongestCommonSubString("abcdaf", "zbcdf"));
		
		System.out.println("Longest Common Substring Length : " + findLongestCommonSubString("GeeksforGeeks", "GeeksQuiz"));
	}

	private static int findLongestCommonSubString(String input1, String input2) {
		if (input1 == null || input2 == null || input1.length() == 0 | input2.length() == 0)
			return 0;

		int len1 = input1.length() + 1;
		int len2 = input2.length() + 1;

		int dp[][] = new int[len1][len2];
		int result = 0;
		for (int i = 1; i < len1; i++) {
			for (int j = 1; j < len2; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if (input1.charAt(i - 1) == input2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
					result = Math.max(result, dp[i][j]);
				} else {
					dp[i][j] = 0;
				}
			}

		}

		return result;
	}

}
