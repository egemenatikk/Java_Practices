import java.util.*;
import java.io.*;

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         
         // initialize the set to keep track of duplicates
         Set<Integer> traversedData = new HashSet<>();
         
         // initialize nodes to use while traversing and removing duplicates
         Node current = head;
         Node prev = null;
         
         // continue traversing as long as there are nodes left to traverse
         while (current != null) {
             
             // if the current data already exists in the linked list, remove that node from linked list
             // there is no need to add it to set because it is already there
             if (traversedData.contains(current.data)) {
                
                prev.next = current.next;
                current.next = null;
                current = prev.next;
                    
            // if the current node does not exist in the linked list before, firstly add it to set
            // then, simply move to next nodes for both prev and current
            // if prev is null, it means we are at the start of the linked list, so assing it as head node
            } else {
                 
                traversedData.add(current.data);
                current = current.next;
                
                if (prev == null) prev = head;
                else prev = prev.next;
            }
        }
        
        return head;
    }
}