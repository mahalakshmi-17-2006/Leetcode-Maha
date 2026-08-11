// Last updated: 8/11/2026, 2:17:56 PM
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
       while(num!=0){
        if(num%2==0)
        num=num/2;
        else
        num=num-1;
        c++;
       } 
       return c;
    }
}