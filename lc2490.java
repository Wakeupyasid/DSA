public class lc2490 {
    // 2490. Circular Sentence
    public static void main(String[] args) {
        String sentence = "leetcode exercises sound delightful";
        boolean ans=false;
        int s=0;
        int k=0;
        for (int i=1;i<sentence.length()-1;i++){
            if (sentence.charAt(i)==32){
                s++;
                if (sentence.charAt(i-1)==sentence.charAt(i+1)){
                    k++;
                }
            }
        }
        if (k==s){
            if (sentence.charAt(0)==sentence.charAt(sentence.length()-1)){
                ans=true;
            }
        }
        System.out.println(ans);
    }
}
