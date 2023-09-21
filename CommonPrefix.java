
public class CommonPrefix {
	
	public static void main(String[] args) {
		String[] wordArray = {"teaching", "teacher", "tea", "hotel"};
		System.out.println(longestCommonPrefix(wordArray));
	}
	
	/*
	 * This program takes a string array, then finds the common character sequence of the words inside that array
	 * 
	 * Examples: 
	 * 
	 * Input 1: {"teaching", "teacher", "tea", "hotel", "peach"}
	 * Output 1: "e"
	 * 
	 * Input 2: {"teaching", "teacher", "tea", "hotel"}
	 * Output 2: "te
	 * */
	
	public static String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0)
            return "";
        
        int indexOfFirstShortestWord = 0;
        String commonPrefix = strs[0];
        for (int i = 1; i < strs.length ; i++) {
            if (strs[i].length() < commonPrefix.length()) {
                commonPrefix = strs[i];
                indexOfFirstShortestWord = i;
            }
        }
        
        return longestCommonPrefix(strs, commonPrefix, 0, indexOfFirstShortestWord);
    }
    
    public static String longestCommonPrefix(String[] strs, String commonPrefix, int index, int skipIndex) {
        
        if (index == strs.length) {
            return commonPrefix;
        }
        
        if (index == skipIndex || strs[index].contains(commonPrefix)) {
            return longestCommonPrefix(strs, commonPrefix, index+1, skipIndex);
        }
        
        if (longestCommonPrefix(strs, commonPrefix.substring(0, commonPrefix.length() - 1), index, skipIndex).length() >= longestCommonPrefix(strs, commonPrefix.substring(1), index, skipIndex).length()) {
            return longestCommonPrefix(strs, commonPrefix.substring(0, commonPrefix.length() - 1), index, skipIndex);
        } else {
            return longestCommonPrefix(strs, commonPrefix.substring(1), index, skipIndex);
        }
    }

}
