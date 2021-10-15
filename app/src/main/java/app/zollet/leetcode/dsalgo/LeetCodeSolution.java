package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {


    public void execute() {

        int s = maxProfit(new int[]{1, 2, 4});
    }

    public int maxProfit(int[] prices) {

        int buy = -prices[0];
        int sell = 0;
        int prevBuy = 0;
        int prevSell = 0;

        for (int i = 0; i < prices.length; i++) {
            prevBuy = buy;
            buy = Math.max(prevSell - prices[i], buy);
            prevSell = sell;
            sell = Math.max(prevBuy + prices[i], sell);
        }
        return sell;
    }

}