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
class Solution 
{
    public int maxDepth(TreeNode root,int level)
    {
        if(root == null)
            return level;
        return Math.max(maxDepth(root.left,level+1),maxDepth(root.right,level+1));
        
    }
    public int maxDepth(TreeNode root) 
    {
        if(root == null)
            return 0;
        return maxDepth(root,0); 
    }
}