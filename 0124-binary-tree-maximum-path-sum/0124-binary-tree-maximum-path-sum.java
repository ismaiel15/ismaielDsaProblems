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
    int maxi = Integer.MIN_VALUE;
    public int max(TreeNode root){
        if(root==null){
            return 0;
        }
        int lsum = max(root.left);
        int rsum = max(root.right);
        maxi = Math.max(root.val + Math.max(0, lsum) + Math.max(0, rsum), maxi);
        return root.val+Math.max(0,Math.max(lsum,rsum));
    }
    public int maxPathSum(TreeNode root) {
        maxi = Integer.MIN_VALUE;
        max(root);
        return maxi;
    }
}