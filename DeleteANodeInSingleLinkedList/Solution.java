import java.util.*;

class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	
	    // if linked list is empty, simply return null
	    if (head == null) return head;
	    
	    // if we are asked to delete the current head node, assing second element as head node and 
	    // delete the next connection from current head to second element
	    if (x == 1) {
	        Node newHead = head.next;
	        head.next = null;
	        return newHead;
	    
        // if we are asked to delete a node that is not head node
	    } else {
	        // keep track of previous and current nodes
	        Node prev = head;
	        Node current = head.next;
	        
	        // iterate through nodes until we reach to node we want to delete with current variable
	        while (x > 2) {
	            x--;
	            prev = current;
	            current = current.next;
	        }
	        
	        // delete current node from linked list and return head node
	        prev.next = current.next;
	        current.next = null;
	        return head;
	    }
    }
}