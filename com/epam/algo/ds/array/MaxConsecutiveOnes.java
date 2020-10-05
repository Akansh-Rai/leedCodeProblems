/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 * https://leetcode.com/problems/max-consecutive-ones
 *
 */
public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] arr) {
		if (arr.length == 0)
			return 0;
		int max = 0;
		int curMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				curMax++;
				if (curMax > max) {
					max = curMax;
				}
			} else {
				curMax = 0;
			}
		} // end for
		return max;
	}
}
