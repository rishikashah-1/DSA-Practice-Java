/*
Problem: Best Time to Buy and Sell Stock
Platform: LeetCode
Level:Easy
Approach: Greedy Search 
Time Complexity: O(n)

*/

class Solution {
    public int maxProfit(int[] prices) {
        int min_price=prices[0];
        int Index = 0;
        int max_profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min_price){
                min_price=prices[i];
                Index=i;
            }
            int profit=prices[i]-min_price;
            if(profit>max_profit){
                max_profit=profit;
            }
        }
        return max_profit;    
}
}
