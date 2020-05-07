/**
 * 
 */
package com.epam.algo.ds.heap;

import java.util.PriorityQueue;

/**
 * @author Akansh_Rai
 *
 */
public class DefaultPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> myheap = new PriorityQueue<>();
		myheap.add(1);
		myheap.add(5);
		myheap.add(3);

		
		if(myheap.size() >= 3) myheap.poll();
		myheap.add(4);
		
		for (Integer val : myheap) {
			System.out.println(val);
			
		}
	}
}
