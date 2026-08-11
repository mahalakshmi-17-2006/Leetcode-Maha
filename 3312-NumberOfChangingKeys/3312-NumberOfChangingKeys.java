// Last updated: 8/11/2026, 2:14:43 PM
class Solution {
    public int countKeyChanges(String s) {
        String  lower = s.toLowerCase();
        int c=0;
        char[] a = lower.toCharArray();
            for(int i=0;i<a.length-1;i++){
                if(a[i]!=a[i+1]){
                    c++;
                }
            }
        return c;
    }
}