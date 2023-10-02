import java.io.*;
import java.lang.*;
import java.util.*;

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        
        // initializing map to keep track of number of occurrences of characters in given string
        // LinkedHashMap is used in order to preserve insertion order
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        
        // iterate through the characters in given string
        for (Character c : S.toCharArray()) {
            
            // if current character is already in frequency map, increment its number of occurrences
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);    
            
            // if not, initialize it with 1 
            } else {
                frequencyMap.put(c, 1);
            }
        }
        
        // iterate through the characters in the frequencyMap and return the character if it does not repeat
        for (Character character : frequencyMap.keySet()) {
            if (frequencyMap.get(character) == 1) return character;
        }
        
        // if there are no non-repeating characters in the string, simply return dollar sign character
        return '$';
    }
}