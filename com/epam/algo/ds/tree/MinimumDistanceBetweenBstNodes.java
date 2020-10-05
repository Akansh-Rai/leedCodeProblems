/**
 * 
 */
package com.epam.algo.ds.tree;

/**
 * @author Akansh_Rai
 *
 */
public class MinimumDistanceBetweenBstNodes {

	int result = Integer.MAX_VALUE;
    int last = Integer.MIN_VALUE;
    
    public int minDiffInBST(TreeNode<Integer> root) {
        if (root == null)
            return 0;
        findMin(root);
        return result;
    }
    
    private void findMin(TreeNode<Integer> root) {
        if(root == null) return;
        findMin(root.left);
        if(last > 0)
           result = Math.min(result, root.val - last);
        last = root.val;
        findMin(root.right);
                          
    }

}
