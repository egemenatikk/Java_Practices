import java.util.*;
import java.io.*;

class Solution
{
    int search(int A[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        
        // iterate as long as left pointer is smaller than right pointer
        while (l <= h) {
            
            // find middle element
            int mid = (l + h) / 2;
            
            // if middle element equals the key, return middle index
            if (A[mid] == key) return mid;
            
            // if element in left pointer is smaller than element in middle pointer, it means left part is sorted
            if (A[l] <= A[mid]) {
                
                // if key value is among that left list which is sorted, update right pointer
                if (A[l] <= key && key < A[mid]) {
                    h = mid - 1;
                // if key value is not on left list, update left pointer
                } else {
                    l = mid + 1;
                }
                
            // if left list is not sorted
            } else {
                // if key value is on right list, update left pointer
                if (A[mid] < key && key <= A[h]) {
                    l = mid + 1;
                // if key value is not on right list, update right pointer
                } else {
                    h = mid - 1;
                }
            }
        }
        
        // if element is not found, return -1
        return -1;
    }
}