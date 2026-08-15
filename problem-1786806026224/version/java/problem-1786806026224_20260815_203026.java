// Last updated: 8/15/2026, 8:30:26 PM
1class Solution {
2    public int minOperations(String s) {
3        int n=s.length();
4        int minOps = Integer.MAX_VALUE;
5
6        for(int r=0;r<n;r++){
7            int ops=r;
8            for(int i=0;i<n/2;i++){
9                char c1=s.charAt((i+r)%n);
10                char c2=s.charAt((n-1-i+r)%n);
11                int d1=(c2-c1+26)%26;
12                int d2 = (c1-c2+26)%26;
13                ops+=Math.min(d1,d2);
14            }
15            minOps = Math.min(minOps,ops);
16        }
17        return minOps;
18    }
19}