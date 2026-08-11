// Last updated: 8/11/2026, 2:19:15 PM
class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
                Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> diag = new HashMap<>();
        Map<Integer, Integer> anti = new HashMap<>();

        Set<Long> set = new HashSet<>();

        for (int[] l : lamps) {
            int r = l[0], c = l[1];
            long key = ((long) r << 32) | c;

            if (!set.add(key)) continue;

            row.put(r, row.getOrDefault(r, 0) + 1);
            col.put(c, col.getOrDefault(c, 0) + 1);
            diag.put(r - c, diag.getOrDefault(r - c, 0) + 1);
            anti.put(r + c, anti.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int r = queries[i][0];
            int c = queries[i][1];

            ans[i] = (row.getOrDefault(r, 0) > 0 ||
                      col.getOrDefault(c, 0) > 0 ||
                      diag.getOrDefault(r - c, 0) > 0 ||
                      anti.getOrDefault(r + c, 0) > 0) ? 1 : 0;

            for (int x = r - 1; x <= r + 1; x++) {
                for (int y = c - 1; y <= c + 1; y++) {

                    if (x < 0 || x >= n || y < 0 || y >= n)
                        continue;

                    long key = ((long) x << 32) | y;

                    if (set.remove(key)) {
                        row.put(x, row.get(x) - 1);
                        col.put(y, col.get(y) - 1);
                        diag.put(x - y, diag.get(x - y) - 1);
                        anti.put(x + y, anti.get(x + y) - 1);
                    }
                }
            }
        }
        return ans;
    }
}