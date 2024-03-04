class Solution {
    public boolean isUgly(int n) {
        if (n < 1) return false;

        int[] primeFactors = new int[]{2, 3, 5};
        int index = 0;

        while (n > 1) {
            if (index == 3) return false;
            
            if (n % primeFactors[index] == 0) n /= primeFactors[index];
            else index++;
        }

        return true;
    }
}