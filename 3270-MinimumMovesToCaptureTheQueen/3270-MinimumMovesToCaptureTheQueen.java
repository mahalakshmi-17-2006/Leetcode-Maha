// Last updated: 8/11/2026, 2:14:56 PM
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
         if (a == e) {
            if (!(c == a && between(d, b, f))) {
                return 1;
            }
        }
        if (b == f) {
            if (!(d == b && between(c, a, e))) {
                return 1;
            }
        }
        if (Math.abs(c - e) == Math.abs(d - f)) {
            if (!(Math.abs(a - c) == Math.abs(b - d) &&
                  between(a, c, e) &&
                  between(b, d, f))) {
                return 1;
            }
        }
        return 2;
    }
    private boolean between(int x, int y, int z) {
        return (x > Math.min(y, z) && x < Math.max(y, z));
    }
}