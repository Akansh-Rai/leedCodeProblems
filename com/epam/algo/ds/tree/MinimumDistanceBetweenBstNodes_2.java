/**
 * 
 */
package com.epam.algo.ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akansh_Rai
 *
 */
public class MinimumDistanceBetweenBstNodes_2 {

	List<Integer> in = new ArrayList<Integer>();

	public int minDiffInBST(TreeNode<Integer> root) {
		inOrder(root);
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < in.size(); i++) {
			// System.out.println(i-1 + " : " + in.get(i-1) );
			min = Math.min(min, in.get(i) - in.get(i - 1));
		}
		return min;
	}

	private void inOrder(TreeNode<Integer> root) {
		if (root == null)
			return;
		inOrder(root.left);
		// System.out.println(root.val);
		in.add(root.val);
		inOrder(root.right);
	}

}
