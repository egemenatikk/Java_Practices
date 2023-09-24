import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        // initializing dfs array list
        ArrayList<Integer> dfs = new ArrayList<>();
        
        // initializing used vertices set
        Set<Integer> usedVertices = new HashSet<>();
        
        // calling recursive function to fill dfs array list
        dfsOfGraph(adj, dfs, usedVertices, 0);
        
        return dfs;
    }
    
    public void dfsOfGraph(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs, Set<Integer> usedVertices, Integer root) {
        
        // if current vertex is used before, simply pass it
        if (usedVertices.contains(root)) return;
        
        // if current vertex is not used before, add it to dfs array list and mark it as used
        dfs.add(root);
        usedVertices.add(root);
        
        // traverse neighbors of current vertex and process them in depth-first manner
        for (Integer neighbor : adj.get(root)) {
            dfsOfGraph(adj, dfs, usedVertices, neighbor);
        }    
        
    }
}