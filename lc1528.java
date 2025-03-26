public class lc1528 {
    // 1528. Shuffle String
    public static void main(String[] args) {
        String s="codeleet";
        int indices[]={4,5,6,7,0,2,1,3};
        String []t=new String[indices.length];
        for (int i=0;i< indices.length;i++){
            t[indices[i]]= String.valueOf(s.charAt(i));
        }
        String ans="";
        for (int i=0;i<t.length;i++){
            ans=ans+t[i];
        }
        System.out.println(ans);
    }
}
