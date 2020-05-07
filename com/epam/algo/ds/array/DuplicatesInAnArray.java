/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akansh_Rai
 * 
 *         https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * 
 *         Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some
 *         elements appear twice and others appear once. Find all the elements
 *         that appear twice in this array.
 * 
 *         Could you do it without extra space and in O(n) runtime? Example:
 *         Input: [4,3,2,7,8,2,3,1] Output: [2,3]
 *
 */
public class DuplicatesInAnArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> list = findDublicates(arr);
		System.out.println("Elements which are coming exactly twice : " + list.toString());

	}

	private static List<Integer> findDublicates(int[] nums) {
		if (nums.length == 0)
			return new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		int len = nums.length;
		int[] map = new int[len + 1];

		for (int index : nums) {
			map[index] += 1;
		}

		for (int i = 0; i <= len; i++) {
			if (map[i] == 2)
				result.add(i);
		}

		return result;

	}

}
