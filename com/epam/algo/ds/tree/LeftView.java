package com.epam.algo.ds.tree;

import java.util.ArrayList;
import java.util.List;

public class LeftView {

	private int max = 0;
	List<Integer> result = new ArrayList<>();

	public List<Integer> rightSideView(TreeNode<Integer> root) {
		rightSideView(root, 1);
		return result;
	}

	public void rightSideView(TreeNode<Integer> root, int curLevel) {
		if (root == null)
			return;
		if (max < curLevel) {
			result.add(root.val);
			max = curLevel;
		}
		rightSideView(root.left, curLevel + 1);
		rightSideView(root.right, curLevel + 1);
	}

}
