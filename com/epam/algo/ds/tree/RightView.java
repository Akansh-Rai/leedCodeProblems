package com.epam.algo.ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Akansh_Rai
 * 
 * https://leetcode.com/problems/binary-tree-right-side-view/
 *
 */
public class RightView {

	private int max = 0;
	List<Integer> result = new ArrayList<>();

	public List<Integer> rightSideView(TreeNode root) {
		rightSideView(root, 1);
		return result;
	}

	public void rightSideView(TreeNode root, int curLevel) {
		if (root == null)
			return;
		if (max < curLevel) {
			result.add(root.val);
			max = curLevel;
		}
		rightSideView(root.right, curLevel + 1);
		rightSideView(root.left, curLevel + 1);
	}

}
