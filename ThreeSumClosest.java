import java.util.Arrays;

public class ThreeSumClosest {
	
	public static void main(String[] args) {
		
		int[] nums = {1, -1, 2, -4};
		System.out.println(threeSumClosest(nums, 1));
		
	}
	
	/*
	 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

	 * Return the sum of the three integers.

     * You may assume that each input would have exactly one solution.
     * 
     * Example: 
     * Input: nums = [-1,2,1,-4], target = 1
	 * Output: 2
	 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
	 * 
	 * 
	 * */
	
	public static int threeSumClosest(int[] nums, int target) {
        if (nums.length <= 2) {
            return 0;
        }
        
        Arrays.sort(nums);
        int closestToTarget = nums[1] + nums[2] + nums[3];
        
        if (nums.length == 3) {
            return closestToTarget;
        }
        
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int tempSum = nums[i] + nums [left] + nums[right];
                if (tempSum == target) {
                    return tempSum;
                }
                if (target < tempSum) {
                    right--;
                } else {
                    left++;
                }
                
                if (Math.abs(target - closestToTarget) > Math.abs(target - tempSum)) {
                    closestToTarget = tempSum;
                }
            }
        }
        return closestToTarget;
        
    }

}
