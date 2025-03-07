public class lc1672 {
//    1672. Richest Customer Wealth
    public static void main(String[] args) {
        int accounts[][]={{1,2,3},{3,2,1}};
        int ans=0;
        for (int i=0;i<accounts.length;i++){
            int t=0;
            for (int j=0;j< accounts[i].length;j++){
                t=t+accounts[i][j];
            }
            ans=Math.max(ans,t);
        }
        System.out.println(ans);
    }
}
