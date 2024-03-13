class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            int currentSum = i * (i + 1) / 2;
            if (totalSum + i == 2 * currentSum) return i;
        }

        return -1;
    }
}