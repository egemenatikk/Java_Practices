import java.io.*;
import java.util.*;
import java.lang.*;

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // initializing meetings 2d array storing both starting and ending time of meetings
        int[][] meetings = new int[n][2];
        
        // filling the 2d array for meetings
        for (int i = 0; i < n; i++) {
            meetings[i][0] = start[i];
            meetings[i][1] = end[i];
        }
        
        // sorting the meetings in the 2d array according to their ending times
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[1]));
        
        // initializing number of maximum meetings and end time of last selected meeting
        int numberOfMeetings = 1;
        int previousEndTime = meetings[0][1];
        
        // iterating through the 2d array
        for (int i = 1; i < n; i++) {
            
            // if starting time of current meeting is later than ending time of lastly selected meeting
            // increment number of meetings variable and update the ending time of lastly selected meeting
            if (meetings[i][0] > previousEndTime) {
                numberOfMeetings++;
                previousEndTime = meetings[i][1];
            }
        }
        
        return numberOfMeetings;
    }
}