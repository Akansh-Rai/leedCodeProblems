/**
 * 
 */
package com.epam.algo.ds.tree;

/**
 * @author Akansh_Rai
 * 
 * https://www.youtube.com/watch?v=BR0Z9DhKzLM
 *
 */
public class LongestConsecutiveSequenceBT {

	public int findLongestConsecutiveSequenceBT(TreeNode<Integer> root) {
		if (root == null)
			return 0;
		int result = 0;
		findLongestConsecutiveSequenceBT(root, 0, root.val, 0);
		return result;
	}

	private void findLongestConsecutiveSequenceBT(TreeNode<Integer> root, int result, int expectedVal, int curCount) {
		if (root == null)
			return;

		if (root.val == expectedVal)
			curCount++;
		else
			curCount = 1;

		result = Math.max(result, curCount);

		findLongestConsecutiveSequenceBT(root.left, result, root.val + 1, curCount);
		findLongestConsecutiveSequenceBT(root.right, result, root.val + 1, curCount);

	}

}
