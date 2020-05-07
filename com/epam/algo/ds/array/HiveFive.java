/**
 * 
 */
package com.epam.algo.ds.array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Akansh_Rai
 * 
 *        https://leetcode.com/problems/high-five/
 * 
 *         Given a list of scores of different students, return the average
 *         score of each student's top five scores in the order of each
 *         student's id. Each entry items{i} has items{i}{0} the student's id,
 *         and items{i}{1} the student's score. The average score is calculated
 *         using integer division.
 *
 *         Input:
 *                {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}}
 *         Output: {{1,87},{2,88}} Explanation: The average of the student with
 *         id = 1 is 87. The average of the student with id = 2 is 88.6. But
 *         with integer division their average converts to 88.
 */
public class HiveFive {

	public static void main(String[] args) {

		int[][] arr = { { 1, 91 }, { 1, 92 }, { 2, 93 }, { 2, 97 }, { 1, 60 }, { 2, 77 }, { 1, 65 }, { 1, 87 },
				{ 1, 100 }, { 2, 100 }, { 2, 76 } };
		int TOP_SCORE_THRESHOLD = 5;
		
		Map<Integer, PriorityQueue<Integer>> myMap = new HashMap<Integer, PriorityQueue<Integer>>();
		for (int i = 0; i < arr.length; i++) {
			int id = arr[i][0];
			int mark = arr[i][1];
			PriorityQueue<Integer> queue = null;
			
			if(myMap.containsKey(id)) {
				queue = myMap.get(id);
				if(queue.size()>=TOP_SCORE_THRESHOLD) queue.remove();
			} else {
				queue = new PriorityQueue<>();
			}
			
			queue.offer(mark);
			myMap.put(id, queue);
		}// end for
		
		for (Map.Entry<Integer, PriorityQueue<Integer>> entry : myMap.entrySet()) {
			int id = entry.getKey();
			PriorityQueue<Integer> queue = entry.getValue();
			int sum = 0;
			for(Integer val :queue) {
				sum += val;
			}
			System.out.println("[ " + id + " , " + sum/5 +"]");
		}
		
	}

}
