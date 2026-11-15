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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int flag = 1;
         List<Integer> l = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode==null){
                ans.add(l);
                l = new ArrayList<>();
                flag = 1-flag;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(flag==1){
                     l.add(currNode.val);
                }
                else{
                    l.add(0,currNode.val);
                }

                if(currNode.left!=null){
                   q.add(currNode.left);
                }
                if(currNode.right!=null){
                   q.add(currNode.right);
                }
            }

        }
        return ans;
    }
}