// Last updated: 8/11/2026, 2:13:54 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum = 0;
        for(int num : nums){
            int temp = num;
            int max=0,min=9;
            while(temp>0){
                int digit = temp % 10;
                if(digit > max) max = digit;
                if(digit < min ) min =digit;
                temp /= 10;
            }
            int range = max-min;
            if(range > maxRange){
                maxRange = range;
            }
        }
        for(int num : nums){
            int temp = num;
            int max=0,min=9;
            while (temp > 0){
                int digit = temp % 10;
                if(digit > max) max=digit;
                if(digit < min)min=digit;
                temp/=10;
            }
            if(max-min == maxRange ){
                sum +=num;
            }
        }
        return sum;
    }
}