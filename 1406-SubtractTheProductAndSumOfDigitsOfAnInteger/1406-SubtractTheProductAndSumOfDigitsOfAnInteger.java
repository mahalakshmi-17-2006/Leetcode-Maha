// Last updated: 8/11/2026, 2:18:04 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int d,p=1,s=0;
        while(n!=0){
            d=n%10;
            p*=d;
            s+=d;
            n/=10;
        }
        return p-s;
    }
}