class Solution {
    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            int modulo = columnNumber % 26 == 0 ? 26 : columnNumber % 26;
            sb.insert(0, (char)('A' + modulo - 1));
            columnNumber -= modulo;
            columnNumber /= 26;
        }

        return sb.toString();
    }
}