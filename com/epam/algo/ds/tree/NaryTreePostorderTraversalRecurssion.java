/**
 * 
 */
package com.epam.algo.ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 */
public class NaryTreePostorderTraversalRecurssion {
	public List<Integer> postorder(Node root) {
		List<Integer> result = new ArrayList<Integer>();
		postorder(root, result);
		return result;
	}

	private void postorder(Node root, List<Integer> list) {
		if (root == null)
			return;
		for (Node node : root.children) {
			postorder(node, list);
		}
		list.add(root.val);
	}
}
