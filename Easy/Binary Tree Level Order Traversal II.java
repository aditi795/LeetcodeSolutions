/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new LinkedList();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> in;
        List<List<Integer>> lists = new LinkedList();
        q.offer(root);
        while(!q.isEmpty()){
            int length = q.size();    
            in = new ArrayList<Integer>();
            for(int i=0; i<length; i++){
                TreeNode t = q.poll();        
                in.add(t.val);
                if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
            }
           lists.add(0, in); 
        }
             
        return lists;
    }
}