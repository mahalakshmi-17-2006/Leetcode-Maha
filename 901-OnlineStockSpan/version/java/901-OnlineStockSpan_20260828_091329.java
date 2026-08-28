// Last updated: 8/28/2026, 9:13:29 AM
1class StockSpanner {
2    private Stack<int[]> stack;
3
4    public StockSpanner() {
5        stack = new Stack<>();
6    }
7    
8    public int next(int price) {
9        int span = 1;
10        while (!stack.isEmpty() && stack.peek()[0] <= price) {
11            span += stack.pop()[1];
12        }
13        stack.push(new int[]{price, span});
14
15        return span;
16    }
17}
18
19/**
20 * Your StockSpanner object will be instantiated and called as such:
21 * StockSpanner obj = new StockSpanner();
22 * int param_1 = obj.next(price);
23 */