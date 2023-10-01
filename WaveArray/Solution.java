import java.io.*;
import java.util.*;
import java.util.Arrays;

class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        
        // iterate the array by swapping two adjacent elements in every step sequentially
        for (int i = 0; i < n - 1; i += 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
    }
}