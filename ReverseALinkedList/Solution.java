import java.util.*;
import java.io.*;

class Solution {
    
    Node reverseList(Node head) {
        
        // Initialize pointers
        Node prevNode = null;
        Node current = head;
        
        while (current != null) {
            
            // Store the next node temporarily
            Node nextNode = current.next;
            
            // Reverse the current node's next pointer
            current.next = prevNode;
            
            // Move the pointers one step forward
            prevNode = current;
            current = nextNode;
        }
        
        // Update the new head of the reversed list
        head = prevNode;
        
        return head;
    }
}