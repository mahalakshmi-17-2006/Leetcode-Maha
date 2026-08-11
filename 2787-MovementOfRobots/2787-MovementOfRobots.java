// Last updated: 8/11/2026, 2:15:33 PM
class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        int n = nums.length;
        long MOD = 1000000007L;

        long[] pos = new long[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'L') {
                pos[i] = (long) nums[i] - d;
            } else {
                pos[i] = (long) nums[i] + d;
            }
        }

        Arrays.sort(pos);

        long ans = 0;
        long prefixSum = 0;

        for (int i = 0; i < n; i++) {            
            long contribution = (pos[i] * i - prefixSum) % MOD;

            ans = (ans + contribution) % MOD;

            prefixSum = (prefixSum + pos[i]) % MOD;
        }

        return (int) ans;
    }
}