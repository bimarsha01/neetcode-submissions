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
    static int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maximum = root.val;
        count = 1;

       traverse(root.left , maximum);
       traverse(root.right , maximum);

       return count;

    }
    public int traverse(TreeNode root , int maximum){
        if(root == null){
            return 0;
        }

        if(root.val >= maximum){
            count = count + 1;
            maximum = root.val;
        }

        traverse(root.left , maximum);
        traverse(root.right , maximum);

        return count;


    }
}
