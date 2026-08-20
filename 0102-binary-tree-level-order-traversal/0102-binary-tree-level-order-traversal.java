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
            Queue<TreeNode> q = new LinkedList<>();
            if(root != null)
                q.add(root);

             List<List<Integer>> res = new ArrayList<>();

            while(! q.isEmpty())
            {
                
                
                int n = q.size();
                List<Integer> innerList = new ArrayList<>();
                for(int i=1;i<= n;i++){

                    TreeNode first = q.remove();

                    if(first.left != null)
                    q.add(first.left);

                    if(first.right != null)
                        q.add(first.right);
                    
                    innerList.add(first.val);

                }

                res.add(innerList);

                
            }

            //System.out.println(res);


            return res;


















        
    }
}