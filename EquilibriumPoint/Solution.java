import java.io.*;
import java.util.*;
import java.util.stream.*;

class Solution {

    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        
        // iterate through the array and find the total sum
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        
        // sum of right of equilibrium point
        long runningRightSum = totalSum;
        
        // iterate through the array again but this time by choosing equilibrium point
        for (int i = 0; i < n; i++) {
            
            // value equilibrium point
            long currentValue = arr[i];
            
            // decrease the equilibrium point value from right sum of equilibrium point
            runningRightSum -= currentValue;
            
            // if sum of right of equilibrium point equals to half of total sum without equilibrium point value
            // return the 1-based index of the currently chosen equilibrium point
            if (runningRightSum * 2 == totalSum - currentValue) return i + 1;
        }
        
        // if no point is satisfied to be the equilibrium point, return -1
        return -1;
    }
}