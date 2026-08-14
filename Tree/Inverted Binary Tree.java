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
    public TreeNode invertTree(TreeNode root) {
        binary(root);
        return root;
    }

    public TreeNode binary(TreeNode root){
          if(root==null){
            return;
          }
          TreeNode left=binary(root.left);
          TreeNode right=binary(root.right);
          if(left==null && right==null){
            return;
          }
          swapping(left,right);
    }
         public TreeNpde swapping(TreeNode left,TreeNode right){ 
         TreeNode swap=left;
         left=right;
         right=swap;
         return left,right;
         }
    
} 
