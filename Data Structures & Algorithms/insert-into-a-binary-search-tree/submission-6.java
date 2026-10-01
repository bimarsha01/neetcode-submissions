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
public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
     TreeNode rootTemp = root;

     if(root == null){
        root = new TreeNode(val);
        return root; 
     }
        if(val < root.val){
            if(root.left == null){
                root.left = new TreeNode(val);
            }
            else{
                // root = root.left;
                root.left =  insertIntoBST( root.left , val);
            }
        }
        else if (val > root.val){
             if(root.right == null){
                root.right = new TreeNode(val);
            }
            else{
                // root = root.right;
                root.right =  insertIntoBST( root.right  , val);
            }
        }
        return root;
    }
}