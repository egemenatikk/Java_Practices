import java.util.*;
import java.lang.*;

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here
        
        // indicates starting point to start looking for "." character
        // also indicates next position after "." character or the first character of string
        int searchStartIndex = 0;
        
        // indicates position of "." character
        int pointIndex = 0;
        
        // indicates reversed string
        String reversedString = "";
        
        // iterate as long as there exists a "." character in the string and get its position
        while ((pointIndex = S.indexOf(".", searchStartIndex)) != -1) {
            
            // extract the substring between "." characters
            String extractedWord = S.substring(searchStartIndex, pointIndex);
            
            // adjust search starting index
            searchStartIndex = pointIndex + 1;
            
            // add the extracted substring to reversed string accordingly
            reversedString = "." + extractedWord + reversedString;
        }
        
        // add the last substring to reversed string accordingly
        reversedString = S.substring(searchStartIndex) + reversedString;
        
        return reversedString;
    }
}