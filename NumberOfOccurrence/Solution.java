import java.util.*;
import java.io.*;

class Solution {
    int count(int[] arr, int n, int x) {
        int left = 0;
        int right = n - 1;

        // First, find the leftmost occurrence of x using binary search
        int leftIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                leftIndex = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // If x is not found, return 0
        if (leftIndex == -1) {
            return 0;
        }

        // Next, find the rightmost occurrence of x using binary search
        left = 0;
        right = n - 1;
        int rightIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                rightIndex = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Calculate the count of x by subtracting rightIndex and leftIndex
        return rightIndex - leftIndex + 1;
    }
}