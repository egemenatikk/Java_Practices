import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        if (m > n) return "No";
        
        // initialize frequency map to keep number of occurrences of elements in a1 and a2
        HashMap<Long, Long> frequencyMap = new HashMap<>();
        
        // iterate through the arrays
        for (int i = 0; i < n; i++) {
            
            // increment the number of occurrences of current element in a1
            long temp1 = a1[i];
            
            if(frequencyMap.containsKey(temp1)) frequencyMap.put(temp1, frequencyMap.get(temp1) + 1L);
            else frequencyMap.put(temp1, 1L);
            
            // if there are still elements exist in a2 to iterate
            if (i < m) {
                
                // decrement the number of occurrences of current element in a2
                long temp2 = a2[i];
            
                if(frequencyMap.containsKey(temp2)) frequencyMap.put(temp2, frequencyMap.get(temp2) - 1L);
                else frequencyMap.put(temp2, -1L);
            }
        }
        
        // iterate through the elements in a2 to check whether there are enough occurrences of them in a1
        for (long element : a2) {
            
            if (frequencyMap.get(element) < 0) return "No";
        }
        
        return "Yes";
    }
    
}