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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, targetSum, 0);
    }

    private boolean hasPathSum(TreeNode root, int targetSum, int runningSum) {
        if (root == null) return false;

        if (isLeafNode(root)) {
            return runningSum + root.val == targetSum;
        } 
        runningSum += root.val;
        return hasPathSum(root.left, targetSum, runningSum) || hasPathSum(root.right, targetSum, runningSum);
    }

    private boolean isLeafNode(TreeNode root) {
        return root.left == null && root.right == null;
    }
}