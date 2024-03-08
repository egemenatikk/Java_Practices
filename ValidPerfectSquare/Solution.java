class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long left = 2;
        long right = num / 2;

        while (left <= right) {
            long mid = (left + right) / 2;
            long currentResult = mid * mid;
            if (currentResult == num) return true;
            else if (currentResult > num) right = mid - 1;
            else left = mid + 1;
        }

        return false;
    }
}