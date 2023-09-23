import java.io.*;
import java.util.*;

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        
        int pairsCount = 0;
        
        // initializing frequency map for elements in the array
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // iterating through the array
        for (int i = 0; i < n; i++) {
            
            // getting the current element
            int currentNumber = arr[i];
            
            // if current element is bigger than or equal to the target number continue since all numbers
            // in the array is bigger than 0
            if (currentNumber >= k) continue;
            
            // increment the occurrence of the number in frequency map if it exists
            if (frequencyMap.keySet().contains(currentNumber)) {
                frequencyMap.put(currentNumber, frequencyMap.get(currentNumber) + 1);
                
            // if it does not exist in frequency map, initialize it with 1 occurrence
            } else {
                frequencyMap.put(currentNumber, 1);
            }
        }
        
        // iterate through the frequency map
        for (Integer number : frequencyMap.keySet()) {
            
            int frequency = frequencyMap.get(number);
            
            // if the frequency of the element is 0, it means we already covered that number, so continue
            if (frequency == 0) continue;
            
            // find the difference of the current element from target
            int difference = k - number;
            
            // if difference equals to number itself
            if (difference == number) {
                
                // add how many combinations can be set to pairsCount
                pairsCount += (frequency * (frequency - 1)) / 2;
                int temp = (frequency * (frequency + 1)) / 2;
                
                // mark this element as used/covered
                frequencyMap.put(number, 0);
                
            // if difference is not the number itself
            } else {
                
                // if difference also exists in frequency map
                if (frequencyMap.keySet().contains(difference)) {
                    
                    // add how many combinations can be set to pairsCount
                    pairsCount += frequency * frequencyMap.get(difference);
                    int temp = frequency * frequencyMap.get(difference);
                    
                    // mark both the current element and difference as used/covered
                    frequencyMap.put(number, 0);
                    frequencyMap.put(difference, 0);
                }
            }
        }
        
        return pairsCount;
    }
}