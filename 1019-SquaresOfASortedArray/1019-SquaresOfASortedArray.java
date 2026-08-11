// Last updated: 8/11/2026, 2:19:20 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]= nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}