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
    public void getInorder(TreeNode root, List<Integer>ans){
        if(root==null){
          return;
        }
        getInorder(root.left,ans);
        ans.add(root.val);
        getInorder(root.right,ans);
    }
    public TreeNode createBst(List<Integer>ans, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        TreeNode root = new TreeNode(ans.get(mid));
        root.left = createBst(ans,st,mid-1);
        root.right = createBst(ans,mid+1,end);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
       getInorder(root,ans);

        return createBst(ans,0,ans.size()-1);

    }
}