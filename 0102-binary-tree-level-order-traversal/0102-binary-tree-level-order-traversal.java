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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if(root == null)
            return result;
        
        q.add(root);
        while(!q.isEmpty())
        {
            int lvl = q.size();
            List<Integer> sublvl = new ArrayList<>();
            for(int i=1;i<=lvl;i++)
            {
                TreeNode x = q.peek();

                if(x.left!=null)
                    q.add(x.left);

                if(x.right!=null)
                    q.add(x.right);
                
                sublvl.add(q.poll().val);
            }
            result.add(sublvl);
        }
        return result;
    }
}