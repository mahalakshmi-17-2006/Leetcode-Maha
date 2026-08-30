// Last updated: 8/30/2026, 10:44:09 AM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int low = 1; int high = n; 
7        while (low < high) { 
8            int mid = low + (high - low) / 2;
9            if (isBadVersion(mid)) { 
10                high = mid; 
11            } 
12            else {
13                low = mid + 1; 
14                } 
15        } 
16        return low;
17    }
18}