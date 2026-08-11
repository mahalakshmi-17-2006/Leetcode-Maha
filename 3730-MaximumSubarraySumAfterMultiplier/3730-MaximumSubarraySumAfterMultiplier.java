// Last updated: 8/11/2026, 2:14:40 PM
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        
        long INF =Long.MIN_VALUE / 4;
        long a=INF , b=INF,c=INF,d=INF,e=INF,ans=INF;
        for(int x:nums){
            long m=1L * x * k;
            long v =x >= 0 ? x / k : -((-x)/k);
            long na = Math.max(a+x,x);
            long nb = Math.max(Math.max(a+m,m),b+m);
            long nc = Math.max(Math.max(a+v,v),c+v);
            long nd = Math.max(Math.max(d+x,b+x),x);
            long ne = Math.max(Math.max(e+x,c+x),x);
            a=na;
            b=nb;
            c=nc;
            d=nd;
            e=ne;
            ans = Math.max(ans,Math.max(Math.max(a,b),Math.max(c,Math.max(d,e))));
        }
        return ans;
    }
}