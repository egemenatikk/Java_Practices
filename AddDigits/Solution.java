class Solution {
    public int addDigits(int num) {
        int result = num;
        while (result > 9) {
            result = 0;
            while (num > 0) {
                result += num % 10;
                num /= 10;
            }
            System.out.println(result);
            num = result;
        }

        return result;
    }
}