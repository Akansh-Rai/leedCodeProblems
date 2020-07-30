/**
* 
*/
package com.epam.algo.ds.tree;

/**
 * @author Akansh_Rai https://leetcode.com/problems/subtree-of-another-tree
 */
public class SubTree {
	public boolean isSubtree(TreeNode p, TreeNode q) {
		if (q == null)
			return true;
		if (p == null)
			return false;

		if (isIdentical(p, q))
			return true;

		return isSubtree(p.left, q) || isSubtree(p.right, q	);
	}

	private boolean isIdentical(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		return p.val == q.val && isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
	}
}
