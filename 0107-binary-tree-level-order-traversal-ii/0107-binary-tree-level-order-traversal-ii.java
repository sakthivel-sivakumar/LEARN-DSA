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
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
      List<List<Integer>> result = new ArrayList<>();
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
                TreeNode node = queue.peek();
                if(node.left != null)
                queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);

                subList.add(queue.poll().val);
            }
            result.add(0,subList);
        }
        return result;   
    }
}