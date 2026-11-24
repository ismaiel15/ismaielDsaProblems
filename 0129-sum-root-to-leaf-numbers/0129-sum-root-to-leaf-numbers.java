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
    public int calculateSum(List<Integer> path){
        int val = 0;
        for(int i=0; i<path.size(); i++){
            val = val*10+path.get(i);
        }
       return val;
    }
    public int sumNumbersHelp(TreeNode root,List<Integer>path){
        if(root==null){
            return 0;
        }
        path.add(root.val);
        if(root.left == null && root.right == null){
            int sum = calculateSum(path);
            path.remove(path.size() - 1);
             return sum;
        }
        int leftSum = sumNumbersHelp(root.left,path);
        int rightSum =  sumNumbersHelp(root.right,path);
        path.remove(path.size()-1);
        return leftSum+rightSum;
    }

    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        List <Integer> path = new ArrayList<>();
        return sumNumbersHelp(root,path);
    }
}