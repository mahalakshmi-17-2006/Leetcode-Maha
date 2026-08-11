// Last updated: 8/11/2026, 2:14:15 PM
class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0;
        for(char ch : moves.toCharArray())
        {
            if(ch=='L') x--;
            else if(ch=='R') x++;
            else if(ch=='U') y++;
            else if(ch=='D') y--;
        }
        int blanks = 0;
        for(char ch : moves.toCharArray()){
            if(ch == '_') blanks++;
        }
        return Math.abs(x)+Math.abs(y)+blanks;
    }
}