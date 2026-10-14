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
    int element;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }
        int res = traverse(root , k);

        return res;
    }

    public int traverse(TreeNode root , int k){
        if(root == null){
            return 0;
        }
        traverse(root.left , k);

        list.add(root.val);

        traverse(root.right , k);

        int size = list.size();
        if(k > size || k < 0){
          return 0;
        }
        else{
             element = list.get(k-1);
        }
        return element;
    }
}
