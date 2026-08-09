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
    public int maxDepth(TreeNode root) {
        
        return binary(root);
       
    }
    public int binary(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int left=binary(root.left);
        int right=binary(root.right);
        int count=1+Math.max(left,right);
         return count;
    }
}
