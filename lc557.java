public class lc557 {
    // 557. Reverse Words in a String III
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String[] f = s.split(" ");
        String ans="";
        for (int i=0;i<f.length;i++){
            StringBuilder k=new StringBuilder(f[i]);

            if (i!=f.length-1){
                ans=ans+k.reverse()+" ";
            }
            else{
                ans=ans+k.reverse();
            }
        }
        System.out.println(ans);
    }
}
