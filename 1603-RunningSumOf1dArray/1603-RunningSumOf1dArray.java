// Last updated: 8/11/2026, 2:17:20 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int i,j,sum;
        for(i=0;i<n;i++){
            sum=0;
            for(j=0;j<=i;j++)
            sum+=nums[j];
            arr[i]=sum;
        }
        return arr;
    }
}