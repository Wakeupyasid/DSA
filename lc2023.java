public class lc2023 {
    // 2023. Number of Pairs of Strings With Concatenation Equal to Target
    public static void main(String[] args) {
        String nums[]={"777","7","77","77"};
        String target="7777";
        int ans=0;
        for (int i=0;i< nums.length;i++){
            for (int j=0;j< nums.length;j++){
                if (i!=j){
                    String k=nums[i]+nums[j];
                    if (k.equals(target)){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
