// Last updated: 8/11/2026, 2:19:19 PM
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n=arr.length;
        if(n==1)
        return 1;
        int max=1;
        int curr=1;
        int prevsign=0;
        
        for(int i=1;i<n;i++){
            int currsign=0;
            if(arr[i-1]>arr[i])
             currsign=1;
            else if(arr[i-1]<arr[i])
            currsign=-1;
       
        if(currsign==0)
        curr=1;
        else if(prevsign==0 || currsign!=prevsign)
        curr++;
        else 
        curr=2;
        max = Math.max(max, curr);
        prevsign = currsign;
        }
        return max;
    }
}