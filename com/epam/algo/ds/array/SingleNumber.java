/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.Arrays;

/**
 * @author Akansh_Rai
 *
 */
public class SingleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 2, 0, 2, 2 };
		System.out.println(findNumber(arr));

	}

	private static int findNumber(int[] nums) {
		Arrays.sort(nums);
		int count = 1;
		int i = 1;
		for (; i < nums.length; i++) {
			if (nums[i] == nums[i - 1] && count < 3)
				count++;
			else if (nums[i] != nums[i - 1] && count == 3) {
				count = 1;
			} else {
				return nums[i-1];
			}
		}

		return nums[i - 1];
	}

}
