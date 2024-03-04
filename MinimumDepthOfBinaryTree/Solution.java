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
    public int minDepth(TreeNode root) {
        return minDepth(root, 0);
    }

    private int minDepth(TreeNode root, int depth) {
        if (root == null) return depth;
        if (isLeafNode(root)) return depth + 1;
        if (root.left == null) return minDepth(root.right, depth + 1);
        if (root.right == null) return minDepth(root.left, depth + 1);
        return Math.min(minDepth(root.left, depth + 1), minDepth(root.right, depth + 1));
    }

    private boolean isLeafNode(TreeNode root) {
        return root.left == null && root.right == null;
    }
}