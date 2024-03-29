/*
 *122. Best Time to Buy and Sell Stock II
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day. 
 * Find and return the maximum profit you can achieve. 
 */

package BestTimetoBuyAndSellStockII;

public class BestTimetoBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int buy = 0, sell = 0;

            while (i < prices.length - 1 && prices[i] > prices[i + 1]) {
                i++;
            }
            buy = prices[i];

            while (i < prices.length - 1 && prices[i] < prices[i + 1]) {
                i++;
            }
            sell = prices[i];

            profit += sell - buy;
        }

        return profit;

    }
}
