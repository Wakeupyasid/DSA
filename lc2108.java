public class lc2108 {
//    2108. Find First Palindromic String in the Array
    public static void main(String[] args) {
        String words[]={"def","ghi"};
        String ans="";
        for (int i=0;i< words.length;i++){
            if (words[i].charAt(0)==words[i].charAt(words[i].length()-1)){
                StringBuilder a = new StringBuilder(words[i]);
                a.reverse();
                if (words[i].equals(a.toString())){
                    ans=words[i];
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
