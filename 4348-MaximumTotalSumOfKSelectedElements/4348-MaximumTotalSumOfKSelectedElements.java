// Last updated: 8/11/2026, 2:14:08 PM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        long sum=0;
        for(int i=n-1;i>=n-k;i--){
            if(mul>1)
            sum+=(long)nums[i]*mul;
            
           else
                sum+=nums[i];
            mul--;
        }
        return sum;
        
        
        
    }
}