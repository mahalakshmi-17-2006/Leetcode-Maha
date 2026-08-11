// Last updated: 8/11/2026, 2:13:37 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double totalPrice = 0.0;
        int pindex=prices.length-1;
        int dindex = discounts.length-1;
        while(pindex >= 0 && dindex >=0){
            totalPrice += prices[pindex]*(100.0 - discounts[dindex])/100.0;
            pindex--;
            dindex--;
        }
        while(pindex >=0){
            totalPrice += prices[pindex];
            pindex--;
        }
        return totalPrice;
    }
}