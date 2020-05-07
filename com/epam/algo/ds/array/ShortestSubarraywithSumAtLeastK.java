/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Akansh_Rai
 * 
 *         https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/
 *         Return the length of the shortest, non-empty, contiguous subarray of
 *         A with sum at least K. If there is no non-empty subarray with sum at
 *         least K, return -1. Example 1: Input: A = [1], K = 1 Output: 1
 *         Example 2: Input: A =[17,85,93,-45,-21] k=150, output 2
 */
public class ShortestSubarraywithSumAtLeastK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * int[] arr = { 17, 85, 93, -45, -21 }; int sum = 150;
		 * System.out.println(shortestSubarray(arr, sum));
		 * 
		 * int[] arr2 = { 1 }; int sum2 = 1; System.out.println(shortestSubarray(arr2,
		 * sum2));
		 */
		int[] arr3 = { 84, -37, 32, 40, 95 };
		int sum3 = 167;
		System.out.println(shortestSubarray(arr3, sum3));
	}

	public static int shortestSubarray(int[] arr, int k) {
		int[] sums = new int[arr.length + 1];
		/* prepare sum array */
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= k)
				return 1;
			sums[i + 1] = sums[i] + arr[i];
		}

		int min = Integer.MAX_VALUE;
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < sums.length; i++) {

			while (!list.isEmpty() && sums[i] - sums[list.getFirst()] >= k) {
				min = Math.min(min, i - list.getFirst());
				list.removeFirst();
			}

			while (!list.isEmpty() && sums[i] <= sums[list.getLast()]) {
				list.removeLast();
			}

			list.addLast(i);
		}
		return min != Integer.MAX_VALUE ? min : -1;
	}
}
