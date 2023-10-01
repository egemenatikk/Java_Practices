import java.io.*;
import java.util.*;

class Solution {
    int remove_duplicate(int A[], int N) {
        
        // If there is no need for comparisons, simply return the size of the list
        if (N == 0 || N == 1) {
            return N;
        }

        int distinctCount = 1; // Initialize with 1 for the first element
        int current = A[0];    // Initialize with the first element
        
        // Traverse the array starting from the second element
        for (int i = 1; i < N; i++) {
            if (A[i] != current) {
                distinctCount++; // Found a distinct element
                current = A[i];  // Update the current element
                A[distinctCount - 1] = current; // Update the modified array, move the distinc element to
                // its position
            }
        }

        return distinctCount;
    }
}