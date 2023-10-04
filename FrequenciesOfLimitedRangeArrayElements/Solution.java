import java.io.*;
import java.util.*;

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        
        // if there may be numbers in the array bigger than size of array, first delete them from array
        if (P > N) {
            for (int i = 0; i < N; i++) {
                if (arr[i] > N) arr[i] = 0;
            }
        }
        
        // iterate through the array and increment number of occurrences of elements by adding (N + 1) to index
        // corresponding to current value
        // we add (N + 1) and while finding the current value we take mod of (N + 1)
        for (int i = 0; i < N; i++) {
            
            int currentElement = (arr[i] % (N + 1)) - 1;
            if (currentElement < 0) continue;
            
            arr[currentElement] += (N + 1);
        }
        
        // count how many (N + 1)s are added to indexes by dividing number in current index to (N + 1)
        // in that way, we are able to find number of occurrences
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / (N + 1);
        }
    }
}