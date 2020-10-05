/**
 * 
 */
package com.epam.algo.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Akansh_Rai
 * https://leetcode.com/problems/binary-tree-preorder-traversal
 */
public class PreOrderTraversal_Iterative {
	public List<Integer> preorderTraversal(TreeNode<Integer> root) {
		Stack<TreeNode<Integer>> stack = new Stack<>();
		List<Integer> result = new ArrayList<>();

		if (root != null)
			stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode<Integer> node = stack.pop();
			result.add(node.val);
			if (node.right != null)
				stack.push(node.right);
			if (node.left != null)
				stack.push(node.left);
		}
		return result;
	}
}
