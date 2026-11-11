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
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lht = lheight(root);
        int rht = rheight(root);

        if(lht == rht){
            return (1<<lht)-1;
        }
        else{
            return (countNodes(root.left)+countNodes(root.right))+1;
        }
    }
    public int lheight(TreeNode root){
        int height = 0;
        while(root!=null){
            root = root.left;
            height++;
        }
        return height;
    }
    public int rheight(TreeNode root){
        int height = 0;
        while(root!=null){
            root = root.right;
            height++;
        }
        return height;
    }
}