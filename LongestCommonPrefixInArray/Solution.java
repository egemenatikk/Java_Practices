import java.io.*;
import java.util.*;

class Solution{
    String longestCommonPrefix(String arr[], int n){
        
        if (n == 0 || arr == null) return "-1";
        
        // initializing smallest string information variables
        int smallestStringIndex = 0;
        String smallestString = arr[0];
        
        // finding smallest string in the array
        for (int i = 1; i < n; i++) {
            if (arr[i].length() < smallestString.length()) {
                smallestStringIndex = i;
                smallestString = arr[i];
            }
        }
        
        int smallestStringLength = smallestString.length();
        
        // comparing other strings with smallest string in the array
        for (int i = 0; i < n; i++) {
            
            if (i == smallestStringIndex) continue;
            
            String currentString = arr[i];
            int j = 0;
            
            // finding how many characters from start of current string and smallest string are equal
            while (j < smallestStringLength && currentString.charAt(j) == smallestString.charAt(j)) j++;
            
            smallestStringLength = Math.min(smallestStringLength, j);
        }
        
        // if there are no such common prefix, return "-1"
        if (smallestStringLength == 0) return "-1";
        
        // else, return the common prefix
        else return smallestString.substring(0, smallestStringLength);
        
    }
}