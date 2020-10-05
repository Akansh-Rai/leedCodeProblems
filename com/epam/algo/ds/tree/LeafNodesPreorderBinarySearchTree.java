/**
 * 
 */
package com.epam.algo.ds.tree;

import java.util.Stack;

/**
 * @author Akansh_Rai
 *         https://www.geeksforgeeks.org/leaf-nodes-preorder-binary-search-tree/
 */
public class LeafNodesPreorderBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int preorder[] = { 890, 325, 290, 530, 965 };
		int n = preorder.length;

		leafNode(preorder, n);
	}

	private static void leafNode(int[] preorder, int n) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0, j = 1; j < n; i++, j++) {
			boolean found = false;

			if (preorder[i] > preorder[j])
				s.push(preorder[i]);

			else {
				while (!s.isEmpty()) {
					if (preorder[j] > s.peek()) {
						s.pop();
						found = true;
					} else
						break;
				}
			}

			if (found)
				System.out.print(preorder[i] + " ");
		}

		// Since rightmost element is always leaf node.
		System.out.println(preorder[n - 1]);

	}

}
