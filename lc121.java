public class lc121 {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }
        System.out.println(maxProfit);
    }
}
