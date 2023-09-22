import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Solution
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> leftViewList = new ArrayList<>();
      
      // if tree is empty return empty list
      if (root == null) return leftViewList;
      
      // initialize nodes queue for non-recursive traversal
      Queue<Node> nodes = new LinkedList<>();
      
      // add root as first elemtn
      nodes.add(root);
      
      
      while (!nodes.isEmpty()) {
          
          // empty the queue in each level iteration and fill with child nodes for next iteration
          int size = nodes.size();
          for (int i = 0; i < size; i++) {
            
            Node currentNode = nodes.remove();
              
            // if it is the leftmost node in its level, add it to leftViewList
            if (i == 0) leftViewList.add(currentNode.data);
            
            // add left and right nodes of the current node to queue to iterate them in next iteration
            // add left first because we look for left view
            if (currentNode.left != null) nodes.add(currentNode.left);
            
            if (currentNode.right != null) nodes.add(currentNode.right);
          }
      }
      
      return leftViewList;
    }
    
    
}