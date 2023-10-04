import java.io.*;
import java.util.*;

class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // initializing left product array, right product array and result array
        long[] leftProduct = new long[n];
        long[] rightProduct = new long[n];
        long[] result = new long[n];
        
        // initializing first element of left product and last element of right product arrays as 1
        leftProduct[0] = 1;
        rightProduct[n - 1] = 1;
        
        // Calculate the product of all elements to the left of each element
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }
        
        // Calculate the product of all elements to the right of each element
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }
        
        // Calculate the final product array
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }
        
        return result;
	} 
} 