public class lc3340 {
    // 3340. Check Balanced String
    public static void main(String[] args) {
        String num = "24123";
        int e=0;
        int o=0;
        for (int i=0;i<num.length();i++){
            int k=Integer.parseInt(String.valueOf(num.charAt(i)));
            if (i%2==0){
                e=e+k;
            }
            else{
                o=o+k;
            }
        }
        boolean ans=true;
        if (e!=o){
            ans=false;
        }
        System.out.println(ans);
    }
}
