class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroPointer = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If current element is non-zero, move it to the position indicated by nonZeroPointer
            if (nums[i] != 0) {
                nums[nonZeroPointer] = nums[i];
                // Increment nonZeroPointer only if there was a non-zero element encountered
                if (i != nonZeroPointer) {
                    nums[i] = 0;
                }
                nonZeroPointer++;
            }
        }
    }
}
