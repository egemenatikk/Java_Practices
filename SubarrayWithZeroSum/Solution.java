import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        
        // initialize variable to keep track of current sum
        int currentSum = 0;
        
        // initialize map to keep track of indexex that running sums occured first
        HashMap<Integer, Integer> firstIndexOfSum = new HashMap<>();
        
        // iterate through the array
        for (int i = 0; i < n; i++) {
            
            int currentElement = arr[i];
            
            // update running sum
            currentSum += currentElement;
            
            // if running sum is 0, we reached our goal, return true
            if (currentSum == 0) return true;
            
            // if running sum with current running sum happened before, it means that sum between those indexes
            // is zero, so return true
            if (firstIndexOfSum.containsKey(currentSum)) return true;
            
            // if running sum with current sum did not happened before, add it to map by indicating first index
            // it happened
            firstIndexOfSum.put(currentSum, i);
        }
        
        // if no zero sum exists, return false
        return false;
    }
}