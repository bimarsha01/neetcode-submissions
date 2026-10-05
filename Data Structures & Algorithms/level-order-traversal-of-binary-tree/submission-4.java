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
     List<List<Integer>> lists = new ArrayList<>();
    int level;
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if(root == null){
            return lists;
        }


        traverse(root , 0);

        return lists;
        
    }
    public void traverse(TreeNode root , int level){

        if (root == null) {
        return;
    }
    
        int size = lists.size();
        if(size <= level){
                List<Integer> list = new ArrayList<>();
                list.add(root.val);
                lists.add(list);
        }
        else { 
            lists.get(level).add(root.val);
        }

        traverse(root.left , level+1);
        traverse(root.right , level+1);

    }
}
