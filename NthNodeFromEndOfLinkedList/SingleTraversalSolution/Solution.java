import java.io.*;
import java.util.*;

class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	
    	// In this solution, our purpose is reaching to tail node with one node and then adjusting the 
    	// position of other node
    	
    	// node that we will reach to tail node with
    	Node tempNode = head;
    	
    	// if the given distance equals to size of the linked list, we aim to reach exactly to
    	// tail node at the end of this while loop
    	while (n > 1) {
    	    
    	    // if we reach to tail node before expected, we break to loop
    	    if (tempNode.next == null) break;
    	    
    	    // otherwise, continue to move to tail node
    	    tempNode = tempNode.next;
    	    n--;
    	}
    	
    	// if we reached to exactly tail node after the while loop, return the data in the head node
    	if (tempNode.next == null && n == 1) return head.data;
    	
    	// if we reached to tail node while still iterating the while loop, it means the given distance is
    	// bigger than the size of the linked list, so return -1
    	else if (n > 1) return -1;
    	
    	// if we still could not reach to tail node, it means distance < linked list size, but still it is 
    	// a good thing because if we reach to tail node with tempNode and move the head node with the tempNode
    	// it means we will reach to our solution
    	else {
    	    while (tempNode.next != null) {
    	        tempNode = tempNode.next;
    	        head = head.next;
    	    }
    	    return head.data;
    	}
    }
}