class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersectSet = new HashSet<>();
        ArrayList<Integer> intersectList = new ArrayList<>();

        for (Integer num : nums1) {
            if (intersectSet.contains(num)) continue;
            intersectSet.add(num);
        }

        for (Integer num : nums2) {
            if (intersectSet.contains(num)) {
                intersectList.add(num);
                intersectSet.remove(num);
            }
        }

        Integer[] temp = intersectList.toArray(new Integer[intersectList.size()]);
        int[] result = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}