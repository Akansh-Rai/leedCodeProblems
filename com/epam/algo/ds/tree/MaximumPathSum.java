package com.epam.algo.ds.tree;
/**
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class MaximumPathSum {
	
    int result = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode<Integer> root) {
        maxPathSum(root, 0);
        return result;
    }
    
    public int maxPathSum(TreeNode<Integer> root, int cur) {
    	if (root == null) return 0;
        int left = maxPathSum(root.left, cur);
        int right = maxPathSum(root.right, cur);
        int max = Math.max(Math.max(left,right) + (int)root.val, (int)root.val);
        cur = Math.max((int)root.val + left + right, max);
        result = Math.max(result,cur);
        return max;
    }
}