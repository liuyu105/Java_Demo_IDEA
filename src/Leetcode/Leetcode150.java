package Leetcode;

public class Leetcode150 {

	public static void main(String[] args) {
		int[] nums = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(nums));

	}
	public static int  maxProfit(int[] prices) {
	    int max = 0;
        int size = prices.length;
        for (int i = 0; i < size - 1; ++i)
            if (prices[i] < prices[i + 1])
                max += prices[i + 1] - prices[i];
        return max;
		
	}
}
