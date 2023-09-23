import java.util.*;
import java.io.*;

class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
       //add code here.
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        
        while (left <= right) {
            mid = (left + right) / 2;
            
            if ((mid==0 || arr[mid]>= arr[mid-1]) && (mid==n-1 || arr[mid]>=arr[mid+1]) ){
                break;
            }
            
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
                
            } else {
                left = mid + 1;
            }
        }
        
        return mid;
    
    }
}