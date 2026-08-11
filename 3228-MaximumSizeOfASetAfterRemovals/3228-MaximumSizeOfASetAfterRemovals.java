// Last updated: 8/11/2026, 2:15:14 PM
class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int limit = nums1.length / 2;

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            set2.add(x);
        }

        int keep1 = Math.min(set1.size(), limit);
        int keep2 = Math.min(set2.size(), limit);

        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        return Math.min(union.size(), keep1 + keep2);
    }
}