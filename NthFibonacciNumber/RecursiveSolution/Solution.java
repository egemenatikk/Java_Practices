import java.util.*;
import java.io.*;

class Solution {
    
    static int nthFibonacci(int n) {
        
        if (n < 1) return 0;
        
        int[] fibonacciArray = new int[n + 1];
        
        return nthFibonacci(n, fibonacciArray);
    }
    
    static int nthFibonacci(int n, int[] fibonacciArray) {
        
        if (n < 3) return 1;
        
        // memoization
        if (fibonacciArray[n] != 0) return fibonacciArray[n];
        
        int result = nthFibonacci(n - 1, fibonacciArray) + nthFibonacci(n - 2, fibonacciArray);
        
        fibonacciArray[n] = result % 1000000007;
        
        return fibonacciArray[n];
    }
}