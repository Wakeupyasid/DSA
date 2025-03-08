import java.util.Stack;

public class lc2000 {
//    2000. Reverse Prefix of Word
    public static void main(String[] args) {
        String word="abcdefg";
        char ch='d';
        String res="";
        Stack<Character> a=new Stack<>();
        for (int i=0;i<word.length();i++){
            char t=word.charAt(i);
            a.push(t);
            if (t==ch){
                while (!a.isEmpty()){
                    res=res+a.pop();
                }
                res=res+word.substring(i+1,word.length());
                break;
            }
        }
        if (res.isEmpty()){
            res=word;
        }
        System.out.println(word);
        System.out.println(res);
    }
}
