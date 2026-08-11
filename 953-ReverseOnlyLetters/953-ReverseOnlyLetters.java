// Last updated: 8/11/2026, 2:19:41 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a=s.toCharArray();
        int l=0;
        int r= a.length - 1;
        while(l < r){
            while(l < r && !Character.isLetter(a[l]))
            l++;
             while(l < r && !Character.isLetter(a[r]))
            r--;

            char t = a[l];
            a[l]=a[r];
            a[r]=t;

            l++;
            r--;
        }
        return new String(a);

    }
}