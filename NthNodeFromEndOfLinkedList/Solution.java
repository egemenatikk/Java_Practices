import java.io.*;
import java.util.*;

class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	
    	// firstly, find the size of the linked list
    	int size = 0;
    	
    	// initialize a temp node to use while finding the size of linked list
    	Node tempNode = head;
    	
    	// finding the size
    	while (tempNode != null) {
    	    size++;
    	    tempNode = tempNode.next;
    	}
    	
    	// finding the index of the node with distance of n from tail node
    	int indexOfNthNodeFromTail = size - n + 1;
    	
    	// return if distance given is bigger than size of linked list
    	if (indexOfNthNodeFromTail <= 0) return -1;
    	
    	// iterating through the node with distance of n from tail node
    	while (indexOfNthNodeFromTail > 1) {
    	    head = head.next;
    	    indexOfNthNodeFromTail--;
    	}
    	
    	// return data in the node with distance of n from tail node
    	return head.data;
    }
}