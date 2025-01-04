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
    public List<Double> averageOfLevels(TreeNode root) 
    {
        List<Double> result = new ArrayList<>();
        Queue<TreeNode>queue = new LinkedList<>();

        if(root == null)
            return result;

        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int level = queue.size();
            double sum = 0;
            for(int i=0;i<level;i++)
            {
                TreeNode node = queue.peek();
                sum = sum + node.val; 

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);

                queue.poll();  
            }
            result.add((double)sum/level);
        }
        return result;
    }
}