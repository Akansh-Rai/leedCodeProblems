/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Akansh_Rai
 * 
 *         Needs 2 Queue 1 : Max Queue to store max number 2. Min Queue to store
 *         min number Note : Make sure both queue do not have size difference
 *         more than one
 * 
 *         All above 3 points are crux of the problem
 *
 */
public class MedianOfStreanOfInteger {

	public static void main(String[] args) {
		int[] arr = {  7, 2, 3, 5, 10, 1, 25, 1 };

		System.out.println("Median : " + findMedium(arr));
	}

	public static double findMedium(int arr[]) {
		Queue<Integer> min = new PriorityQueue<Integer>();
		Queue<Integer> max = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);

		for (int cur : arr) {
			if (max.isEmpty() || max.peek() > cur) {
				max.add(cur);
			} else {
				min.add(cur);
			}

			if (max.size() > min.size() + 1) {
				min.add(max.remove());
			} else if (max.size() + 1 < min.size()) {
				max.add(min.remove());
			}
		}
		if (min.size() == max.size()) {
			return (min.peek() + max.peek()) / 2;
		} else if (min.size() > max.size()) {
			return min.peek();
		} else {
			return max.peek();
		}

	}

}
