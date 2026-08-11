// Last updated: 8/11/2026, 2:17:23 PM
class Solution {
    public int maxPower(String s) {
        int count=1;
        int max=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==s.charAt(i))
            count++;
            else
            count=1;

            max = Math.max(max, count);
        }
        return max;
    }
}