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
		List<List<Integer>> result = new ArrayList<>();

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			// Declare and intialize two indexes
			int start = i + 1;
			int end = arr.length - 1;

			/*
			 * To ignore duplicates, Never consider consecutive indices with same value.
			 */
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}

			while (start < end) {

				// Ignore duplicates
				if (end < arr.length - 1 && arr[end] == arr[end + 1]) {
					end--;
					continue;
				}

				// If triplets is found then put them in a list
				if (arr[i] + arr[start] + arr[end] == 0) {
					List<Integer> val = Arrays.asList(arr[i], arr[start], arr[end]);
					result.add(val);
					start++;
					end--;
				} else if (arr[i] + arr[start] + arr[end] < 0) {
					start++;
				} else {
					end--;
				}
			}
		}

		return result;
	}

}
