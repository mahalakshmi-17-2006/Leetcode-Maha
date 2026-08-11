// Last updated: 8/11/2026, 2:15:55 PM
class Solution {
    public int passThePillow(int n, int t) {
        int cycle=t/(n-1);
        int rs=t%(n-1);
        return cycle%2==0?rs+1:n-rs;
       
    }
}