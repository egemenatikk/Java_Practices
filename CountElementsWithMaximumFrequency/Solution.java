class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            if (frequencyMap.containsKey(num)) frequencyMap.put(num, frequencyMap.get(num) + 1);
            else frequencyMap.put(num, 1);
        }

        int maxFrequency = 0;
        int result = 0;

        for (int value : frequencyMap.values()) {
            if (value > maxFrequency) {
                maxFrequency = value;
                result = value;
            }
            else if (value == maxFrequency) result += value;
        }

        return result;
    }
}