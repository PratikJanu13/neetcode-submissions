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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue <TreeNode> q = new ArrayDeque<>();
        if(root == null) return res;

        q.offer(root);
        

        while(!q.isEmpty()){
            int lvl_size = q.size();
            List<Integer> temp = new ArrayList<>();

            while(lvl_size != 0){
                TreeNode t = q.peek();
                q.poll();
                temp.add(t.val);

                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);

                lvl_size--;
            }
            res.add(temp);
        }
        return res;
    }
}
