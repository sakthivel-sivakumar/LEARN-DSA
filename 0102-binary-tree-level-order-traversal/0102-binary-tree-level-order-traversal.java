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
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode>queue = new LinkedList<TreeNode>();

        if(root == null)
            return result;

        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int level = queue.size();
            List<Integer> subList = new ArrayList<Integer>();

            for(int i=0;i<level;i++)
            {
                if(queue.peek().left != null)
                queue.add(queue.peek().left);

                if(queue.peek().right != null)
                    queue.add(queue.peek().right);

                subList.add(queue.poll().val);
            }
            result.add(subList);
        }
        return result;
    }
}