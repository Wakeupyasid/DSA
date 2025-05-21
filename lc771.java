public class lc771 {
    // 771. Jewels and Stones
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        int ans=0;
        for (int i=0;i<stones.length();i++){
            String s= String.valueOf(stones.charAt(i));
            if (jewels.contains(s)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
