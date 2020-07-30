package com.epam.algo.ds.array;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 
 */

/**
 * @author Akansh_Rai
 *
 */
public class NthLargestElemt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 12, 4, 8, 6, 9 };
		System.out.println(2 + "nd largest elemt : " + findNthLargestElemt(arr, 2));
	}

	private static int findNthLargestElemt(int[] arr, int size) {
		// Comparator<Integer> comp = (i, j) -> j - i;
		// PriorityQueue<Integer> queue = new PriorityQueue<>(comp);

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i : arr) {
			minHeap.add(i);
			if (minHeap.size() > size) {
				minHeap.remove();
			}

		}
		return minHeap.peek();
	}

}
