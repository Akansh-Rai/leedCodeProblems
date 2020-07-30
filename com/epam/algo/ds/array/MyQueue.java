/**
 * 
 */
package com.epam.algo.ds.array;

/**
 * @author Akansh_Rai
 *
 */
public class MyQueue {

	private int size;
	int left;
	int right;
	int arr[];

	private MyQueue() {
	}

	public MyQueue(int size) {
		this.size = size;
		left = 0;
		right = 0;
		arr = new int[size];
	}

	public void add(int elemt) {
		if (isEmpty()) {
			right = right + 1;
		   // left = 0;
		 }
		else if (left == (right + 1) % size) {
			System.out.println("Cant Add Queue is full");
			return;
		} else {
			right = (right + 1) % size;
		}
		arr[right] = elemt;
	}

	public int get() {
		if (isEmpty()) {
			System.out.print("Queue is empty");
			return -1;
		}
		return arr[++left];
	}

	public int size() {
		if(left == -1 && right == -1) {
			return 0;
		}else if (left == -1) {
			return right+1;
		}
		return (right + left + 2) % size;
	}

	public boolean isEmpty() {
		if (right == left) {
			right = left = -1;
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		MyQueue queue = new MyQueue(5);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println("Size : " + queue.size());
		System.out.println("Get : " + queue.get());
		System.out.println("Get : " + queue.get());
		System.out.println("Size : " + queue.size());
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
	}

}
