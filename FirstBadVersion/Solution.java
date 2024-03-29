/* The isBadVersion API is defined in the parent class VersionControl.
   boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            boolean isBadVersion = isBadVersion(mid);

            if (isBadVersion) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
