// Last updated: 8/28/2026, 9:27:36 AM
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> stack = new Stack<>();
4
5        int num = 0;
6        char operator = '+';
7
8        for (int i = 0; i < s.length(); i++) {
9            char ch = s.charAt(i);
10            if (Character.isDigit(ch)) {
11                num = num * 10 + (ch - '0');
12            }
13            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
14
15                switch (operator) {
16                    case '+':
17                        stack.push(num);
18                        break;
19
20                    case '-':
21                        stack.push(-num);
22                        break;
23
24                    case '*':
25                        stack.push(stack.pop() * num);
26                        break;
27
28                    case '/':
29                        stack.push(stack.pop() / num);
30                        break;
31                }
32
33                operator = ch;
34                num = 0;
35            }
36        }
37
38        int result = 0;
39
40        while (!stack.isEmpty()) {
41            result += stack.pop();
42        }
43
44        return result;
45    }
46}