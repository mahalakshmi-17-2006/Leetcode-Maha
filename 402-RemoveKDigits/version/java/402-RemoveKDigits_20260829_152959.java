// Last updated: 8/29/2026, 3:29:59 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3
4        Stack<Character> stack = new Stack<>();
5
6        for (char digit : num.toCharArray()) {
7            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
8                stack.pop();
9                k--;
10            }
11
12            stack.push(digit);
13        }
14        while (k > 0) {
15            stack.pop();
16            k--;
17        }
18
19        StringBuilder result = new StringBuilder();
20
21        boolean leadingZero = true;
22
23        for (char digit : stack) {
24            if (leadingZero && digit == '0') {
25                continue;
26            }
27
28            leadingZero = false;
29            result.append(digit);
30        }
31
32        return result.length() == 0 ? "0" : result.toString();
33    }
34}