import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        
        // iterate through the nodes in linked list as long as the current node is not null and not already visited
        while (head != null && head.data != 0) {
            
            // mark the current node as visited and jump to next node
            head.data = 0;
            head = head.next;
        }
        
        // if while loop is broken because the current node was null, it means the tail node points to null
        // hence, no loops
        if (head == null) return false;
        
        // otherwise, we jumped from tail node to a node that is already visited, hence there is a loop
        return true;
        
    }
}