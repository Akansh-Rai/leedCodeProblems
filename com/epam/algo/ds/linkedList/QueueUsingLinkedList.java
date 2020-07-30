/**list
 * 
 */
package com.epam.algo.ds.linkedList;

import java.util.LinkedList;

/**
 * @author Akansh_Rai
 *
 */
public class QueueUsingLinkedList<E> {
	private int size;
	private int currentSize;
	private LinkedList<E> list;
	
	public QueueUsingLinkedList(int size) {
		this.size = size;
		this.currentSize = 0;
		list = new LinkedList<>();
	}
	
	public void add(E e) {
		if(list.size() == this.size) {
			System.out.println("Queue is full.");
		} else {
			list.add(e);
		}
	}
	
	public int size() {
		return list.size();
	}
	
	public E poll() throws Exception {
		if(!list.isEmpty()) {
			return list.poll();
		} else {
			System.out.println("Queue is empty");
			throw new Exception("Queue is empty");
		}		
	}

	public static void main(String[] ar) {
		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>(4);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		try {
			System.out.println("Size : " + queue.size());
			System.out.println(" Get " + queue.poll());
			System.out.println("Get " + queue.poll());
			queue.add(4);
			queue.add(5);
			queue.add(6);
			queue.add(7);
			queue.add(8);
			System.out.println("Get  : " + queue.poll());
			System.out.println("Size : " + queue.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
