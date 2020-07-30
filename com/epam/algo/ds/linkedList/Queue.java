/**
 * 
 */
package com.epam.algo.ds.linkedList;

/**
 * @author Akansh_Rai
 *
 */
public class Queue<E> {

	private int size;
	private Node head;
	private Node rear;
	private int currSize;

	public Queue(int size) {
		this.size = size;
		this.currSize = 0;
	}

	public void add(int e) {
		if(isFull()) {
			System.out.println("Cant not add, Queue is full");
			return;
		}
		Node cur = new Node(e);
		if(isEmpty()) {
			head = cur;
			rear = cur;
		} else {
			rear.setNext(cur);
			rear = cur;
		}
		currSize++;
	}

	public int get() {
		if(isEmpty()) {
			throw new NullPointerException();
		}
		Node current = head;
		head = head.getNext();
		return  current.getVal();
	}

	public boolean isEmpty() {
		return (currSize ==0);
	}

	public boolean isFull() {
		return currSize == size;
	}

	public int size() {
		return currSize;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue queue = new Queue(4);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println("Is full " + queue.isFull());
		System.out.println("get : " + queue.get());
		System.out.println("get : " + queue.get());
		queue.add(5);
		queue.add(6);
		System.out.println("Is full " + queue.isFull());
		System.out.println("get : " + queue.get());
		System.out.println("get : " + queue.get());
		
	}

}

