public class lc122 {
    // 122. Best Time to Buy and Sell Stock II
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int totalProfit = 0;
        for (int i = 1; i < prices.length; ++i) {
            int dailyProfit = Math.max(0, prices[i] - prices[i - 1]);
            totalProfit += dailyProfit;
        }
        System.out.println(totalProfit);
    }
}
