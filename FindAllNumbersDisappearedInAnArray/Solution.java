class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        int length = nums.length;
        List<Integer> disappearedNumbers = new ArrayList<>();

        while (i < length) {
            if (nums[i] == 0 || nums[nums[i] - 1] == 0) i++;
            else {
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = 0;
            }
        }

        for (int k = 0; k < length; k++) if (nums[k] != 0) disappearedNumbers.add(k + 1);
        return disappearedNumbers;
    }
}