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
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        if(lheight==-1 || rheight==-1){
            return -1;
        }
        if(Math.abs(lheight-rheight)>1){
            return -1;
        }
        return Math.max(lheight,rheight)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
}