/**
 * 
 */
package com.epam.algo.ds.tree;

/**
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/construct-string-from-binary-tree/
 *
 */
public class ConstructStringFromBinaryTree {
	public String tree2str(TreeNode root) {
		if (root == null)
			return "";
		StringBuilder result = new StringBuilder("");
		tree2str(root, result);
		return result.toString();
	}

	private void tree2str(TreeNode root, StringBuilder result) {
		if (root == null)
			return;
		result.append(root.val);
		if (root.left != null || root.right != null) {
			result.append("(");
			tree2str(root.left, result);
			result.append(")");

			if (root.right != null) {
				result.append("(");
				tree2str(root.right, result);
				result.append(")");
			}
		}
	}
}
