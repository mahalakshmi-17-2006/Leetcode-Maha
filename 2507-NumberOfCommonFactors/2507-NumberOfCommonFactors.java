// Last updated: 8/11/2026, 2:16:03 PM
class Solution {
    public int commonFactors(int a, int b) {
        int n,c=0;
        if(a>b)
        n=b;
        else
        n=a;
        for(int i=1;i<=n;i++){
            if(a%i==0&&b%i==0){
                c++;
            }
        }
        return c; 
    }
}