// Last updated: 8/11/2026, 2:16:13 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
      int d,d1,rev1=0,rev2=0;
      int n=num;
      while(n!=0){
        d=n%10;
        rev1=rev1*10+d;
        n=n/10;
        }
       while(rev1!=0){
        d1=rev1%10;
        rev2=rev2*10+d1;
        rev1=rev1/10;
        } 
        if(num==rev2)
        return true;
        else
        return false; 
    }
}