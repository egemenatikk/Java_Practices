import java.util.*;
import java.io.*;

class Solution {
    int print2largest(int arr[], int n) {
        
        // initializing largest and secondLargest numbers
        int largest = 0;
        int secondLargest = 0;
        
        // iterating through the list
        for (int i = 0; i < n; i++) {
            
            // getting current element
            int currentElement = arr[i];
            
            // if current element is bigger than the largest element so far,
            // assign the currently largest number as second largest number
            // assign the current number as the largest number
            if (currentElement > largest) {
                secondLargest = largest;
                largest = currentElement;
                
            // if current element is either equals to largest or second largest number, just continue, pass that number
            } else if (currentElement == secondLargest || currentElement == largest) continue;
            
            // if the current element is not bigger than the current largest number but is bigger than
            // the current second largest number, assign the current element as the second largest
            else if (currentElement > secondLargest) {
                secondLargest = currentElement;
                
            }
        }
        
        if (secondLargest == 0) return -1;
        
        return secondLargest;
    }
}