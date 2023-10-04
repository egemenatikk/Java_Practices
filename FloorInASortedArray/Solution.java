import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        // initializing left, right and middle pointers
        int left = 0;
        int right = n - 1;
        int mid = 0;
        
        // initializing index of floor number as -1
        long floorNumber = -1;
        
        // continue searching as long as index of left pointer is not bigger than index of right pointer
        while (left <= right) {
            
            // assign mid pointer
            mid = (left + right) / 2;
            
            // if mid pointer points to a value bigger than x, update right pointer to leftmost index of mid
            if (arr[mid] > x) right = mid - 1;
            
            // if mid pointer points to a value equals to x, simply return the current index of mid
            else if (arr[mid] == x) return mid;
            
            // if mid pointer points to a value smaller than x, update the floorNumber and left pointer
            else {
                floorNumber = mid;
                left = mid + 1;
            }
        }
        
        // return index of floor number
        return (int)floorNumber;
    }
    
}