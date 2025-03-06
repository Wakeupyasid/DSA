public class lc1662 {
//    1662. Check If Two String Arrays are Equivalent
    public static void main(String[] args) {
        String word1[]={"abc", "d", "defg"};
        String word2[]={"abcddefg"};
        String a="";
        String b="";
        for (int i=0;i< word1.length;i++){
            a=a+word1[i];
        }
        for (int i=0;i< word2.length;i++){
            b=b+word2[i];
        }
        boolean ans=false;
        if (a.equals(b)){
            ans=true;
        }
        System.out.println(ans);
    }
}
