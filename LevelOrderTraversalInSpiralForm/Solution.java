import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Solution
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        
        // Initializing arraylist generated after spiral traversal
        ArrayList<Integer> spiralTraversal = new ArrayList<>();
        
        if (root == null) return spiralTraversal;
        
        // keeping track of the level being even or odd
        boolean isLevelEven = true;
        
        // initializing queue to get nodes in a level and adding root node initially
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);
        
        // as long as there are nodes in the queue, continue iterating 
        while (!nodes.isEmpty()) {
            // getting number of nodes in the queue
            int size = nodes.size();
            
            // initializing stack to reverse nodes' order
            Stack<Node> reverseQueueStack = new Stack<>();
            
            // iterate through all nodes in the current level
            for (int i = 0; i < size; i++) {
                
                // get the node in the current level and add it to spiral traversal array list
                Node currentNode = nodes.remove();
                spiralTraversal.add(currentNode.data);
                
                // if current level is even, add right child first to stack and then left child
                if (isLevelEven) {
                    if (currentNode.right != null) reverseQueueStack.push(currentNode.right);
                    if (currentNode.left != null) reverseQueueStack.push(currentNode.left);
                
                // if current level is odd, add left child first to stack and then right child
                } else {
                    if (currentNode.left != null) reverseQueueStack.push(currentNode.left);
                    if (currentNode.right != null) reverseQueueStack.push(currentNode.right);
                }
            }
            
            // add nodes in the stack to queue to reverse their ordering
            while (!reverseQueueStack.isEmpty()) {
                Node reversedCurrentNode = reverseQueueStack.pop();
                nodes.add(reversedCurrentNode);
            } 
            
            // update level being odd or even
            isLevelEven = !isLevelEven;
        }
        
        // return the list generated after traversing spirally
        return spiralTraversal;
    }
}