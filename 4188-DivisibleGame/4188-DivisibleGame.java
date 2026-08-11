// Last updated: 8/11/2026, 2:14:27 PM
class Solution {
    public int divisibleGame(int[] nums) {
        int n=nums.length;
        long MOD = 1_000_000_007L;

        int maxVal =0;
        for(int num : nums){
            if(num > maxVal){
                maxVal = num;
            }
        }
        boolean[] hasDivisor = new boolean[maxVal + 2];
        for(int num : nums){
            for(int d=1;d*d <= num;d++){
                if(num % d == 0){
                    if(d>1) hasDivisor[d]=true;
                    if(num/d >1)hasDivisor[num/d]=true;
                }
            }
        }
        long defaultMax = Long.MIN_VALUE;
        long currentSum = 0;
        for(int num : nums){
            long val = -num;
            currentSum = Math.max(val,currentSum+val);
            defaultMax = Math.max(defaultMax , currentSum);
        }
        long maxScoreDiff = Long.MIN_VALUE;
        long bestK = -1;
        boolean defaultKFound = false;

        for(int k=2;k<= maxVal + 1; k++){
            long currentScore;
            if(hasDivisor[k]){
                long maxSubarray = Long.MIN_VALUE;
                long localSum = 0;
                for(int num : nums){
                    long val = (num % k ==0) ? num : -num;
                    localSum = Math.max(val,localSum + val);
                    maxSubarray=Math.max(maxSubarray,localSum);
                }
                currentScore = maxSubarray;
            }
                else{
                if(defaultKFound) continue;
                currentScore = defaultMax;
                defaultKFound = true;
                }
            if(currentScore > maxScoreDiff){
                maxScoreDiff = currentScore;
                bestK=k;
            }
            }
        long result = (maxScoreDiff% MOD) * (bestK % MOD ) % MOD;
        if(result < 0){
            result +=MOD;
        }
        return (int) result;
        
    }
}