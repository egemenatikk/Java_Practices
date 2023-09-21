import java.io.*;
import java.util.*;

class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        return isBST(root, null, null);
    }
    
    boolean isBST(Node node, Node min, Node max) {
        
        if (node == null) return true;
    
        if ((min != null && node.data <= min.data) || (max != null && node.data >= max.data)) return false;
        
        return isBST(node.left, min, node) && isBST(node.right, node, max);
    }
    
    
}