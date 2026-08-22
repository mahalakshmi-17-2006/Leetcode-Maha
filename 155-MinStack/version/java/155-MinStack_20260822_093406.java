// Last updated: 8/22/2026, 9:34:06 AM
1class MinStack {
2    Stack<Integer> stack;
3    Stack<Integer> minStack;
4
5    public MinStack() {
6        stack = new Stack<>();
7        minStack = new Stack<>(); 
8    }
9    
10    public void push(int val) {
11        stack.push(val);
12        if (minStack.isEmpty()) {
13            minStack.push(val);
14        } else {
15            minStack.push(Math.min(val, minStack.peek()));
16        }
17    }
18    
19    public void pop() {
20       stack.pop();
21       minStack.pop();
22 
23    }
24    
25    public int top() {
26        return stack.peek();
27    }
28    
29    public int getMin() {
30        return minStack.peek();
31    }
32}
33
34/**
35 * Your MinStack object will be instantiated and called as such:
36 * MinStack obj = new MinStack();
37 * obj.push(value);
38 * obj.pop();
39 * int param_3 = obj.top();
40 * int param_4 = obj.getMin();
41 */