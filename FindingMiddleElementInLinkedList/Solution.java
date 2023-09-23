import java.util.*;
import java.io.*;

class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         
         // head node will be moved in every two iterations
         boolean moveHead = false;
         
         // initialize the node we move in every iteration
         Node tempNode = head;
         
         // iterate until tempNode reaches to end of the linked list, after tail node
         while (tempNode != null) {
             
             // if we should move head node, move it and mark it as not to move in the next iteration
             if (moveHead) {
                 head = head.next;
                 moveHead = false;
                 
             // if we should not move head node in this iteration, mark it as to move in next iteration
             } else {
                 moveHead = true;
             }
             
             // move tempNode in every iteration
             tempNode = tempNode.next;
         }
         
         // return the middle node
         return head.data;
    }
}