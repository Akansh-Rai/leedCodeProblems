package com.epam.algo.ds.array;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 
 * @author Akansh_Rai https://leetcode.com/problems/last-stone-weight
 */
class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		if (stones.length == 0) return 0;

		PriorityQueue<Integer> heap = new PriorityQueue<>(stones.length, Collections.reverseOrder());

		for (int weight : stones) {
			heap.add(weight);
		}

		while (heap.size() > 1) {
			int first = heap.remove();
			int second = heap.remove();
			int remain = Math.abs(first - second);
			if (remain != 0) heap.add(remain);
		}

		return heap.isEmpty() ? 0 : heap.remove();
	}
}