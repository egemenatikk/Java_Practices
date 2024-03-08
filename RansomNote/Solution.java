class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (frequencyMap.containsKey(c)) frequencyMap.put(c, frequencyMap.get(c) + 1);
            else frequencyMap.put(c, 1);
        }

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (frequencyMap.containsKey(c)) frequencyMap.put(c, frequencyMap.get(c) - 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 0) return false;
        }

        return true;

    }
}