/*
110. Balanced Binary Tree

Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:
a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

 
Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: true
*/

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
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }        
        if (Math.abs(depth(root.left)-depth(root.right)) <= 1)
            return (isBalanced(root.left) && isBalanced(root.right));
        
        return false;
    }
    
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        else{
            return Math.max(depth(root.left), depth(root.right))+1;
        }
    }
}