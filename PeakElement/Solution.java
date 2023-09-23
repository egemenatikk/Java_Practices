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
       int right = n -1;
       
       while (left < right) {
           
           int temp = arr[left + 1];
           int leftNumber = arr[left];
           
           if (leftNumber > temp) return left;
           
           left++;
           
           temp = arr[right - 1];
           int rightNumber = arr[right];
           
           if (rightNumber > temp) return right;
           
           right--;
       }
       
       return left;
    }
}