/**
 * 
 */
package com.epam.algo.ds.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Akansh_Rai
 *
 */
public class MedianOfIntegerStream {

	Queue<Integer> maxHeap, minHeap;

	public MedianOfIntegerStream() {
		minHeap = new PriorityQueue<Integer>();
		maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
	}

	void add(int num) {
		if (!minHeap.isEmpty() && num < minHeap.peek()) {
			maxHeap.offer(num);
			if (maxHeap.size() > minHeap.size() + 1) {
				minHeap.offer(maxHeap.poll());
			}
		} else {
			minHeap.offer(num);
			if (minHeap.size() > maxHeap.size() + 1) {
				maxHeap.offer(minHeap.poll());
			}
		}

	}

	double getMedian() {
		double median;
		if (maxHeap.size() == minHeap.size()) {
			median = (minHeap.peek() + maxHeap.peek()) / 2;
		} else if (maxHeap.size() > minHeap.size()) {
			median = maxHeap.peek();
		} else {
			median = minHeap.peek();
		}

		return median;
	}

}
