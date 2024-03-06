class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charStringMap = new HashMap<>();
        Map<String, Character> stringCharMap = new HashMap<>();

        String[] splittedWords = s.split(" ");
        int length = splittedWords.length;

        if (length != pattern.length()) return false;

        for(int i = 0; i < length; i++) {
            char currentChar = pattern.charAt(i);
            String currentString = splittedWords[i];

            if (charStringMap.containsKey(currentChar)) {
                if (!charStringMap.get(currentChar).equals(currentString)) return false;
            } else charStringMap.put(currentChar, currentString);
            if (stringCharMap.containsKey(currentString)) {
                if (!stringCharMap.get(currentString).equals(currentChar)) return false;
            } else stringCharMap.put(currentString, currentChar);
        }
        return true;
    }
}