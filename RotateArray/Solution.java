import java.util.*;
import java.io.*;
import java.lang.*;

class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        d = d % n;
        
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        
    }
    
    // helper function to reverse the array between given indexes
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            
            start++;
            end--;
        }
    }
}