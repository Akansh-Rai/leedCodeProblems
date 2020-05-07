/**
 * 
 */
package com.epam.algo.ds.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author Akansh_Rai
 * 
 *         https://leetcode.com/problems/task-scheduler/
 *
 */
public class TaskScheduler {

	public static void main(String[] args) {
		char jobs[] = { 'A', 'A', 'A','A','A','A', 'B', 'C', 'D', 'E' };
		System.out.println(leastInterval(jobs, 2));
	}

	public static int leastInterval(char[] tasks, int n) {
		int[] map = new int[26];
		for (char c : tasks)
			map[c - 'A']++;
		
		PriorityQueue<Integer> frequency = new PriorityQueue<>(26, Collections.reverseOrder());
		/* create Priority Queue of frequency. */
		for (int freq : map) {
			if (freq > 0)
				frequency.add(freq);
		}
		
		int result = 0;
		while (!frequency.isEmpty()) {
			int i = 0;
			List<Integer> remainingFrequency = new ArrayList<>();
			while (i <= n) { //check for interval
				if (!frequency.isEmpty()) {
					if (frequency.peek() > 1)
						remainingFrequency.add(frequency.poll() - 1);
					else
						frequency.poll();
				}
				result++;
				if (frequency.isEmpty() && remainingFrequency.size() == 0)
					break;
				i++;
			}
			
			for (int l : remainingFrequency)
				frequency.add(l);
		}
		return result;
	}

}
