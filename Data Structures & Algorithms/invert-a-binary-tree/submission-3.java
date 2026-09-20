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
    ArrayList<Integer> list = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        invertTree(root.left);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);

        return root;
    }

    public void makeList(TreeNode root) {

        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            list.add(current.val);

            if (current.left != null) {
                queue.offer(current.left);
            }

            if (current.right != null) {
                queue.offer(current.right);
            }
        }
    }
}