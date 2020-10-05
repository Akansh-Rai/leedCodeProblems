/**
 * 
 */
package com.epam.algo.ds.stack;

import java.util.Stack;

/**
 * @author Akansh_Rai
 *
 */
public class ReverseStackRecurssion {

	/**
	 * @param args
	 */
	private static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) {

		stack.push(2);
		stack.push(5);
		stack.push(7);
		stack.forEach(System.out::print);
		reverseStack();
		stack.forEach(System.out::print);
	}

	private static void reverseStack() {
		if (!stack.isEmpty()) {

			int x = stack.pop();
			reverseStack();
			addInButtom(x);
		}
	}

	private static void addInButtom(int x) {
		if (stack.isEmpty())
			stack.push(x);
		else {
			int top = stack.pop();
			addInButtom(x);
			stack.push(top);
		}

	}

}
