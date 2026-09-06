/**
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

class Solution {
    public static TreeNode ans = null; // global variable
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ans = null;
        helper(root, p, q);
        return ans;
    }

    public int helper(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return 0;

        int left = helper(root.left, p, q);
        int right = helper(root.right, p, q);
        int self = 0;
        if(root == p || root == q) self = 1;
        int total = left + self + right;
        if(total == 2 && ans == null) ans = root;
        return total;
    }
}
