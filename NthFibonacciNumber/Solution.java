import java.util.*;
import java.io.*;

class Solution {
    
    static int nthFibonacci(int n) {
        
        if (n < 0) return 0;
        
        int[] fibonacciValues = new int[n + 1];
        
        fibonacciValues[0] = 0;
        fibonacciValues[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            fibonacciValues[i] = (fibonacciValues[i - 1] + fibonacciValues[i - 2]) % 1000000007;
        }
        
        return fibonacciValues[n];
    }
    
}