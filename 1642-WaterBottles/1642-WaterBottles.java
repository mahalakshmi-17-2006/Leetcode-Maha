// Last updated: 8/11/2026, 2:17:16 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles;
        int empty = numBottles;
        
        while (empty >= numExchange) {
            int newFull = empty / numExchange;
            totalDrank += newFull;
            empty = empty % numExchange + newFull;
        }
        
        return totalDrank;
    }
}
