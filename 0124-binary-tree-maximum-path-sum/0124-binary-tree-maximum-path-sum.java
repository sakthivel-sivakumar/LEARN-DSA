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
    int res = 0;
    public int maxPathSum(TreeNode r) {
        if(r == null) return 0;
        this.res = r.val;
        dfs(r);
        return res;
    }

    private int dfs(TreeNode r){
        if(r == null) return 0;

        int left = Math.max(dfs(r.left), 0);
        int right = Math.max(dfs(r.right), 0);

        res = Math.max(res, left+right+r.val);

        return Math.max(left, right) + r.val;
    }
}