import java.io.*;
import java.util.*;

class Solution {
    int isPalindrome(String S) {
        // code here
        
        int index = 0;
        int stringLength = S.length(); 
        
        while (index < stringLength / 2) {
            if (S.charAt(index) != S.charAt(stringLength - 1 - index)) return 0;
            index++;
        }
        
        return 1;
    }
};