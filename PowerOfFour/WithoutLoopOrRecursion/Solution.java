class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        // Calculate the logarithm base 4 of n
        double logResult = Math.log(n) / Math.log(4);
        // Check if the result is an integer
        return Math.abs(logResult - Math.round(logResult)) < 1e-10;
    }
}