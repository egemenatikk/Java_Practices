import java.util.*;
import java.lang.*;

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        // initializing the array list to return that is constructed according to breadth first search
        ArrayList<Integer> bfsTraversal = new ArrayList<>();
        
        // initializing queue to help ordering node visitings
        Queue<Integer> nodes = new LinkedList<>();
        
        // initializing set to mark nodes as visited
        Set<Integer> usedNodes = new HashSet<>();
        
        // adding root node to queue and marking is as visited
        nodes.add(0);
        usedNodes.add(0);
        
        // iterate until all nodes are visited
        while (!nodes.isEmpty()) {
            
            // get the top element in the queue and add it to bfsTraversal array list
            int currentElement = nodes.remove();
            bfsTraversal.add(currentElement);
            
            // iterate through the neighbors of the current node
            for (Integer nodeData : adj.get(currentElement)) {
                
                // if neighbor is already marked as visited, pass it and continue
                if (usedNodes.contains(nodeData)) continue;
                
                // if neighbor is not marked as visited, add it to queue and mark it as visited
                nodes.add(nodeData);
                usedNodes.add(nodeData);
            }
        }
        
        return bfsTraversal;
    }
}