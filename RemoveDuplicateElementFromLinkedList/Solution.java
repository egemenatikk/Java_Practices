import java.util.*;

class Solution
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        // if there is no linked list, simply return null
	    if (head == null) return head;
	    
	    // initialize the node that will be used while iterating the list
	    Node iteratingNode = head;
	    
	    // initialize data to compare with next node
	    int currentData = iteratingNode.data;
	    
	    // continue iterating the list until reaching to tail node
	    while (iteratingNode.next != null) {
	        
	        // if we come across with a duplicate pair, delete the one on the right
	        if (currentData == iteratingNode.next.data) {
	            
	            Node tempNode = iteratingNode.next;
	            iteratingNode.next = tempNode.next;
	            tempNode.next = null;
	            
            // if not, move to next node and update the currentData accordingly
	        } else {
	            iteratingNode = iteratingNode.next;
	            currentData = iteratingNode.data;
	        }
	    }
	    
	   // return the head node
	    return head;
		
    }
}