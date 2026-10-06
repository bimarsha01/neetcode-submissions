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
    List<Integer> list = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return list;
        }
        traverse(root , 0);

        return list;
    }

    public void traverse(TreeNode root , int level){
        if(root == null){
            return ;
        }
        int size = list.size();
        
        if((level == size)){
            list.add(root.val);
        }

        traverse(root.right , level + 1);
        traverse(root.left , level + 1);

    }
}