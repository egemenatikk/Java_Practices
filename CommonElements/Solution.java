import java.util.*;

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here
        
        // initializing commonElements ArrayList
        ArrayList<Integer> commonElements = new ArrayList<>();
        
        // initializing indexes for A, B and C
        int indexA = 0;
        int indexB = 0;
        int indexC = 0;
        
        // if iteration of any one of A, B, C is completed, loop must be finished
        while (indexA < n1 && indexB < n2 && indexC < n3) {
            
            // duplicate prevention without any additional data structure
            
            // if the previous element equals to current element in A, increment indexA and continue
            if (indexA != 0 && A[indexA] == A[indexA - 1]) {
                indexA++;
                continue;
            }
            
            // if the previous element equals to current element in B, increment indexB and continue
            if (indexB != 0 && B[indexB] == B[indexB - 1]) {
                indexB++;
                continue;
            }
            
            // if the previous element equals to current element in C, increment indexC and continue
            if (indexC != 0 && C[indexC] == C[indexC - 1]) {
                indexC++;
                continue;
            }
            
            // if a common element is found, add it to commonElements and increment all indexes and continue
            if (A[indexA] == B[indexB] && C[indexC] == B[indexB]) {
                commonElements.add(B[indexB]);
                indexA++;
                indexB++;
                indexC++;
                continue;
            }
            
            // if no common element is found in this iteration, find the maximum of current elements in A, B, C
            int currentMax = Math.max(A[indexA], Math.max(B[indexB], C[indexC]));
            
            // find which arrays' current elements are less than the maximum among them and increment their indexes
            if (A[indexA] < currentMax) indexA++;
            if (B[indexB] < currentMax) indexB++;
            if (C[indexC] < currentMax) indexC++;
        }
        
        return commonElements;
    }
}