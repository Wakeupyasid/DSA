public class lc2185 {
//    2185. Counting Words With a Given Prefix
    public static void main(String[] args) {
        String []words={"pay","attention","practice","attend"};
        String pref="at";
        int c=0;
        for (int i=0;i< words.length;i++){
            if (words[i].length()>=pref.length()){
                String s=words[i].substring(0,pref.length());
                if (pref.equals(s)){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
