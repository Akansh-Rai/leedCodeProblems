/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.PriorityQueue;

import javax.management.Query;

/**
 * @author Akansh_Rai
 * 
 *         https://www.geeksforgeeks.org/kth-smallestlargest-element-unsorted-array/
 * 
 * 
 *
 */
public class NthLargestElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 7, 10, 4, 3, 20, 15 };
		System.out.println(" Nth Largest Element In Array " + NthLargestElementInArray(arr, 2));

	}

	private static int NthLargestElementInArray(int[] arr, int k) {

		PriorityQueue<Integer> q = new PriorityQueue<>();

		for (int num : arr) {
			q.offer(num);
			if (q.size() > k)
				q.remove();
		}

		return q.remove();
	}

}
