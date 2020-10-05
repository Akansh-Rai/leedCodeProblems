/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Akansh_Rai
 *
 */
public class SubarraySumEqualsK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 3, 4, 7, 2, -3, 1, 4, 2 };
		int k = 7;
		System.out.println(SubarraySumEqualsK(arr, k));
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 1, 23, 21, 3, 1, 2, 1, 1, 1, 1, 1, 12, 2, 3, 2, 3, 2, 2 };
		k = 42;
		System.out.println(SubarraySumEqualsK(arr1, k));
		int nums[] = { 1, 1, 1 };
		k = 2;
		System.out.println(SubarraySumEqualsK(nums, k));
	}

	private static int SubarraySumEqualsK(int[] nums, int k) {
		Map<Integer, Integer> preSumFreq = new HashMap<>();
		preSumFreq.put(0, 1);

		int count = 0, sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			count += preSumFreq.getOrDefault(sum - k, 0);
			preSumFreq.put(sum, preSumFreq.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

}
