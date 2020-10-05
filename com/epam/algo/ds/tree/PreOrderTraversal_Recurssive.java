/**
 * 
 */
package com.epam.algo.ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akansh_Rai
 *         https://leetcode.com/problems/binary-tree-preorder-traversal
 */
public class PreOrderTraversal_Recurssive {
	public List<Integer> preorderTraversal(TreeNode<Integer> root) {
		return preorderTraversal(root, new ArrayList<Integer>());
	}

	public List<Integer> preorderTraversal(TreeNode<Integer> root, List<Integer> result) {
		if (root == null)
			return result;
		result.add(root.val);
		preorderTraversal(root.left, result);
		preorderTraversal(root.right, result);
		return result;
	}
}
