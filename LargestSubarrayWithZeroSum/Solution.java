import java.util.*;

class Solution
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> sumUntilIndex = new HashMap<>();
        
        int maxLength = 0;
        int currentSum = 0;
        
        for (int i = 0; i < n; i++) {
            
            currentSum += arr[i];
        
            if (currentSum == 0) maxLength = i + 1;
            else {
                
                // if the current sum exists in the map, it means that before this iteration we reached
                // to this current sum at some index and sum elements between that index and current index
                // equals to 0
                // if its length is bigger than max length we found before, update the max length
                if (sumUntilIndex.containsKey(currentSum)) {
                    
                    maxLength = Math.max(maxLength, i - sumUntilIndex.get(currentSum));    
                } else {
                    
                    sumUntilIndex.put(currentSum, i);
                }
            }
        }
        
        return maxLength;
        
        
    }
}