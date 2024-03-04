class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pascalTriangleRow = new ArrayList<>();
        Map<String, Integer> memoMap = new HashMap<>();
        for (int i = 0; i <= rowIndex; i++) {
            pascalTriangleRow.add(findCellValue(i, rowIndex, memoMap));
        }
        return pascalTriangleRow;
    }

    private int findCellValue(int x, int y, Map<String, Integer> memoMap) {
        if (x == 0 || x == y) return 1;
        String currentCell = "" + x + ", " + y;
        if (memoMap.containsKey(currentCell)) return memoMap.get(currentCell);
        int currentCellValue = findCellValue(x - 1, y - 1, memoMap) + findCellValue(x, y - 1, memoMap);
        memoMap.put(currentCell, currentCellValue);
        return currentCellValue;
    }
    
}