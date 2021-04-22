package Leetcode.array;

public class Leetcode121 {
    public static void main(String[] args) {
        int[] prices={7,6,4,3,1};
        System.out.println(maxProfit2(prices));
    }

    //方法一：暴力解法(超时)
    public static int maxProfit(int[] prices) {
        int len = prices.length;
        //如果买入的股票时间在一天以内
        if (len < 2) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                //该算法复杂度太高
                //if (prices[i] < prices[j]) maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    //方法二：一次遍历
    public static int maxProfit2(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        //在遍历过程中，找出以当前时间卖出时的历史最低点，
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}
