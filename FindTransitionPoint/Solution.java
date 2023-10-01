import java.util.*;

class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        
        // initializing transition point variable
        int transitionPoint = -1;
        
        // initializing left, right and middle pointers
        int left = 0;
        int right = n - 1;
        int mid = 0;
        
        // as long as left index is smaller than or equal to right index, continue to iterate
        while (left <= right) {
            // assign new middle index
            mid = (left + right) / 2;
            
            // if value in middle index is 0
            if (arr[mid] == 0) {
                
                // move left index to right next of middle index and continue
                left = mid + 1;
                continue;
            
                
            // if value in middle index is 1
            } else {
                // if middle index is starting index or value in left next index is 0, return the current mid
                if (mid == 0 || arr[mid - 1] == 0) return mid;
                
                // if not, move the right index to left next of middle index and continue
                else {
                    right = mid - 1;
                    continue;
                }
            }
        }
        
        return transitionPoint;
    }
}