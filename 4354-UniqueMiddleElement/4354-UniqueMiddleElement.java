// Last updated: 8/11/2026, 2:13:57 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int l=nums.length;
        int n=l/2;
        int c=0;
        for(int i=0;i<l;i++){
            if(nums[n]==nums[i]){
                c++;
            }
        }
        if(c==1)return true;
        return false;
    }
}