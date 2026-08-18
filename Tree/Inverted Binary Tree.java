/*
Title: Inverted Binary Tree
https://leetcode.com/problems/invert-binary-tree/
Approach: Binary Tree

/*

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
            return null;
          }
          TreeNode left=binary(root.left);
          TreeNode right=binary(root.right);
          root.left=right;
          root.right=left;
          return root;
    }
         
}
