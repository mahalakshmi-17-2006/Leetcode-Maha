// Last updated: 8/28/2026, 9:21:44 AM
1class Solution {
2    public boolean validateStackSequences(int[] pushed, int[] popped) {                
3        Stack<Integer> stack = new Stack<>();
4        int j = 0; 
5
6        for (int num : pushed) {
7            stack.push(num);
8            while (!stack.isEmpty() && j < popped.length 
9                   && stack.peek() == popped[j]) {
10                
11                stack.pop();
12                j++;
13            }
14        }
15        return j == popped.length;
16    }
17}