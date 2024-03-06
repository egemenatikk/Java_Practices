class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        // Calculate the logarithm base 3 of n
        double logResult = Math.log(n) / Math.log(3);
        // Check if the result is an integer
        return Math.abs(logResult - Math.round(logResult)) < 1e-10;
    }
}