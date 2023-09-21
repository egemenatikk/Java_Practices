import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> duplicatesList = new ArrayList<>();
        
        // iterating through list
        for (int i = 0; i < n; i++) {
            // getting value at current index
            int temp = arr[i];
            
            // if value is processed before, continue
            if (temp < 0) continue;
            
            // if only one occurrence of the current value is processed before, add it to duplicates list
            // also mark the current value as occured more than one time (arr[temp] = -2)
            
            // lastly mark the current index as -3
            // marking with -3 means that the previous value in that index occurred 
            // more than one times and no swap operation is executed
            if (arr[temp] == -1) {
                duplicatesList.add(temp);
                arr[i] = -3;
                arr[temp] = -2;
                
            // if occurrences of the current value is already more than one, dont add it to duplicates list
            // only mark the current indes as -3 meaning that the previous value in that index occurred 
            // more than one times and no swap operation is executed
            } else if (arr[temp] == -2) {
                arr[i] = -3;
                
            // if "occurrence index" of the current value is occupied with -3, it means that the current value
            // occured for the first time, but no swap operation will be operated
            // we will just move -3 to index of current element
            } else if (arr[temp] == -3) {
                arr[temp] = -1;
                arr[i] = -3;
                
            // first occurrence of the current value and swap operation will be executed
            } else {
                arr[i] = arr[temp];
                arr[temp] = -1;
                i--;
            }
        }
        
        // if no duplicates are found, simply return [-1]
        if (duplicatesList.size() == 0) duplicatesList.add(-1);
        
        // sort the duplicates list
        if (duplicatesList.size() > 1) Collections.sort(duplicatesList);
        
        return duplicatesList;
    }
}
