import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        
        // initializing character frequency map
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        
        // iterating through the string a and adding characters in the a to character frequency map
        // increasing number of occurrences
        for (Character character : a.toCharArray()) {
            if (characterFrequencyMap.keySet().contains(character)) {
                characterFrequencyMap.put(character, characterFrequencyMap.get(character) + 1);
            } else {
                characterFrequencyMap.put(character, 1);
            }
        }
        
        // iterating through the string b and adding characters in the b to character frequency map
        // decreasing number of occurrences
        for (Character character : b.toCharArray()) {
            if (characterFrequencyMap.keySet().contains(character)) {
                characterFrequencyMap.put(character, characterFrequencyMap.get(character) - 1);
            } else {
                characterFrequencyMap.put(character, -1);
            }
        }
        
        // iterating through the final state of character frequency map
        // if any occurrence value is different than 0, return false
        for (Character character : characterFrequencyMap.keySet()) {
            if (characterFrequencyMap.get(character) != 0) return false;
        }
        
        return true;
    }
}