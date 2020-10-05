/**
 * 
 */
package com.epam.algo.ds.tree;

/**
 * @author Akansh_Rai
 *
 */
public class TernaryExpressionTree {

	public static void main(String args[]) {
		String exp = "a?b?c:d:e";
		TreeNode tree = new TreeNode();
		char[] expression = exp.toCharArray();
		TreeNode root = convertExpression(expression, 0);
		printTree(root);
	}

	private static TreeNode convertExpression(char[] expression, int i) {
		if (expression.length < i)
			return null;
		TreeNode node = new TreeNode(expression[i++]);

		if (i < expression.length && expression[i] == '?') {
			node.left = convertExpression(expression, i++);
		} else {
			node.right = convertExpression(expression, i++);
		}
		return node;
	}

	private static void printTree(TreeNode<Integer> root) {
		if (root == null)
			return;
		System.out.println(root.val);
		printTree(root.left);
		printTree(root.right);
	}

}
