import java.io.*;
import java.util.*;

class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        
        int numberOfTriplets = 0;
        
        Set<Integer> numbers = new HashSet<>();
        
        for (Integer number : arr) numbers.add(number);
        
        for (int i = 0; i < n - 1; i++) {
            
            int outerNumber = arr[i];
            
            for (int j = i + 1; j < n; j++) {
                
                if (numbers.contains(outerNumber + arr[j])) numberOfTriplets++;
            }
        }
        
        return numberOfTriplets;
    }
}