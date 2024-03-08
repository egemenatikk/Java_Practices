class Solution {
    public int titleToNumber(String columnTitle) {
        int repeat = 0;
        int length = columnTitle.length();
        int index = length - 1;
        int columnNumber = 0;

        while (repeat < length) {
            char c = columnTitle.charAt(index);
            int toAdd = c - 'A' + 1;

            columnNumber += Math.pow(26, repeat) * toAdd;
            repeat++;
            index--;
        }

        return columnNumber;
    }
}