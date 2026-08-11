// Last updated: 8/11/2026, 2:19:32 PM
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int temp[] = new int[n];
        int evenindex=0;
        int oddindex=1;
        for(int i : nums){
            if(i%2==0 ){
                temp[evenindex]= i;
                evenindex+=2;
            }
            else {
                temp[oddindex]= i;
                oddindex+=2;
            }

        }
        return temp;
    
    }
}