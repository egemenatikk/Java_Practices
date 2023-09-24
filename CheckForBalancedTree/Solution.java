import java.io.*;
import java.util.*;

class Solution
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
        if (root == null) return true;
        
        // if the current tree is balanced and also its left and right subtrees are balanced, return true
        return (Math.abs(findHeight(root.left) - findHeight(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right));
    }
    
    int findHeight(Node node) {
        
        if (node == null) return 0;
    
        // find maximum height of a tree
        return Math.max(findHeight(node.left), findHeight(node.right)) + 1;
    }
}
