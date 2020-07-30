/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Akansh_Rai
 *
 *         https://leetcode.com/problems/3sum/
 */
public class ThreeSum {

	public static void main(String[] args) {
		int arr[] = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(arr).size());
	}

	public static List<List<Integer>> threeSum(int[] arr) {
		if (arr.length == 0)
			return null;
		Arrays.sort(arr);

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < arr.length - 1; i++) {
			int start = i + 1;
			int end = arr.length - 1;
			if (i > 0 && arr[i] == arr[i - 1])
				continue;

			while (start < end) {
				int sum = arr[i] + arr[start] + arr[end];
				if (sum == 0) {
					List<Integer> temp = new ArrayList<>();
					temp.add(arr[i]);
					temp.add(arr[start]);
					temp.add(arr[end]);
					start++;
					end--;

				} else if (sum < 0) {
					start++;
				} else {
					end--;
				}

			} // end while
		}

		return result;
	}

}
