// Last updated: 8/11/2026, 2:15:58 PM
class Solution {
    public int numberOfCuts(int n) {
        int c;
        if(n==1)
        c=0;
        else if(n%2==0)
        c=n/2;
        else
        c=n;
        return c;  
    }
}