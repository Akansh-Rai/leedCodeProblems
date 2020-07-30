/**
 * 
 */
package com.epam.algo.ds.linkedList;

/**
 * @author Akansh_Rai
 *
 */
public class Node<E> {

	private int val;

	private Node next;

	public Node(int val) {
		this.val = val;
		this.next = next;
	}

	/*
	 * public Node(int val, Node next) { this.val = val; this.next = next; }
	 */

	/**
	 * @return the val
	 */
	public int getVal() {
		return val;
	}

	/**
	 * @param val
	 *            the val to set
	 */
	public void setVal(int val) {
		this.val = val;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}

}
