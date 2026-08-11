// Last updated: 8/11/2026, 2:13:40 PM
class Solution {
    public long maximumValue(int n, int s, int m) {
        long peak = n/2;
        if(peak == 0){
            return s;
        }
        return s+m+(peak-1) *(m-1);
    }
}