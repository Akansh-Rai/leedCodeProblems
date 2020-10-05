/**
 * 
 */
package com.epam.algo.ds.tree;

/**
 * @author Akansh_Rai
 *
 */
public class IsBST {

	public boolean isBST(TreeNode<Integer> root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private boolean isBST(TreeNode<Integer> root, int min, int max) {
		if (root == null) return true;
		
		if (min > root.val || max < root.val) return false;
		
		return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
	}

}
