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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Stack<Pair<TreeNode, Integer>> st = new Stack<>();
        st.push(new Pair<>(root, 1));
        int maxDepth = 0;

        while(!st.isEmpty()){
            Pair<TreeNode, Integer> current = st.pop();
            TreeNode node = current.getKey(); 
            int depth = current.getValue();

            if(node != null){
                maxDepth = Math.max(maxDepth, depth);

                st.push(new Pair<>(node.left, depth+1));
                st.push(new Pair<>(node.right, depth+1));
            }
        }
        return maxDepth;
    }
}
