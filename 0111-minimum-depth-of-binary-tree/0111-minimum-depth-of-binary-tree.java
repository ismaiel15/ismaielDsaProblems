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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left!=null && root.right!=null){
             int lcount = minDepth(root.left);
             int rcount = minDepth(root.right);
             int count = Math.min(lcount,rcount)+1;
        return count;
        }
        else{
            int lcount = minDepth(root.left);
             int rcount = minDepth(root.right);
             int count = Math.max(lcount,rcount)+1;
         return count;
        }
       
    }
}