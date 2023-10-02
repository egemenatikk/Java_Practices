import java.io.*;
import java.util.*;

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        
        // Initializing map to keep first indexes a number in array occurred
        HashMap<Integer, Integer> indexingMap = new HashMap<>();
        
        // keeping track of smallest index for a repeat
        int smallestRepeatingIndex = -1;
        
        // iterate through the array
        for (int i = 0; i < n; i++) {
            
            // getting the current element
            int currentElement = arr[i];
            
            // if this element is already on the map meaning this element is now repeating
            if (indexingMap.containsKey(currentElement)) {
                
                // getting first index the element occurred
                int currentRepeatedIndex = indexingMap.get(currentElement);
                
                // if we did not come across with a repeated element before, directly assign this index
                // to smallestRepeatingIndex
                if (smallestRepeatingIndex == -1) {
                    smallestRepeatingIndex = currentRepeatedIndex;
                    continue;
                }
                
                // if we already have a repeat but first index of this repeat is smaller, update 
                // smallestRepeatingIndex
                if (currentRepeatedIndex < smallestRepeatingIndex) smallestRepeatingIndex = currentRepeatedIndex;
                
            // if element is not on the map meaning this is the first time we encounter with this value
            } else {
                indexingMap.put(currentElement, i + 1);
            }
        }
        
        return smallestRepeatingIndex;
    }
}