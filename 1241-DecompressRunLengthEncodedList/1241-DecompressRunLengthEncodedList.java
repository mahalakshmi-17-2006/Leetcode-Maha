// Last updated: 8/11/2026, 2:18:34 PM
class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        int n1=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                n1+=nums[i];
            }
        }
        int[] ans = new int[n1];
        int index=0;

        for(int i=0;i<n;i+=2){
            int freq = nums[i];
            int val=nums[i+1];
            
            for(int j=0;j<freq ;j++){
                ans[index]=val;
                index++;
            }
        }
        return ans;

    }
}