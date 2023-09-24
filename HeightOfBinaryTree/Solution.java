import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;
import java.lang.*; 

class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // somehow exceeds the time limit
        /*
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(node);
        
        int height = 0;
        
        while (!nodes.isEmpty()) {
            
            height++;
            
            int numberOfNodesInCurrentLevel = nodes.size();
        
            for (int i = 0; i < numberOfNodesInCurrentLevel; i++) {
                
                Node tempNode = nodes.remove();
                
                if (tempNode.left != null) nodes.add(tempNode.left);
                if (tempNode.right != null) nodes.add(tempNode.right);
            }
        }
        
        return height;
        */
        
        if (node == null) return 0;
        
        return 1 + Math.max(height(node.left), height(node.right));
    }
}