/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class kthSmallestElementInBST {
    public int kthSmallest(TreeNode root, int k) {
    
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        
        while (k != 0) {
            TreeNode cur = stack.pop();
            k--;
            if (k ==0)
                return cur.val;
            
            else {
                TreeNode right = cur.right;
                while (right != null) {
                    stack.push(right);
                    right = right.left;
                }
            }
        }
        return -1;
    }    
}