class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer number = null;

        for (int num : nums) {
            if (count == 0) number = num;
            count += (number == num) ? 1 : -1;
        }
        
        return number;
    }
}