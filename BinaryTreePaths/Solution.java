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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;
        binaryTreePaths(root, "", paths);
        return paths;
    }

    public void binaryTreePaths(TreeNode root, String currentPath, List<String> paths) {
        if (root.right == null && root.left == null) {
            paths.add(currentPath + root.val);
            return;
        } 
        
        if (root.right != null) {
            binaryTreePaths(root.right, currentPath + root.val + "->", paths);
        }
        
        if (root.left != null) {
            binaryTreePaths(root.left, currentPath + root.val + "->", paths);
        } 
    }
}