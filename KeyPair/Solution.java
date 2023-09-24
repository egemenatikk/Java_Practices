import java.util.*;
import java.io.*;

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        
        // initializing frequency map
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        
        // iterating through the array
        for (int element : arr) {
            
            // if current element is not less than target, pass it, do not add it to frequency map
            if (element >= x) continue;
            
            // update frequency of current element
            if (frequencyMap.containsKey(element)) {
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                frequencyMap.put(element, 1);
            }
        }
        
        // iterate through the frequency map
        for (Integer key : frequencyMap.keySet()) {
            
            // find difference of current element from target
            int diff = x - key;
            
            // if difference equals to element itself, check if its frequency is at least 2 or not
            if (diff == key) return frequencyMap.get(key) > 1;
            
            // if difference is not same as element itself, check whether difference's frequency is at least 1
            if (frequencyMap.containsKey(diff)) return true;
        }
        
        return false;
    }
}