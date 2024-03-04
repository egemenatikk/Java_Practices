class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        
        int len = str1.length();
        
        if (str2.length() != len || len < 2) return false;
        
        boolean clockwiseCont = true;
        boolean antiClockwiseCont = true;
        
        int clockwiseIndex = 2;
        int antiClockwiseIndex = -2;
        
        for (int i = 0; i < len; i++) {
            
            if (!clockwiseCont && !antiClockwiseCont) break;
            
            if (clockwiseCont) {
                int tempClockwiseIndex = clockwiseIndex + i;
                if (tempClockwiseIndex >= len) tempClockwiseIndex %= len;
                if (str2.charAt(tempClockwiseIndex) != str1.charAt(i)) clockwiseCont = false;
            }
            
            if (antiClockwiseCont) {
                int tempAntiClockwiseIndex = antiClockwiseIndex + i;
                if (tempAntiClockwiseIndex < 0) tempAntiClockwiseIndex += len;
                if (str2.charAt(tempAntiClockwiseIndex) != str1.charAt(i)) antiClockwiseCont = false;
            }
        }
        
        return clockwiseCont || antiClockwiseCont;
    }
    
}