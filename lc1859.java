public class lc1859 {
    // 1859. Sorting the Sentence
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String k[]=s.split(" ");
        String p[]=new String[k.length];
        for (int i=0;i<k.length;i++){
            String v=k[i].substring(0,k[i].length()-1);
            String m= String.valueOf(k[i].charAt(k[i].length()-1));
            int n= Integer.parseInt(m);
            p[n-1]=v;
        }
        String ans="";
        for (int i=0;i<p.length-1;i++){
            ans=ans+p[i]+" ";
        }
        ans=ans+p[p.length-1];
        System.out.println(ans);
    }
}
