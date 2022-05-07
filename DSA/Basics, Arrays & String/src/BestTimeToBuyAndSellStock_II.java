public class BestTimeToBuyAndSellStock_II {
    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(a));
    }

    public static int maxProfit(int[] prices) {
        int profit =0,sum= 0;
        for (int i = 1; i < prices.length; i++) {
            sum = prices[i] > prices[i - 1] ? prices[i] - prices[i - 1] : 0;
            profit+=sum;
        }
        return profit;
    }
}
