// Last updated: 8/11/2026, 2:14:25 PM
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            long currentSum=0;
            for(int j=i;j<n;j++){
                currentSum+=nums[j];
                if(isValid(currentSum,x)){
                    count++;
                }
            }
        }
        return count;
    }
    private boolean isValid(long sum,int x){
        long absSum = Math.abs(sum);
        long lastDigit = absSum % 10;
        if(lastDigit != x){
            return false;
        }
        long firstDigit = absSum;
        while(firstDigit >= 10){
            firstDigit /= 10;
        }
        return firstDigit == x;
    }
}