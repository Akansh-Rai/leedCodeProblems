/**
 * 
 */
package com.epam.algo.ds.heap;

import java.util.PriorityQueue;
import java.util.Queue;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @author Akansh_Rai
 *
 */
public class MedianQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Integer> heap = new PriorityQueue<Integer>((o1, o2) -> o1 - o2);
		heap.add(6);
		heap.add(3);
		heap.add(8);
		heap.add(4);
		
		heap.forEach(System.out::print);

	}

}
