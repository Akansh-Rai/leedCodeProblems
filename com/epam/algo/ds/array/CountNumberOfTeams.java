/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * https://leetcode.com/problems/count-number-of-teams/
 * Input: rating = [2,5,3,4,1]  Output: 3
 * 
 * Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1). 
 */
public class CountNumberOfTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 4, 1 };
		System.out.println("Total no of team : " + numTeams(arr));
	}

	public static int numTeams(int[] ratings) {
		int len = ratings.length;
		int[] lowerThan = new int[len];
		int[] higherThan = new int[len];
		int result = 0;
		for (int i = 1; i < len; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (ratings[j] < ratings[i]) {
					result += lowerThan[j];
					lowerThan[i]++;
				}
				if (ratings[j] > ratings[i]) {
					result += higherThan[j];
					higherThan[i]++;
				}
			}
		}
		return result;
	}

}
